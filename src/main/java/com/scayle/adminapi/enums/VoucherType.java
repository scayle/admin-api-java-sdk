package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum VoucherType {
    @SerializedName("absolute")
    VALUE_ABSOLUTE("absolute"),

    @SerializedName("relative")
    VALUE_RELATIVE("relative");


    private final String val;

    VoucherType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}