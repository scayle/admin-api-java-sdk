package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.RoundingPrecision;
import com.scayle.adminapi.enums.RoundingType;

@Getter
@Setter
public class ShopCountryPriceRounding extends AbstractModel  {
    /**
    * The ID of the price rounding created by SCAYLE.
    */
    @SerializedName("id")
    Integer id;

    /**
    * Currency code in ISO 4217 format.
    */
    @SerializedName("currencyCode")
    String currencyCode;

    /**
    * The precision that should be applied to a price, ENUM of "1.00", "5.00", "0.50", "0.05", "0.01", "0.99", "0.95", "0.90".
    */
    @SerializedName("precision")
    RoundingPrecision precision;

    /**
    * The rounding type that should be used when rounding a price.
    */
    @SerializedName("roundingType")
    RoundingType roundingType;

}