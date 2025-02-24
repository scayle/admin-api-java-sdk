package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum PromotionEffectBuyXGetYDiscountType {
    @SerializedName("absolute")
    VALUE_ABSOLUTE("absolute"),

    @SerializedName("relative")
    VALUE_RELATIVE("relative");


    private final String val;

    PromotionEffectBuyXGetYDiscountType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}