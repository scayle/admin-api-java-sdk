package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductVariantUnitPrice extends AbstractModel  {
    /**
    * The name of the unit the amount and price references to.
    */
    @SerializedName("unit")
    String unit;

    /**
    * The amount referenced by the price.
    */
    @SerializedName("amount")
    Integer amount;

    /**
    * The reference price.
    */
    @SerializedName("price")
    Integer price;

}