package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderItemPrice extends AbstractModel  {
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

    /**
    * 
    */
    @SerializedName("overrideWithoutTax")
    Integer overrideWithoutTax;

    /**
    * 
    */
    @SerializedName("overrideWithTax")
    Integer overrideWithTax;

    /**
    * Undiscounted item price **excluding** taxes
    */
    @SerializedName("undiscountedWithOutTax")
    Integer undiscountedWithOutTax;

    /**
    * Undiscounted item price **including** taxes
    */
    @SerializedName("undiscountedWithTax")
    Integer undiscountedWithTax;

}