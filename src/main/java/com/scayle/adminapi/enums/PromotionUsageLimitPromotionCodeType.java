package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum PromotionUsageLimitPromotionCodeType {
    @SerializedName("order")
    VALUE_ORDER("order"),

    @SerializedName("customer")
    VALUE_CUSTOMER("customer");


    private final String val;

    PromotionUsageLimitPromotionCodeType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}