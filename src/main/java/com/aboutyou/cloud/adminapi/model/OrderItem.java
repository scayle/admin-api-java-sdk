package com.aboutyou.cloud.adminapi.model;

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
    * 
    */
    @SerializedName("legacyCustomData")
    Map<String, Object> legacyCustomData;

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
    @SerializedName("referenceKey")
    String referenceKey;

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

}