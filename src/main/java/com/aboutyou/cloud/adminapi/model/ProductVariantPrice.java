package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductVariantPrice implements ApiObjectInterface {
    /**
    * Key assigned by SCAYLE.
    */
    @SerializedName("key")
    String key;

    /**
    * Price of the variant.
    */
    @SerializedName("price")
    Integer price;

    /**
    * Old price of the variant.
    */
    @SerializedName("oldPrice")
    Integer oldPrice;

    /**
    * Recommended retail price of the variant.
    */
    @SerializedName("recommendedRetailPrice")
    Integer recommendedRetailPrice;

    /**
    * Buying price of the variant.
    */
    @SerializedName("buyingPrice")
    Integer buyingPrice;

    /**
    * A valid tax rate.
    */
    @SerializedName("tax")
    Double tax;

    /**
    * ISO 3166 alpha 2 country code.
    */
    @SerializedName("countryCode")
    String countryCode;

    /**
    * ISO 4217 currency code.
    */
    @SerializedName("currencyCode")
    String currencyCode;

    /**
    * Key of the group the price is assigned to.
    */
    @SerializedName("groupKey")
    String groupKey;

    /**
    * Key of the promotion the price is assigned to.
    */
    @SerializedName("promotionKey")
    String promotionKey;

    /**
    * Describes the price for a specific unit.
    */
    @SerializedName("unitPrice")
    ProductVariantUnitPrice unitPrice;

    /**
    * Controls when the price will be activated. If not present or null, the valid from is specified from now.
    */
    @SerializedName("validFrom")
    String validFrom;

    /**
    * Controls when the price will be deactivated. If not present or null, the price is valid forever.
    */
    @SerializedName("validTo")
    String validTo;

}