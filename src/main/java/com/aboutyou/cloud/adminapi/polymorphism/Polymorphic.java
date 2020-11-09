package com.aboutyou.cloud.adminapi.polymorphism;

import java.util.HashMap;
import java.util.Map;


public final class Polymorphic {
    private Map<Class<?>, Map<Class<?>, PolymorphicMapping>> polymorphic;

    public Polymorphic() {
        this.polymorphic = new HashMap<>();
        this.addMappings();
    }

    private void addMappings() {
        // Generated
    }

    private void addMapping(Class<?> modelClass, Class<?> interfaceClass, String discriminator, String discriminatorValue, String concreteClassname) {
        if (!this.polymorphic.containsKey(modelClass)) {
            PolymorphicMapping polymorphicMapping = new PolymorphicMapping(discriminator);

            HashMap<Class<?>, PolymorphicMapping> interfaceMapping = new HashMap<>();
            interfaceMapping.put(interfaceClass, polymorphicMapping);

            this.polymorphic.put(modelClass, interfaceMapping);
        }

        this.polymorphic.get(modelClass).get(interfaceClass).addMapping(discriminatorValue, concreteClassname);
    }

    public Map<Class<?>, PolymorphicMapping> getMappingForClass(Class<?> className) {
        return this.polymorphic.get(className);
    }

    public boolean hasClassMapping(Class<?> className) {
        return this.polymorphic.containsKey(className);
    }
}
