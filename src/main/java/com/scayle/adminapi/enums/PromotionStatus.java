package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum PromotionStatus {
    @SerializedName("archived")
    VALUE_ARCHIVED("archived"),

    @SerializedName("inactive")
    VALUE_INACTIVE("inactive"),

    @SerializedName("active")
    VALUE_ACTIVE("active");


    private final String val;

    PromotionStatus(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}