package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderPackage extends AbstractModel  {
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

    public void setCarrierKey(String value) {
        if (value == null) {
            this.setNull("carrierKey");
        }
        this.carrierKey = value;
    }
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
    * Timestamp when the order item was shipped, in Iso8601 format.
    */
    @SerializedName("shippedAt")
    java.time.Instant shippedAt;

    /**
    * 
    */
    @SerializedName("tracking")
    OrderPackageTracking tracking;

    /**
    * 
    */
    @SerializedName("returnIdentCode")
    String returnIdentCode;

    public void setReturnIdentCode(String value) {
        if (value == null) {
            this.setNull("returnIdentCode");
        }
        this.returnIdentCode = value;
    }
}