package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum VoucherStatus {
    @SerializedName("active")
    VALUE_ACTIVE("active"),

    @SerializedName("inactive")
    VALUE_INACTIVE("inactive"),

    @SerializedName("pending-review")
    VALUE_PENDINGREVIEW("pending-review"),

    @SerializedName("archived")
    VALUE_ARCHIVED("archived");


    private final String val;

    VoucherStatus(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}