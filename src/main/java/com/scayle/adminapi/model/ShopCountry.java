package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ShopCountry extends AbstractModel  {
    /**
    * The ID of the shop country created by SCAYLE.
    */
    @SerializedName("id")
    Integer id;

    /**
    * A key that uniquely identifies the shop within the tenant's ecosystem. Must be exactly 2 chars long.
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

    public void setPriceGroupKey(String value) {
        if (value == null) {
            this.setNull("priceGroupKey");
        }
        this.priceGroupKey = value;
    }
    /**
    * The currency used in the shop country.
    */
    @SerializedName("currencyCode")
    String currencyCode;

    public void setCurrencyCode(String value) {
        if (value == null) {
            this.setNull("currencyCode");
        }
        this.currencyCode = value;
    }
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
    * List of price rounding configurations.
    */
    @SerializedName("priceRoundings")
    List<ShopCountryPriceRounding> priceRoundings;

    /**
    * System smart sorting key or custom smart sorting key from the catalog.
    */
    @SerializedName("smartSortingKey")
    Object smartSortingKey;

    public void setSmartSortingKey(Object value) {
        if (value == null) {
            this.setNull("smartSortingKey");
        }
        this.smartSortingKey = value;
    }
    /**
    * Customer segment sorting overrides for this shop country.
Returned on shop country reads when `with=customerSegmentOverrides` is set, and on shop reads when `with=countries.customerSegmentOverrides` is set.
On write, omit the property to leave existing assignments unchanged, send an empty array to remove them, or send items to replace the full set.
Each `customerSegmentId` and each `priority` must be unique. At most 30 overrides are accepted.

    */
    @SerializedName("customerSegmentOverrides")
    List<CustomerSegmentOverride> customerSegmentOverrides;

    /**
    * Arbitrary fields assigned to Shop countries
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