package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum BulkRequestCreationStatus {
    @SerializedName("complete")
    VALUE_COMPLETE("complete"),

    @SerializedName("incomplete")
    VALUE_INCOMPLETE("incomplete");


    private final String val;

    BulkRequestCreationStatus(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}