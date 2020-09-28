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
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * ISO 4217 currency code
    */
    @SerializedName("currencyCode")
    String currencyCode;

    /**
    * ISO 3166 alpha 2 country code
    */
    @SerializedName("countryCode")
    String countryCode;

    /**
    * Price in the smalltest subunit, e.g Cent
    */
    @SerializedName("price")
    Integer price;

    /**
    * Old price in the smalltest subunit, e.g Cent
    */
    @SerializedName("oldPrice")
    Integer oldPrice;

    /**
    * Recommended retail price in the smalltest subunit, e.g Cent
    */
    @SerializedName("recommendedRetailPrice")
    Integer recommendedRetailPrice;

    /**
    * If present, the price will be added to the specified Price Group
    */
    @SerializedName("groupKey")
    String groupKey;

    /**
    * 
    */
    @SerializedName("promotionKey")
    String promotionKey;

    /**
    * 
    */
    @SerializedName("unitPrice")
    ProductVariantUnitPrice unitPrice;

    /**
    * A valid tax rate
    */
    @SerializedName("tax")
    Double tax;

    /**
    * Controlls when the price will be activated. If not present or null, its intepretated as valid from now
    */
    @SerializedName("validFrom")
    String validFrom;

    /**
    * 
    */
    @SerializedName("validTo")
    String validTo;

}