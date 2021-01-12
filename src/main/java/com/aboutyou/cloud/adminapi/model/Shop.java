package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Shop implements ApiObjectInterface {
    /**
    * The id of the shop created by Backbone Core.
    */
    @SerializedName("id")
    Integer id;

    /**
    * A key that uniquely identifies the shop within the tenant's ecosystem. Must be exactly 4 chars long.
    */
    @SerializedName("key")
    String key;

    /**
    * Full name of the Shop.
    */
    @SerializedName("name")
    String name;

    /**
    * Url of the Shop.
    */
    @SerializedName("url")
    String url;

    /**
    * The Url of the logo assigned to the shop.
    */
    @SerializedName("logoUrl")
    String logoUrl;

    /**
    * A source specifieng where to download the logo from.
    */
    @SerializedName("logoSource")
    AssetSource logoSource;

    /**
    * Defines if the shop is active.
    */
    @SerializedName("active")
    Boolean active;

    /**
    * Defines it the shop is deleted.
    */
    @SerializedName("deleted")
    Boolean deleted;

    /**
    * ISO 3166 alpha 2 country code.
    */
    @SerializedName("countryCode")
    String countryCode;

    /**
    * ISO-3166 country code and ISO-639 language code.
    */
    @SerializedName("languageCode")
    String languageCode;

    /**
    * Key of the price group the shop is assigned to.
    */
    @SerializedName("priceGroupKey")
    String priceGroupKey;

    /**
    * The properties assigned to the shop.
    */
    @SerializedName("properties")
    List<ShopProperty> properties;

    /**
    * 
    */
    @SerializedName("assortment")
    Assortment assortment;

    /**
    * A list of warehouses attached to the shop.
    */
    @SerializedName("warehouses")
    List<ShopWarehouse> warehouses;

}