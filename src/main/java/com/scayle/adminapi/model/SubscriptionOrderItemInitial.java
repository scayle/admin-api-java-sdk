package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SubscriptionOrderItemInitial extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("merchantId")
    Integer merchantId;

    /**
    * 
    */
    @SerializedName("merchantVariantId")
    String merchantVariantId;

    /**
    * 
    */
    @SerializedName("quantity")
    Integer quantity;

    /**
    * 
    */
    @SerializedName("size")
    String size;

    /**
    * 
    */
    @SerializedName("unitCost")
    Integer unitCost;

}