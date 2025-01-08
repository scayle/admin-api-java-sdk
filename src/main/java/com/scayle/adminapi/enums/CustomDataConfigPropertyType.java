package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum CustomDataConfigPropertyType {
    @SerializedName("string")
    VALUE_STRING("string"),

    @SerializedName("number")
    VALUE_NUMBER("number"),

    @SerializedName("boolean")
    VALUE_BOOLEAN("boolean"),

    @SerializedName("json")
    VALUE_JSON("json");


    private final String val;

    CustomDataConfigPropertyType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}