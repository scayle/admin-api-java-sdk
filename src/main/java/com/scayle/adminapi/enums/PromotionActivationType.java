package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum PromotionActivationType {
    @SerializedName("automatic")
    VALUE_AUTOMATIC("automatic"),

    @SerializedName("code")
    VALUE_CODE("code");


    private final String val;

    PromotionActivationType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}