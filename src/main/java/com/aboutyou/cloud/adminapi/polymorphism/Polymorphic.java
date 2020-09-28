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
        this.addMapping(com.aboutyou.cloud.adminapi.model.Product.class, com.aboutyou.cloud.adminapi.model.AttributeInterface.class, "type", "simple", "com.aboutyou.cloud.adminapi.model.SimpleAttribute");
        this.addMapping(com.aboutyou.cloud.adminapi.model.Product.class, com.aboutyou.cloud.adminapi.model.AttributeInterface.class, "type", "simpleList", "com.aboutyou.cloud.adminapi.model.SimpleAttributeList");
        this.addMapping(com.aboutyou.cloud.adminapi.model.Product.class, com.aboutyou.cloud.adminapi.model.AttributeInterface.class, "type", "localizedString", "com.aboutyou.cloud.adminapi.model.LocalizedAttribute");
        this.addMapping(com.aboutyou.cloud.adminapi.model.Product.class, com.aboutyou.cloud.adminapi.model.AttributeInterface.class, "type", "localizedStringList", "com.aboutyou.cloud.adminapi.model.LocalizedAttributeList");
        this.addMapping(com.aboutyou.cloud.adminapi.model.Product.class, com.aboutyou.cloud.adminapi.model.AttributeInterface.class, "type", "advanced", "com.aboutyou.cloud.adminapi.model.AdvancedAttribute");
        this.addMapping(com.aboutyou.cloud.adminapi.model.Product.class, com.aboutyou.cloud.adminapi.model.AttributeInterface.class, "type", "advancedList", "com.aboutyou.cloud.adminapi.model.AdvancedAttributeList");
        this.addMapping(com.aboutyou.cloud.adminapi.model.ProductImage.class, com.aboutyou.cloud.adminapi.model.AttributeInterface.class, "type", "simple", "com.aboutyou.cloud.adminapi.model.SimpleAttribute");
        this.addMapping(com.aboutyou.cloud.adminapi.model.ProductImage.class, com.aboutyou.cloud.adminapi.model.AttributeInterface.class, "type", "simpleList", "com.aboutyou.cloud.adminapi.model.SimpleAttributeList");
        this.addMapping(com.aboutyou.cloud.adminapi.model.ProductVariant.class, com.aboutyou.cloud.adminapi.model.AttributeInterface.class, "type", "simple", "com.aboutyou.cloud.adminapi.model.SimpleAttribute");
        this.addMapping(com.aboutyou.cloud.adminapi.model.ProductVariant.class, com.aboutyou.cloud.adminapi.model.AttributeInterface.class, "type", "simpleList", "com.aboutyou.cloud.adminapi.model.SimpleAttributeList");
        this.addMapping(com.aboutyou.cloud.adminapi.model.ProductVariant.class, com.aboutyou.cloud.adminapi.model.AttributeInterface.class, "type", "localizedString", "com.aboutyou.cloud.adminapi.model.LocalizedAttribute");
        this.addMapping(com.aboutyou.cloud.adminapi.model.ProductVariant.class, com.aboutyou.cloud.adminapi.model.AttributeInterface.class, "type", "localizedStringList", "com.aboutyou.cloud.adminapi.model.LocalizedAttributeList");
        this.addMapping(com.aboutyou.cloud.adminapi.model.ProductVariant.class, com.aboutyou.cloud.adminapi.model.AttributeInterface.class, "type", "advanced", "com.aboutyou.cloud.adminapi.model.AdvancedAttribute");
        this.addMapping(com.aboutyou.cloud.adminapi.model.ProductVariant.class, com.aboutyou.cloud.adminapi.model.AttributeInterface.class, "type", "advancedList", "com.aboutyou.cloud.adminapi.model.AdvancedAttributeList");
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
