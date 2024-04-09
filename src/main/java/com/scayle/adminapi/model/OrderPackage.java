package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderPackage implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * 
    */
    @SerializedName("shipmentKey")
    String shipmentKey;

    /**
    * 
    */
    @SerializedName("carrierKey")
    String carrierKey;

    /**
    * 
    */
    @SerializedName("deliveryDate")
    OrderPackageDeliveryDate deliveryDate;

    /**
    * 
    */
    @SerializedName("deliveryStatus")
    String deliveryStatus;

    /**
    * 
    */
    @SerializedName("tracking")
    OrderPackageTracking tracking;

}