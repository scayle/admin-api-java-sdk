package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum CustomerPasswordHashingType {
    @SerializedName("internal")
    VALUE_INTERNAL("internal"),

    @SerializedName("external")
    VALUE_EXTERNAL("external"),

    @SerializedName("salesforce")
    VALUE_SALESFORCE("salesforce");


    private final String val;

    CustomerPasswordHashingType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}