package com.scayle.adminapi.polymorphism;

import java.lang.reflect.Type;
import java.util.Map;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class PolymorphicAdapter<T>
    implements JsonSerializer<T>, JsonDeserializer<T> {

    private String discriminator;
    private Map<String, String> classMap;

    public PolymorphicAdapter(String discriminator, Map<String, String> classMap) {
        this.discriminator = discriminator;
        this.classMap = classMap;
    }

    @Override
    public T deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)  throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        String discriminatorValue = jsonObject.getAsJsonPrimitive(this.discriminator).getAsString();

        String modelName = this.classMap.get(discriminatorValue);

        try {
            Class<?> clazz = Class.forName(modelName);
            return context.deserialize(json, clazz);
        } catch (Exception e) {
            System.err.println("Error while deserializing: " + e.getMessage());
        }

        return null;
    }

    @Override
    public JsonElement serialize(T src, Type typeOfSrc, JsonSerializationContext context) {
        return context.serialize(src);
    }
}
