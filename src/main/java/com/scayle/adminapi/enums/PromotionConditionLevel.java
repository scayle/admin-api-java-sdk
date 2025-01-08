package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum PromotionConditionLevel {
    @SerializedName("global")
    VALUE_GLOBAL("global"),

    @SerializedName("item")
    VALUE_ITEM("item");


    private final String val;

    PromotionConditionLevel(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}