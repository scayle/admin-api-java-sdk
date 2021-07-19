package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderFee implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("amount")
    OrderFeeAmount amount;

    /**
    * 
    */
    @SerializedName("category")
    String category;

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