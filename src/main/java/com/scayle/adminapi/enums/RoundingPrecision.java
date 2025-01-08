package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum RoundingPrecision {
    @SerializedName("1.00")
    VALUE_1_00("1.00"),

    @SerializedName("5.00")
    VALUE_5_00("5.00"),

    @SerializedName("0.05")
    VALUE_0_05("0.05"),

    @SerializedName("0.99")
    VALUE_0_99("0.99"),

    @SerializedName("0.95")
    VALUE_0_95("0.95"),

    @SerializedName("0.90")
    VALUE_0_90("0.90");


    private final String val;

    RoundingPrecision(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}