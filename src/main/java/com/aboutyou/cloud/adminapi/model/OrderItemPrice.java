package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemPrice implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("appliedReductions")
    List<OrderReduction> appliedReductions;

    /**
    * 
    */
    @SerializedName("reference")
    OrderItemPriceReference reference;

    /**
    * 
    */
    @SerializedName("tax")
    OrderTax tax;

    /**
    * 
    */
    @SerializedName("withTax")
    Integer withTax;

    /**
    * 
    */
    @SerializedName("withoutTax")
    Integer withoutTax;

}