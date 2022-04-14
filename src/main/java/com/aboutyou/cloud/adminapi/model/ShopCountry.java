package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopCountry implements ApiObjectInterface {
    /**
    * The ID of the shop country created by Backbone Core.
    */
    @SerializedName("id")
    Integer id;

    /**
    * The key of the shop created by Backbone Core.
    */
    @SerializedName("shopKey")
    String shopKey;

    /**
    * ISO 3166 alpha 2 country code.
    */
    @SerializedName("countryCode")
    String countryCode;

    /**
    * ISO-3166 country code and ISO-639 language code.
    */
    @SerializedName("defaultLanguageCode")
    String defaultLanguageCode;

    /**
    * List of supported language codes.
    */
    @SerializedName("supportedLanguageCodes")
    List<String> supportedLanguageCodes;

    /**
    * Url of the shop country.
    */
    @SerializedName("url")
    String url;

    /**
    * Defines if the shop country is active.
    */
    @SerializedName("active")
    Boolean active;

    /**
    * Defines if the shop country is deleted.
    */
    @SerializedName("deleted")
    Boolean deleted;

    /**
    * Key of the price group the shop country is assigned to.
    */
    @SerializedName("priceGroupKey")
    String priceGroupKey;

    /**
    * The currency used in the shop country.
    */
    @SerializedName("currencyCode")
    String currencyCode;

    /**
    * Rules that defines what products can be sold within which Shop country
    */
    @SerializedName("assortment")
    Assortment assortment;

    /**
    * A list of warehouses attached to the shop country.
    */
    @SerializedName("warehouses")
    List<ShopCountryWarehouse> warehouses;

    /**
    * Arbitrary fields assigned to Shop countries
    */
    @SerializedName("customData")
    Object customData;

}