package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Shipment extends AbstractModel  {
    /**
    * A key that uniquely identifies the shop within the tenant's ecosystem.
    */
    @SerializedName("shopKey")
    String shopKey;

    /**
    * ISO 3166 alpha 2 country code; use shop country ID instead of country code when a country is ambiguous within a shop
    */
    @SerializedName("countryCode")
    String countryCode;

    /**
    * Defines the carrier key used, e.g. DHL
    */
    @SerializedName("carrier")
    String carrier;

    /**
    * Defines the timestamp of the package leaving the warehouse
    */
    @SerializedName("deliveryDate")
    java.time.Instant deliveryDate;

    /**
    * Collection of items shipped
    */
    @SerializedName("items")
    List<ShipmentOrderItem> items;

    /**
    * Unique identity of the order the shipment was part of
    */
    @SerializedName("orderId")
    Integer orderId;

    /**
    * Unique ID generated for product return (in case the customer prefers to return the product in later point of time)
    */
    @SerializedName("returnIdentCode")
    String returnIdentCode;

    /**
    * A key that is assigned to uniquely identify a Shipment
    */
    @SerializedName("shipmentKey")
    String shipmentKey;

}