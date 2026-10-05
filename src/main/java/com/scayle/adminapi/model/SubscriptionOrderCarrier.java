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
    * Carrier group name, e.g. `dhl`, exactly as returned in `shipping.carrierGroup` on an order response. Required, but not marked as required, so existing clients can keep sending deprecated `carrierKey`. One of `carrierGroup` or `carrierKey` must be set. When set, it takes precedence over `carrierKey`. Must match a carrier group configured for this shop and shipping policy.
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
    * Deprecated, use `carrierGroup`. Mapped to `carrierGroup` when `carrierGroup` is omitted. Despite its name this must be a carrier group name, e.g. `dhl`, and not a carrier code, e.g. `DHL_STD_NATIONAL`. Ignored when `carrierGroup` is present.
    */
    @SerializedName("carrierKey")
    String carrierKey;

    /**
    * 
    */
    @SerializedName("deliveryDate")
    SubscriptionOrderCarrierDeliveryDate deliveryDate;

}