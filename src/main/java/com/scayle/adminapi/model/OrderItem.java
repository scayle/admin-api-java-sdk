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
    * 
    */
    @SerializedName("basketItemKey")
    String basketItemKey;

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
    * If the order has an external price, this field will not be included in the response payload.
    */
    @SerializedName("lowestPriorPrice")
    OrderItemLowestPriorPrice lowestPriorPrice;

    /**
    * 
    */
    @SerializedName("product")
    OrderItemProduct product;

    /**
    * Order item promotion; will be soon deprecated.
    */
    @SerializedName("promotion")
    OrderItemPromotion promotion;

    /**
    * Order item promotions
    */
    @SerializedName("promotions")
    List<OrderItemPromotion> promotions;

    public void setPromotions(List<OrderItemPromotion> value) {
        if (value == null) {
            this.setNull("promotions");
        }
        this.promotions = value;
    }
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

    public void setWarehouseId(Integer value) {
        if (value == null) {
            this.setNull("warehouseId");
        }
        this.warehouseId = value;
    }
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

    /**
    * Timestamp when the order item was successfully delegated, in Iso8601 format.
    */
    @SerializedName("delegatedAt")
    java.time.Instant delegatedAt;

    /**
    * Timestamp when the order item was shipped, in Iso8601 format.
    */
    @SerializedName("shippedAt")
    java.time.Instant shippedAt;

    /**
    * Timestamp when the order item was canceled, in Iso8601 format.
    */
    @SerializedName("cancelledAt")
    java.time.Instant cancelledAt;

    /**
    * Timestamp when the order item was returned by the customer and recorded in the system, in Iso8601 format.
    */
    @SerializedName("returnedAt")
    java.time.Instant returnedAt;

}