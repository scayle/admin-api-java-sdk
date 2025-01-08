package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum PromotionEffectAutomationDiscountType {
    @SerializedName("relative")
    VALUE_RELATIVE("relative"),

    @SerializedName("absolute")
    VALUE_ABSOLUTE("absolute");


    private final String val;

    PromotionEffectAutomationDiscountType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}