package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ShopCategoryCountry extends AbstractModel  {
    /**
    * ISO 3166 alpha 2 country code.
    */
    @SerializedName("countryCode")
    String countryCode;

    /**
    * Id of Shop Country.
    */
    @SerializedName("shopCountryId")
    Integer shopCountryId;

    /**
    * String representation of the URL path to the category.
    */
    @SerializedName("path")
    String path;

    /**
    * Declares whether the shop category is active or not.
    */
    @SerializedName("isActive")
    Boolean isActive;

    /**
    * Declares whether the shop category is visible in the shop or not.
    */
    @SerializedName("isVisible")
    Boolean isVisible;

    /**
    * Declares whether the shop category country should be excluded from search.
    */
    @SerializedName("isExcludedFromSearch")
    Boolean isExcludedFromSearch;

    public void setIsExcludedFromSearch(Boolean value) {
        if (value == null) {
            this.setNull("isExcludedFromSearch");
        }
        this.isExcludedFromSearch = value;
    }
    /**
    * The properties assigned to the shop category.
    */
    @SerializedName("properties")
    List<ShopCategoryProperty> properties;

    /**
    * 
    */
    @SerializedName("customData")
    Object customData;

    public void setCustomData(Object value) {
        if (value == null) {
            this.setNull("customData");
        }
        this.customData = value;
    }
}