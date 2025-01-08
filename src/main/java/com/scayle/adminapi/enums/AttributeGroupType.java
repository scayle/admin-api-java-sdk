package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum AttributeGroupType {
    @SerializedName("simple")
    VALUE_SIMPLE("simple"),

    @SerializedName("simpleList")
    VALUE_SIMPLELIST("simpleList"),

    @SerializedName("localizedString")
    VALUE_LOCALIZEDSTRING("localizedString"),

    @SerializedName("localizedStringList")
    VALUE_LOCALIZEDSTRINGLIST("localizedStringList"),

    @SerializedName("advanced")
    VALUE_ADVANCED("advanced"),

    @SerializedName("advancedList")
    VALUE_ADVANCEDLIST("advancedList");


    private final String val;

    AttributeGroupType(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}