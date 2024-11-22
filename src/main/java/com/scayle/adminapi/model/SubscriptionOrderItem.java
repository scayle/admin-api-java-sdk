package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubscriptionOrderItem extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("additionalData")
    Map<String, Object> additionalData;

    /**
    * 
    */
    @SerializedName("categoryName")
    String categoryName;

    /**
    * 
    */
    @SerializedName("initial")
    SubscriptionOrderItemInitial initial;

    /**
    * 
    */
    @SerializedName("itemGroup")
    OrderItemGroup itemGroup;

    /**
    * 
    */
    @SerializedName("promotion")
    SubscriptionOrderItemPromotion promotion;

    /**
    * 
    */
    @SerializedName("variantId")
    Integer variantId;

}