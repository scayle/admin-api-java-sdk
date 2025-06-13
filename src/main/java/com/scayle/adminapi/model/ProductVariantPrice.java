package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductVariantPrice extends AbstractModel  {
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

    public void setOldPrice(Integer value) {
        if (value == null) {
            this.setNull("oldPrice");
        }
        this.oldPrice = value;
    }
    /**
    * Recommended retail price of the variant.
    */
    @SerializedName("recommendedRetailPrice")
    Integer recommendedRetailPrice;

    public void setRecommendedRetailPrice(Integer value) {
        if (value == null) {
            this.setNull("recommendedRetailPrice");
        }
        this.recommendedRetailPrice = value;
    }
    /**
    * Buying price of the variant.
    */
    @SerializedName("buyingPrice")
    Integer buyingPrice;

    public void setBuyingPrice(Integer value) {
        if (value == null) {
            this.setNull("buyingPrice");
        }
        this.buyingPrice = value;
    }
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

    public void setGroupKey(String value) {
        if (value == null) {
            this.setNull("groupKey");
        }
        this.groupKey = value;
    }
    /**
    * Key of the promotion the price is assigned to.
    */
    @SerializedName("promotionKey")
    String promotionKey;

    public void setPromotionKey(String value) {
        if (value == null) {
            this.setNull("promotionKey");
        }
        this.promotionKey = value;
    }
    /**
    * Describes the price for a specific unit.
    */
    @SerializedName("unitPrice")
    ProductVariantUnitPrice unitPrice;

    /**
    * Controls when the price will be activated. If not present or null, the valid from is specified from now.
    */
    @SerializedName("validFrom")
    java.time.Instant validFrom;

    public void setValidFrom(java.time.Instant value) {
        if (value == null) {
            this.setNull("validFrom");
        }
        this.validFrom = value;
    }
    /**
    * Controls when the price will be deactivated. If not present or null, the price is valid forever.
    */
    @SerializedName("validTo")
    java.time.Instant validTo;

    public void setValidTo(java.time.Instant value) {
        if (value == null) {
            this.setNull("validTo");
        }
        this.validTo = value;
    }
    /**
    * A merchant reference key the price belongs to.
    */
    @SerializedName("merchantReferenceKey")
    String merchantReferenceKey;

}