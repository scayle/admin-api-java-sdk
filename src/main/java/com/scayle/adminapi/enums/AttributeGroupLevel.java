package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum AttributeGroupLevel {
    @SerializedName("master")
    VALUE_MASTER("master"),

    @SerializedName("product")
    VALUE_PRODUCT("product"),

    @SerializedName("variant")
    VALUE_VARIANT("variant"),

    @SerializedName("image")
    VALUE_IMAGE("image"),

    @SerializedName("brand")
    VALUE_BRAND("brand"),

    @SerializedName("category")
    VALUE_CATEGORY("category");


    private final String val;

    AttributeGroupLevel(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}