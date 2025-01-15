package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum CustomerAddressType {
    @SerializedName("shipping")
    VALUE_SHIPPING("shipping"),

    @SerializedName("billing")
    VALUE_BILLING("billing");


    private final String val;

    CustomerAddressType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}