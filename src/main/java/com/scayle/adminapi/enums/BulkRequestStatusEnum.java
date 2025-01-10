package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum BulkRequestStatusEnum {
    @SerializedName("new")
    VALUE_NEW("new"),

    @SerializedName("pending")
    VALUE_PENDING("pending"),

    @SerializedName("processing")
    VALUE_PROCESSING("processing"),

    @SerializedName("processed")
    VALUE_PROCESSED("processed"),

    @SerializedName("failed")
    VALUE_FAILED("failed"),

    @SerializedName("cancelled")
    VALUE_CANCELLED("cancelled"),

    @SerializedName("aborted")
    VALUE_ABORTED("aborted");


    private final String val;

    BulkRequestStatusEnum(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}