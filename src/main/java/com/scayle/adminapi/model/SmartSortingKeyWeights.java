package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SmartSortingKeyWeights extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("recency")
    Integer recency;

    /**
    * 
    */
    @SerializedName("recencyInv")
    Integer recencyInv;

    /**
    * 
    */
    @SerializedName("stock")
    Integer stock;

    /**
    * 
    */
    @SerializedName("stockInv")
    Integer stockInv;

    /**
    * 
    */
    @SerializedName("variantAvailability")
    Integer variantAvailability;

    /**
    * 
    */
    @SerializedName("variantAvailabilityInv")
    Integer variantAvailabilityInv;

    /**
    * 
    */
    @SerializedName("originalPrice")
    Integer originalPrice;

    /**
    * 
    */
    @SerializedName("originalPriceInv")
    Integer originalPriceInv;

    /**
    * 
    */
    @SerializedName("discountValue")
    Integer discountValue;

    /**
    * 
    */
    @SerializedName("discountValueInv")
    Integer discountValueInv;

    /**
    * 
    */
    @SerializedName("discountPercentage")
    Integer discountPercentage;

    /**
    * 
    */
    @SerializedName("discountPercentageInv")
    Integer discountPercentageInv;

    /**
    * 
    */
    @SerializedName("sales")
    Integer sales;

    /**
    * 
    */
    @SerializedName("salesInv")
    Integer salesInv;

    /**
    * 
    */
    @SerializedName("revenue")
    Integer revenue;

    /**
    * 
    */
    @SerializedName("revenueInv")
    Integer revenueInv;

    /**
    * 
    */
    @SerializedName("weightedSales")
    Integer weightedSales;

    /**
    * 
    */
    @SerializedName("weightedSalesInv")
    Integer weightedSalesInv;

    /**
    * 
    */
    @SerializedName("trend")
    Integer trend;

    /**
    * 
    */
    @SerializedName("trendInv")
    Integer trendInv;

    /**
    * 
    */
    @SerializedName("stockAvailability")
    Integer stockAvailability;

    /**
    * 
    */
    @SerializedName("stockAvailabilityInv")
    Integer stockAvailabilityInv;

    /**
    * 
    */
    @SerializedName("variantAvailabilityAdj")
    Integer variantAvailabilityAdj;

    /**
    * 
    */
    @SerializedName("variantAvailabilityAdjInv")
    Integer variantAvailabilityAdjInv;

}