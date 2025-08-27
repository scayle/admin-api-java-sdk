package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderCost extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("appliedFees")
    List<OrderFee> appliedFees;

    /**
    * If the order has an external price, this field will not be included in the response payload.
    */
    @SerializedName("appliedReductions")
    List<OrderReduction> appliedReductions;

    /**
    * 
    */
    @SerializedName("tax")
    OrderTax tax;

    /**
    * The price is calculated including taxes and all applicable reductions such as discounts for sale and campaigns (should a campaign key be provdided on the request).
    */
    @SerializedName("withTax")
    Integer withTax;

    /**
    * This price excludes taxes, but also includes all applicable reductions.
If the order has an external price, this field becomes optional.

    */
    @SerializedName("withoutTax")
    Integer withoutTax;

    /**
    * The price is calculated including taxes and all applicable reductions such as discounts for sale and campaigns (should a campaign key be provdided on the request), and membership discount.
    */
    @SerializedName("withTaxWithMembershipDiscountWithoutServiceCosts")
    Integer withTaxWithMembershipDiscountWithoutServiceCosts;

    /**
    * This price excludes taxes, but also includes all applicable reductions and membership discount.
If the order has an external price, this field will not be included in the response payload.

    */
    @SerializedName("withoutTaxWithMembershipDiscount")
    Integer withoutTaxWithMembershipDiscount;

    /**
    * The exact cost captured: order total value - giftcard value - total membership discount
    */
    @SerializedName("costCapture")
    Integer costCapture;

    /**
    * 
    */
    @SerializedName("itemGroups")
    Object itemGroups;

    public void setItemGroups(Object value) {
        if (value == null) {
            this.setNull("itemGroups");
        }
        this.itemGroups = value;
    }
    /**
    * Indicates whether the order contains external prices.
    */
    @SerializedName("hasExternalPrices")
    Boolean hasExternalPrices;

}