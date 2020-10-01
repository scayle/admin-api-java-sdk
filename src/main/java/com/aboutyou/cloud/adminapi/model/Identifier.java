package com.aboutyou.cloud.adminapi.model;

public class Identifier {
    private String identifier;

    private Identifier(String identifier) {
        this.identifier = identifier;
    }

    public static Identifier fromId(Integer id) {
        return new Identifier(Integer.toString(id));
    }

    public static Identifier fromKey(String referenceKey) {
        return new Identifier("key=" + referenceKey);
    }

    public String toString() {
        return this.identifier;
    }
}