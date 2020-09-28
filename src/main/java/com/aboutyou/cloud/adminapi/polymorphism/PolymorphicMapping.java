package com.aboutyou.cloud.adminapi.polymorphism;

import java.util.HashMap;
import java.util.Map;

public final class PolymorphicMapping {
    private final String discriminator;
    private final Map<String, String> mapping;

    public PolymorphicMapping(String discriminator) {
        this.discriminator = discriminator;
        this.mapping = new HashMap<>();
    }

    public String getDiscriminator() {
        return this.discriminator;
    }

    public void addMapping(String discriminatorValue, String className) {
        this.mapping.put(discriminatorValue, className);
    }

    public Map<String, String> getMapping() {
        return this.mapping;
    }
}
