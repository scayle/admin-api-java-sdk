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
    * 
    */
    @SerializedName("appliedReductions")
    List<OrderReduction> appliedReductions;

    /**
    * 
    */
    @SerializedName("tax")
    OrderCostTax tax;

    /**
    * The price is calculated including taxes and all applicable reductions such as discounts for sale and campaigns (should a campaign key be provdided on the request).
    */
    @SerializedName("withTax")
    Integer withTax;

    /**
    * This price excludes taxes, but also includes all applicable reductions.
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

}