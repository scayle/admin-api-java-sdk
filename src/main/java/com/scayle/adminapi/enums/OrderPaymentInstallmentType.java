package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum OrderPaymentInstallmentType {
    @SerializedName("annualInterest")
    VALUE_ANNUALINTEREST("annualInterest"),

    @SerializedName("firstInstallment")
    VALUE_FIRSTINSTALLMENT("firstInstallment"),

    @SerializedName("subsequentInstallments")
    VALUE_SUBSEQUENTINSTALLMENTS("subsequentInstallments");


    private final String val;

    OrderPaymentInstallmentType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}