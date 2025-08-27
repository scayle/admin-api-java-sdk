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
    * If the order has an external price, this field will not be included in the response payload.
    */
    @SerializedName("appliedReductions")
    List<OrderReduction> appliedReductions;

    /**
    * If the order has an external price, this field will not be included in the response payload.
    */
    @SerializedName("absoluteVoucherReducedPrice")
    OrderItemAbsoluteVoucherReducedPrice absoluteVoucherReducedPrice;

    /**
    * If the order has an external price, this field will not be included in the response payload.
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
    * If the order has an external price, this field becomes optional.
    */
    @SerializedName("withoutTax")
    Integer withoutTax;

    /**
    * If the order has an external price, this field will not be included in the response payload.
    */
    @SerializedName("overrideWithoutTax")
    Integer overrideWithoutTax;

    /**
    * If the order has an external price, this field will not be included in the response payload.
    */
    @SerializedName("overrideWithTax")
    Integer overrideWithTax;

    /**
    * Un-discounted item price **excluding** taxes
If the order has an external price, this field will not be included in the response payload.

    */
    @SerializedName("undiscountedWithOutTax")
    Integer undiscountedWithOutTax;

    /**
    * Un-discounted item price **including** taxes
If the order has an external price, this field will not be included in the response payload.

    */
    @SerializedName("undiscountedWithTax")
    Integer undiscountedWithTax;

}