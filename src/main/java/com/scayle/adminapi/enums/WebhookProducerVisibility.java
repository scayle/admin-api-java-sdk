package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum WebhookProducerVisibility {
    @SerializedName("customer")
    VALUE_CUSTOMER("customer"),

    @SerializedName("internal")
    VALUE_INTERNAL("internal");


    private final String val;

    WebhookProducerVisibility(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}