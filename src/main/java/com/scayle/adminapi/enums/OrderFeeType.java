package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum OrderFeeType {
    @SerializedName("payment")
    VALUE_PAYMENT("payment"),

    @SerializedName("delivery")
    VALUE_DELIVERY("delivery"),

    @SerializedName("percentage_payment")
    VALUE_PERCENTAGE_PAYMENT("percentage_payment"),

    @SerializedName("return")
    VALUE_RETURN("return");


    private final String val;

    OrderFeeType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}