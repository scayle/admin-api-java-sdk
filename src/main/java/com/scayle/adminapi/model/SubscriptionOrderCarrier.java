package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SubscriptionOrderCarrier extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("shippingPolicyKey")
    String shippingPolicyKey;

    /**
    * 
    */
    @SerializedName("carrierKey")
    String carrierKey;

    /**
    * 
    */
    @SerializedName("deliveryDate")
    SubscriptionOrderCarrierDeliveryDate deliveryDate;

}