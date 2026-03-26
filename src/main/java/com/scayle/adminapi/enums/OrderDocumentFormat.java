package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum OrderDocumentFormat {
    @SerializedName("pdf")
    VALUE_PDF("pdf"),

    @SerializedName("eml")
    VALUE_EML("eml");


    private final String val;

    OrderDocumentFormat(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}