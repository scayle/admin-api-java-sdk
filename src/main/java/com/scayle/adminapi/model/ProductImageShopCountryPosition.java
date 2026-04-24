package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductImageShopCountryPosition extends AbstractModel  {
    /**
    * A key that uniquely identifies the shop within the tenant's ecosystem.
    */
    @SerializedName("shopKey")
    String shopKey;

    /**
    * ISO 3166-1 alpha-2 country code.
    */
    @SerializedName("countryCode")
    String countryCode;

    /**
    * Position of the image for this shop-country. Counting starts with 0.

    */
    @SerializedName("position")
    Integer position;

}