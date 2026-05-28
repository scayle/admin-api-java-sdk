package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum WebhookProducerSubscriptionDisabledReason {
    @SerializedName("max_suspensions")
    VALUE_MAX_SUSPENSIONS("max_suspensions");


    private final String val;

    WebhookProducerSubscriptionDisabledReason(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}