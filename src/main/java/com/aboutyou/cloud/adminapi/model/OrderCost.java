package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderCost implements ApiObjectInterface {
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