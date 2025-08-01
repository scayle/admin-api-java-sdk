package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderReduction extends AbstractModel  {
    /**
    * Reduction identifier
    */
    @SerializedName("id")
    String id;

    /**
    * 
    */
    @SerializedName("amount")
    OrderReductionAmount amount;

    /**
    * 
    */
    @SerializedName("category")
    String category;

    /**
    * 
    */
    @SerializedName("type")
    String type;

    /**
    * Promotion or voucher code (for promotion / voucher reductions)
    */
    @SerializedName("code")
    String code;

    /**
    * Display name (for promotion reduction)
    */
    @SerializedName("displayName")
    String displayName;

}