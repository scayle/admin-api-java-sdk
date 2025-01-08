package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum VoucherConstraintsApplicationsRestriction {
    @SerializedName("customer")
    VALUE_CUSTOMER("customer"),

    @SerializedName("order")
    VALUE_ORDER("order");


    private final String val;

    VoucherConstraintsApplicationsRestriction(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}