package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum PromotionEffectComboDealMaxCountType {
    @SerializedName("per_eligible_items_quantity")
    VALUE_PER_ELIGIBLE_ITEMS_QUANTITY("per_eligible_items_quantity"),

    @SerializedName("per_item_set")
    VALUE_PER_ITEM_SET("per_item_set"),

    @SerializedName("single_item")
    VALUE_SINGLE_ITEM("single_item");


    private final String val;

    PromotionEffectComboDealMaxCountType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}