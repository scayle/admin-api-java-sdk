package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum PromotionEffectBuyXGetYApplicableItemSelectionType {
    @SerializedName("variant_ids")
    VALUE_VARIANT_IDS("variant_ids"),

    @SerializedName("cheapest")
    VALUE_CHEAPEST("cheapest"),

    @SerializedName("most_expensive")
    VALUE_MOST_EXPENSIVE("most_expensive");


    private final String val;

    PromotionEffectBuyXGetYApplicableItemSelectionType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}