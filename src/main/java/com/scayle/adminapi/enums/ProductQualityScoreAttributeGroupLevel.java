package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum ProductQualityScoreAttributeGroupLevel {
    @SerializedName("product")
    VALUE_PRODUCT("product"),

    @SerializedName("variant")
    VALUE_VARIANT("variant"),

    @SerializedName("style")
    VALUE_STYLE("style"),

    @SerializedName("image")
    VALUE_IMAGE("image"),

    @SerializedName("video")
    VALUE_VIDEO("video");


    private final String val;

    ProductQualityScoreAttributeGroupLevel(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}