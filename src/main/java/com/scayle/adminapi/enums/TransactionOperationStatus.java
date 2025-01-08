package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum TransactionOperationStatus {
    @SerializedName("successful")
    VALUE_SUCCESSFUL("successful"),

    @SerializedName("failed")
    VALUE_FAILED("failed");


    private final String val;

    TransactionOperationStatus(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}