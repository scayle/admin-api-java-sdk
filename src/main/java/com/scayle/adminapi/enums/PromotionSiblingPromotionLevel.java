package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum PromotionSiblingPromotionLevel {
    @SerializedName("basket")
    VALUE_BASKET("basket");


    private final String val;

    PromotionSiblingPromotionLevel(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}