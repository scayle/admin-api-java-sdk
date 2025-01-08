package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum PromotionLevel {
    @SerializedName("basket")
    VALUE_BASKET("basket"),

    @SerializedName("item")
    VALUE_ITEM("item");


    private final String val;

    PromotionLevel(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}