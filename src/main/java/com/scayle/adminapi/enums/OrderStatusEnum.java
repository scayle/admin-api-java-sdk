package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum OrderStatusEnum {
    @SerializedName("order_open")
    VALUE_ORDER_OPEN("order_open"),

    @SerializedName("payment_pending")
    VALUE_PAYMENT_PENDING("payment_pending"),

    @SerializedName("payment_reserved")
    VALUE_PAYMENT_RESERVED("payment_reserved"),

    @SerializedName("invoice_completed")
    VALUE_INVOICE_COMPLETED("invoice_completed"),

    @SerializedName("cancellation_pending")
    VALUE_CANCELLATION_PENDING("cancellation_pending"),

    @SerializedName("cancellation_completed")
    VALUE_CANCELLATION_COMPLETED("cancellation_completed"),

    @SerializedName("invoice_partially_completed")
    VALUE_INVOICE_PARTIALLY_COMPLETED("invoice_partially_completed");


    private final String val;

    OrderStatusEnum(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}