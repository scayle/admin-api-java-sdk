package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderItem extends AbstractModel  {
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
    * The three character [ISO-4217](https://en.wikipedia.org/wiki/ISO_4217#Active_codes) currency code that identifies the currency. The currency is defined on the configuration of the shop, and can be modified in the cloud panel.
    */
    @SerializedName("currency")
    String currency;

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
    @SerializedName("lowestPriorPrice")
    OrderItemLowestPriorPrice lowestPriorPrice;

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
    * Possible values: available, unavailable, deliverable, undeliverable, cancelled, returned.
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

    /**
    * Timestamp when the order item is created
    */
    @SerializedName("createdAt")
    java.time.Instant createdAt;

    /**
    * Timestamp when the order item is updated
    */
    @SerializedName("updatedAt")
    java.time.Instant updatedAt;

}