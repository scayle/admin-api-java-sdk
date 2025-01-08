package com.scayle.adminapi.serializer;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import com.scayle.adminapi.model.ApiCollection;
import com.scayle.adminapi.polymorphism.Polymorphic;
import com.scayle.adminapi.polymorphism.PolymorphicAdapter;
import com.scayle.adminapi.polymorphism.PolymorphicInterface;
import com.scayle.adminapi.polymorphism.PolymorphicMapping;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonPrimitive;

public class JsonSerializer {

    private Polymorphic polymorphic;

    public JsonSerializer() {
        this.polymorphic = new Polymorphic();
    }

    public <T> T unserializeApiObject(String json, Class<T> modelClass) {
        Gson gson = this.createGson(modelClass);

        return (T)(gson.fromJson(json, modelClass));
    }

    public <T> ApiCollection<T> unserializeApiCollection(String json, Class<T> modelClass) {
        Gson gson = this.createGson(modelClass);

        return (ApiCollection<T>)(gson.fromJson(json, getType(ApiCollection.class, modelClass)));
    }

    public <T> T unserialize(String json, Class<T> clazz) {
        Gson gson = new Gson();

        return (T)(gson.fromJson(json, clazz));
    }

    public <T> List<T> unserializeList(String json, Class<T> clazz) {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<T>>(){}.getType();

        return (List<T>)(gson.fromJson(json, listType));
    }

    public String serializeApiObject(Object apiObject) {
        Gson gson = new GsonBuilder()
            .registerTypeAdapter(Instant.class, new InstantTimeSerializer())
            .create();

        return gson.toJson(apiObject);
    }

    private <T> Gson createGson(Class<T> modelClass) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        // Dont cast int/long to doubles
        gsonBuilder.registerTypeAdapter(new TypeToken<Map <String, Object>>(){}.getType(),  new MapNumberAdapter());

        // Register custom date deserializer
        gsonBuilder.registerTypeAdapter(Instant.class, new InstantTimeDeserializer());

        if (this.polymorphic.hasClassMapping(modelClass)) {
            for (Class<?> interfaceClass : this.polymorphic.getMappingForClass(modelClass).keySet()) {
                PolymorphicMapping mapping = this.polymorphic.getMappingForClass(modelClass).get(interfaceClass);
                gsonBuilder.registerTypeAdapter(interfaceClass, new PolymorphicAdapter<PolymorphicInterface>(mapping.getDiscriminator(), mapping.getMapping()));
            }
        }

        return gsonBuilder.create();
    }

    private Type getType(final Class<?> rawClass, final Class<?> parameterClass) {
        return new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() {
                return new Type[]{parameterClass};
            }

            @Override
            public Type getRawType() {
                return rawClass;
            }

            @Override
            public Type getOwnerType() {
                return null;
            }

        };
    }


    private static class InstantTimeDeserializer implements JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            return ZonedDateTime.parse(json.getAsString(), DateTimeFormatter.ISO_ZONED_DATE_TIME)
                .toInstant();
        }
    }

    private static class InstantTimeSerializer implements com.google.gson.JsonSerializer<Instant> {
        @Override
        public JsonElement serialize(Instant src, Type typeOfSrc, JsonSerializationContext context) {
            String formatted = ZonedDateTime.ofInstant(src, ZoneOffset.UTC)
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")) + "+00:00";

            return new JsonPrimitive(formatted);
       }
    }
}
