package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum ProductQualityScoreStatus {
    @SerializedName("complete")
    VALUE_COMPLETE("complete"),

    @SerializedName("partly_complete")
    VALUE_PARTLY_COMPLETE("partly_complete"),

    @SerializedName("missing")
    VALUE_MISSING("missing");


    private final String val;

    ProductQualityScoreStatus(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}