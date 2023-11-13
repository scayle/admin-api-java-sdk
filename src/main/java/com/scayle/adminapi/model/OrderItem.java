package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItem implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * 
    */
    @SerializedName("availableQuantity")
    Integer availableQuantity;

    /**
    * 
    */
    @SerializedName("deliveryForecast")
    OrderItemDeliveryForecast deliveryForecast;

    /**
    * Custom data added to the order item (legacy feature)
    */
    @SerializedName("legacyCustomData")
    Object legacyCustomData;

    /**
    * 
    */
    @SerializedName("packageId")
    Integer packageId;

    /**
    * 
    */
    @SerializedName("price")
    OrderItemPrice price;

    /**
    * 
    */
    @SerializedName("product")
    OrderItemProduct product;

    /**
    * 
    */
    @SerializedName("promotion")
    OrderItemPromotion promotion;

    /**
    * 
    */
    @SerializedName("key")
    String key;

    /**
    * 
    */
    @SerializedName("reservationKey")
    String reservationKey;

    /**
    * 
    */
    @SerializedName("status")
    String status;

    /**
    * 
    */
    @SerializedName("variant")
    OrderItemVariant variant;

    /**
    * 
    */
    @SerializedName("warehouseId")
    Integer warehouseId;

    /**
    * 
    */
    @SerializedName("itemGroup")
    OrderItemGroup itemGroup;

    /**
    * Reference to the campaign applied to this order
    */
    @SerializedName("campaignKey")
    String campaignKey;

    /**
    * 
    */
    @SerializedName("merchant")
    OrderItemMerchant merchant;

}