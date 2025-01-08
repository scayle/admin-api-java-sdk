package com.scayle.adminapi.enums;

import com.google.gson.annotations.SerializedName;

public enum VoucherCriteriaKey {
    @SerializedName("shopCategoryId")
    VALUE_SHOPCATEGORYID("shopCategoryId"),

    @SerializedName("masterCategoryId")
    VALUE_MASTERCATEGORYID("masterCategoryId"),

    @SerializedName("customerId")
    VALUE_CUSTOMERID("customerId"),

    @SerializedName("emailHash")
    VALUE_EMAILHASH("emailHash"),

    @SerializedName("brandId")
    VALUE_BRANDID("brandId"),

    @SerializedName("productId")
    VALUE_PRODUCTID("productId"),

    @SerializedName("customerGroup")
    VALUE_CUSTOMERGROUP("customerGroup"),

    @SerializedName("shopCountryId")
    VALUE_SHOPCOUNTRYID("shopCountryId");


    private final String val;

    VoucherCriteriaKey(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val;
    }
}