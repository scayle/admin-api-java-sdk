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
    * The ID of the shop created by Backbone Core.
    */
    @SerializedName("id")
    Integer id;

    /**
    * A key that uniquely identifies the shop within the tenant's ecosystem. Must be **exactly two characters** long.
    */
    @SerializedName("key")
    String key;

    /**
    * Full name of the shop.
    */
    @SerializedName("name")
    String name;

    /**
    * The URL of the logo assigned to the shop.
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
    * Key of the price group the shop is assigned to.
    */
    @SerializedName("priceGroupKey")
    String priceGroupKey;

    /**
    * Defines shop categories tree id. Can be set only on creation.
    */
    @SerializedName("shopCategoryTreeId")
    Integer shopCategoryTreeId;

    /**
    * The id of the company the shop is assigned to.
    */
    @SerializedName("companyId")
    Integer companyId;

    /**
    * The countries assigned to the shop.
    */
    @SerializedName("countries")
    List<ShopCountry> countries;

    /**
    * 
    */
    @SerializedName("customData")
    Object customData;

}