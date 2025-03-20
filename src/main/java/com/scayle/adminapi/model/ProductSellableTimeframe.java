package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductSellableTimeframe extends AbstractModel  {
    /**
    * The ID of the product
    */
    @SerializedName("productId")
    Integer productId;

    /**
    * The shop key identifier
    */
    @SerializedName("shopKey")
    String shopKey;

    /**
    * The ISO 3166-1 alpha-2 country code
    */
    @SerializedName("countryCode")
    String countryCode;

    /**
    * The date and time from which the product is sellable
    */
    @SerializedName("sellableFrom")
    java.time.Instant sellableFrom;

    /**
    * The date and time until which the product is sellable
    */
    @SerializedName("sellableTo")
    java.time.Instant sellableTo;

}