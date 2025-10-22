package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum BillingStatus {
    @SerializedName("billing_completed")
    VALUE_BILLING_COMPLETED("billing_completed"),

    @SerializedName("billing_partially_refunded")
    VALUE_BILLING_PARTIALLY_REFUNDED("billing_partially_refunded"),

    @SerializedName("billing_refunded")
    VALUE_BILLING_REFUNDED("billing_refunded"),

    @SerializedName("billing_payment_cancelled")
    VALUE_BILLING_PAYMENT_CANCELLED("billing_payment_cancelled");


    private final String val;

    BillingStatus(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}