package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum Gender {
    @SerializedName("f")
    VALUE_F("f"),

    @SerializedName("m")
    VALUE_M("m"),

    @SerializedName("d")
    VALUE_D("d"),

    @SerializedName("n")
    VALUE_N("n");


    private final String val;

    Gender(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}