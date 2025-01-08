package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum SubscriptionOrderApplicationDevice {
    @SerializedName("mobile")
    VALUE_MOBILE("mobile"),

    @SerializedName("desktop")
    VALUE_DESKTOP("desktop"),

    @SerializedName("app")
    VALUE_APP("app"),

    @SerializedName("tablet")
    VALUE_TABLET("tablet");


    private final String val;

    SubscriptionOrderApplicationDevice(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}