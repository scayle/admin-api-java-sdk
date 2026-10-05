package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderShipping extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("policy")
    String policy;

    /**
    * Carrier group selected for this order, e.g. `dhl`. Send this value back as `carrier.carrierGroup` when creating a follow-up order. This is a carrier group, not a carrier code. `packages[].carrierKey` is the carrier shipping a package and must not be replayed here. Absent when the order has no carrier group recorded.
    */
    @SerializedName("carrierGroup")
    String carrierGroup;

    public void setCarrierGroup(String value) {
        if (value == null) {
            this.setNull("carrierGroup");
        }
        this.carrierGroup = value;
    }
    /**
    * 
    */
    @SerializedName("deliveredOn")
    String deliveredOn;

    /**
    * If the order has an external price, this field will not be included in the response payload.
    */
    @SerializedName("deliveryCosts")
    Integer deliveryCosts;

    /**
    * Original delivery costs before free-shipping or other shipping discounts. If the order has an external price, this field will not be included in the response payload.
    */
    @SerializedName("deliveryCostsWithoutDiscount")
    Integer deliveryCostsWithoutDiscount;

    /**
    * If the order has an external price, this field will not be included in the response payload.
    */
    @SerializedName("expressDeliveryCosts")
    Integer expressDeliveryCosts;

    /**
    * Original express delivery costs before free-shipping or other shipping discounts. If the order has an external price, this field will not be included in the response payload.
    */
    @SerializedName("expressDeliveryCostsWithoutDiscount")
    Integer expressDeliveryCostsWithoutDiscount;

}