package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum PromotionEffectType {
    @SerializedName("buy_x_get_y")
    VALUE_BUY_X_GET_Y("buy_x_get_y"),

    @SerializedName("automatic_discount")
    VALUE_AUTOMATIC_DISCOUNT("automatic_discount");


    private final String val;

    PromotionEffectType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}