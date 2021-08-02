package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Shipment implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("shopKey")
    String shopKey;

    /**
    * 
    */
    @SerializedName("countryCode")
    String countryCode;

    /**
    * 
    */
    @SerializedName("carrier")
    String carrier;

    /**
    * 
    */
    @SerializedName("deliveryDate")
    String deliveryDate;

    /**
    * 
    */
    @SerializedName("items")
    List<ShipmentOrderItem> items;

    /**
    * 
    */
    @SerializedName("orderId")
    Integer orderId;

    /**
    * 
    */
    @SerializedName("returnIdentCode")
    String returnIdentCode;

    /**
    * 
    */
    @SerializedName("shipmentKey")
    String shipmentKey;

}