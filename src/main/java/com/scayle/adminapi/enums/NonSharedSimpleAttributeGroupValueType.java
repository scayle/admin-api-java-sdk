package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum NonSharedSimpleAttributeGroupValueType {
    @SerializedName("text")
    VALUE_TEXT("text"),

    @SerializedName("longtext")
    VALUE_LONGTEXT("longtext"),

    @SerializedName("integer")
    VALUE_INTEGER("integer"),

    @SerializedName("date")
    VALUE_DATE("date"),

    @SerializedName("attribute")
    VALUE_ATTRIBUTE("attribute"),

    @SerializedName("attributeGroup")
    VALUE_ATTRIBUTEGROUP("attributeGroup");


    private final String val;

    NonSharedSimpleAttributeGroupValueType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}