package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.OrderFeeType;

@Getter
@Setter
public class OrderFee extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("amount")
    OrderFeeAmount amount;

    /**
    * 
    */
    @SerializedName("category")
    OrderFeeType category;

    /**
    * 
    */
    @SerializedName("key")
    String key;

    /**
    * 
    */
    @SerializedName("option")
    String option;

    /**
    * 
    */
    @SerializedName("tax")
    OrderTax tax;

}