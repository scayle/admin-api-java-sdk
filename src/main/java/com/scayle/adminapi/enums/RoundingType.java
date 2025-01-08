package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum RoundingType {
    @SerializedName("nearest")
    VALUE_NEAREST("nearest"),

    @SerializedName("up")
    VALUE_UP("up"),

    @SerializedName("down")
    VALUE_DOWN("down");


    private final String val;

    RoundingType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}