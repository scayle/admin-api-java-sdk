package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum OrderDocumentType {
    @SerializedName("merchant_partial_invoice")
    VALUE_MERCHANT_PARTIAL_INVOICE("merchant_partial_invoice"),

    @SerializedName("email_shipment")
    VALUE_EMAIL_SHIPMENT("email_shipment");


    private final String val;

    OrderDocumentType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}