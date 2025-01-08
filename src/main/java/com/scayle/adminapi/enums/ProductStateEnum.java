package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum ProductStateEnum {
    @SerializedName("live")
    VALUE_LIVE("live"),

    @SerializedName("draft")
    VALUE_DRAFT("draft"),

    @SerializedName("problem")
    VALUE_PROBLEM("problem"),

    @SerializedName("new")
    VALUE_NEW("new"),

    @SerializedName("inApproval")
    VALUE_INAPPROVAL("inApproval"),

    @SerializedName("blocked")
    VALUE_BLOCKED("blocked");


    private final String val;

    ProductStateEnum(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}