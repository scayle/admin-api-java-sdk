package com.aboutyou.cloud.adminapi.serializer;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.List;
import java.lang.reflect.ParameterizedType;

import com.aboutyou.cloud.adminapi.model.ApiCollection;
import com.aboutyou.cloud.adminapi.polymorphism.Polymorphic;
import com.aboutyou.cloud.adminapi.polymorphism.PolymorphicAdapter;
import com.aboutyou.cloud.adminapi.polymorphism.PolymorphicInterface;
import com.aboutyou.cloud.adminapi.polymorphism.PolymorphicMapping;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
        Gson gson = new Gson();

        return gson.toJson(apiObject);
    }

    private <T> Gson createGson(Class<T> modelClass) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        // Dont cast int/long to doubles
        gsonBuilder.registerTypeAdapter(new TypeToken<Map <String, Object>>(){}.getType(),  new MapNumberAdapter());

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
}
