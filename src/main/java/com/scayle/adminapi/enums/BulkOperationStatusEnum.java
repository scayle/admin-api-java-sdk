package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum BulkOperationStatusEnum {
    @SerializedName("new")
    VALUE_NEW("new"),

    @SerializedName("processing")
    VALUE_PROCESSING("processing"),

    @SerializedName("processed")
    VALUE_PROCESSED("processed"),

    @SerializedName("failed")
    VALUE_FAILED("failed");


    private final String val;

    BulkOperationStatusEnum(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}