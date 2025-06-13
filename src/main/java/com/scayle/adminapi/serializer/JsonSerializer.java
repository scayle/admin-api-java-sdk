package com.scayle.adminapi.serializer;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import com.scayle.adminapi.model.ApiCollection;
import com.scayle.adminapi.model.AbstractModel;
import com.scayle.adminapi.polymorphism.Polymorphic;
import com.scayle.adminapi.polymorphism.PolymorphicAdapter;
import com.scayle.adminapi.polymorphism.PolymorphicInterface;
import com.scayle.adminapi.polymorphism.PolymorphicMapping;

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
        Gson gson = this.createGson(clazz);
        Type listType = getType(List.class, clazz);

        return (List<T>)(gson.fromJson(json, listType));
    }

    public String serializeApiObject(Object apiObject) {
        Gson gson = new GsonBuilder()
            .registerTypeAdapterFactory(new ExplicitNullTypeAdapterFactory())
            .registerTypeAdapter(Instant.class, new InstantTimeSerializer())
            .serializeNulls()
            .create();

        return gson.toJson(apiObject);
    }

    private <T> Gson createGson(Class<T> modelClass) {
        GsonBuilder gsonBuilder = new GsonBuilder()
            .registerTypeAdapterFactory(new ExplicitNullTypeAdapterFactory())
            // Dont cast int/long to doubles
            .registerTypeAdapter(new TypeToken<Map <String, Object>>(){}.getType(),  new MapNumberAdapter())
            // Register custom date deserializer
            .registerTypeAdapter(Instant.class, new InstantTimeDeserializer());

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

    /**
     * This adapter ensures that fields explicitly set to null are handled correctly
     * during both serialization and deserialization.
     *
     * 1.  Deserialization (`read`): When an object is created from JSON, this adapter
     *     inspects the incoming JSON. If a field is explicitly `null` in the JSON,
     *     it calls the model's `setNull()` method to track it.
     * 2.  Serialization (`write`): When an object is converted to JSON, this adapter
     *     first uses Gson's default serialization. Then, it removes any null fields that
     *     were not tracked as explicitly null (via the `getExplicitlyNullFields()` method).
     */
    private static class ExplicitNullTypeAdapterFactory implements TypeAdapterFactory {
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            // Get the delegate adapter for this type. This is crucial to avoid recursion.
            // The delegate represents the default behavior Gson would have used without this factory.
            final TypeAdapter<T> delegate = gson.getDelegateAdapter(this, type);
            // Get an adapter for JsonElement to read/write the JSON tree.
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);

            return new TypeAdapter<T>() {
                /**
                 * Handles serializing the object to JSON.
                 */
                @Override
                public void write(JsonWriter out, T value) throws IOException {
                    // Let the delegate adapter serialize the object to a JsonElement first.
                    // This call uses field reflection and does NOT call your setters.
                    JsonElement tree = delegate.toJsonTree(value);

                    // Now, perform the custom logic on the resulting JsonElement.
                    if (tree.isJsonObject()) {
                        JsonObject jsonObject = tree.getAsJsonObject();
                        // Because our custom `read` method populates the null fields,
                        // this set will now contain the correct information.
                        Set<String> explicitlyNullFields = value instanceof AbstractModel
                            ? ((AbstractModel) value).getExplicitlyNullFields()
                            : Collections.emptySet();

                        // Create a list of keys to remove to avoid ConcurrentModificationException.
                        // We iterate over a copy of the key set.
                        Set<String> keys = jsonObject.keySet();
                        List<String> keysToRemove = new ArrayList<>();

                        for (String key : keys) {
                            JsonElement element = jsonObject.get(key);

                            // Check if the property's value is JSON null.
                            if (element.isJsonNull()) {
                                // If it's null, check if it was *explicitly* set to null.
                                // If not, mark it for removal.
                                if (! explicitlyNullFields.contains(key)) {
                                    keysToRemove.add(key);
                                }
                            }
                        }

                        // Now, remove all the keys that were marked for removal.
                        for (String key : keysToRemove) {
                            jsonObject.remove(key);
                        }
                    }

                    // Write the modified JsonElement to the output stream.
                    elementAdapter.write(out, tree);
                }

                /**
                 * Handles deserializing JSON into an object.
                 */
                @Override
                public T read(JsonReader in) throws IOException {
                    // First, parse the incoming JSON into a JsonElement tree.
                    JsonElement tree = elementAdapter.read(in);

                    // Let the delegate handle the default deserialization.
                    // This creates the POJO and sets all non-null fields.
                    T pojo = delegate.fromJsonTree(tree);

                    // Now, check if the incoming JSON had any explicit nulls
                    // and update our POJO's tracking list.
                    if (pojo instanceof AbstractModel && tree.isJsonObject()) {
                        AbstractModel model = (AbstractModel) pojo;
                        JsonObject jsonObject = tree.getAsJsonObject();

                        // Iterate over all entries in the original JSON object
                        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                            // If the value for a field was JSON null, track it.
                            if (entry.getValue().isJsonNull()) {
                                model.setNull(entry.getKey());
                            }
                        }
                    }

                    return pojo;
                }
            }.nullSafe(); // Use nullSafe() to handle null objects gracefully.
        }
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