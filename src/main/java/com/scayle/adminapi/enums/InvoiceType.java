package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum InvoiceType {
    @SerializedName("invoice")
    VALUE_INVOICE("invoice"),

    @SerializedName("partial_invoice")
    VALUE_PARTIAL_INVOICE("partial_invoice"),

    @SerializedName("corrective_invoice")
    VALUE_CORRECTIVE_INVOICE("corrective_invoice"),

    @SerializedName("merchant_invoice")
    VALUE_MERCHANT_INVOICE("merchant_invoice"),

    @SerializedName("merchant_partial_invoice")
    VALUE_MERCHANT_PARTIAL_INVOICE("merchant_partial_invoice"),

    @SerializedName("merchant_corrective_invoice")
    VALUE_MERCHANT_CORRECTIVE_INVOICE("merchant_corrective_invoice"),

    @SerializedName("custom_corrective_invoice")
    VALUE_CUSTOM_CORRECTIVE_INVOICE("custom_corrective_invoice"),

    @SerializedName("historical_corrective_invoice")
    VALUE_HISTORICAL_CORRECTIVE_INVOICE("historical_corrective_invoice"),

    @SerializedName("praz")
    VALUE_PRAZ("praz"),

    @SerializedName("shipment_return_document")
    VALUE_SHIPMENT_RETURN_DOCUMENT("shipment_return_document");


    private final String val;

    InvoiceType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}