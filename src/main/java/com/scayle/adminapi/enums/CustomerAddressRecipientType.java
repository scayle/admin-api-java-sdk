package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum CustomerAddressRecipientType {
    @SerializedName("personal")
    VALUE_PERSONAL("personal"),

    @SerializedName("retail")
    VALUE_RETAIL("retail"),

    @SerializedName("organization")
    VALUE_ORGANIZATION("organization"),

    @SerializedName("family")
    VALUE_FAMILY("family");


    private final String val;

    CustomerAddressRecipientType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}