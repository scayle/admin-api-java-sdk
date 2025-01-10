package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum BulkOperationMethod {
    @SerializedName("GET")
    VALUE_GET("GET"),

    @SerializedName("HEAD")
    VALUE_HEAD("HEAD"),

    @SerializedName("POST")
    VALUE_POST("POST"),

    @SerializedName("PUT")
    VALUE_PUT("PUT"),

    @SerializedName("PATCH")
    VALUE_PATCH("PATCH"),

    @SerializedName("DELETE")
    VALUE_DELETE("DELETE");


    private final String val;

    BulkOperationMethod(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}