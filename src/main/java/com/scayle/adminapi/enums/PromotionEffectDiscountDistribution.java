package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum PromotionEffectDiscountDistribution {
    @SerializedName("none")
    VALUE_NONE("none"),

    @SerializedName("pro_rata")
    VALUE_PRO_RATA("pro_rata");


    private final String val;

    PromotionEffectDiscountDistribution(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}