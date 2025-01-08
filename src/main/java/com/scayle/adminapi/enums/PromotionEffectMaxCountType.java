package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum PromotionEffectMaxCountType {
    @SerializedName("")
    VALUE_(""),

    @SerializedName("per_eligible_unique_items")
    VALUE_PER_ELIGIBLE_UNIQUE_ITEMS("per_eligible_unique_items"),

    @SerializedName("per_eligible_items_quantity")
    VALUE_PER_ELIGIBLE_ITEMS_QUANTITY("per_eligible_items_quantity");


    private final String val;

    PromotionEffectMaxCountType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}