package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum VoucherCriteriaKeyType {
    @SerializedName("include")
    VALUE_INCLUDE("include"),

    @SerializedName("exclude")
    VALUE_EXCLUDE("exclude");


    private final String val;

    VoucherCriteriaKeyType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}