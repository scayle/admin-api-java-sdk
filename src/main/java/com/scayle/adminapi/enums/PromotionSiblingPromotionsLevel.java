package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum PromotionSiblingPromotionsLevel {
    @SerializedName("basket")
    VALUE_BASKET("basket");


    private final String val;

    PromotionSiblingPromotionsLevel(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}