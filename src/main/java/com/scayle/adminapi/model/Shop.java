package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Shop extends AbstractModel  {
    /**
    * The ID of the shop created by SCAYLE.
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

    public void setLogoUrl(String value) {
        if (value == null) {
            this.setNull("logoUrl");
        }
        this.logoUrl = value;
    }
    /**
    * A source specifying where to download the logo from.
    */
    @SerializedName("logoSource")
    AssetSource logoSource;

    /**
    * Defines if the shop is active.
    */
    @SerializedName("active")
    Boolean active;

    /**
    * Defines if the shop is deleted.
    */
    @SerializedName("deleted")
    Boolean deleted;

    /**
    * Key of the price group the shop is assigned to.
    */
    @SerializedName("priceGroupKey")
    String priceGroupKey;

    public void setPriceGroupKey(String value) {
        if (value == null) {
            this.setNull("priceGroupKey");
        }
        this.priceGroupKey = value;
    }
    /**
    * Defines shop category tree id. Can be set only on creation.
    */
    @SerializedName("shopCategoryTreeId")
    Integer shopCategoryTreeId;

    /**
    * The ID of the company the shop is assigned to.
    */
    @SerializedName("companyId")
    Integer companyId;

    /**
    * The countries assigned to the shop. Can be set only on creation.
    */
    @SerializedName("countries")
    List<ShopCountry> countries;

    /**
    * Arbitrary fields assigned to Shop
    */
    @SerializedName("customData")
    Object customData;

    public void setCustomData(Object value) {
        if (value == null) {
            this.setNull("customData");
        }
        this.customData = value;
    }
    /**
    * 
    */
    @SerializedName("smartSortingKey")
    Object smartSortingKey;

    public void setSmartSortingKey(Object value) {
        if (value == null) {
            this.setNull("smartSortingKey");
        }
        this.smartSortingKey = value;
    }
}