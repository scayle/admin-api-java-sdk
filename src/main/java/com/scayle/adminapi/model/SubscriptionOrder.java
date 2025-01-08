package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SubscriptionOrder extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("additionalMetaData")
    Map<String, Object> additionalMetaData;

    /**
    * 
    */
    @SerializedName("address")
    SubscriptionOrderAddress address;

    /**
    * 
    */
    @SerializedName("application")
    SubscriptionOrderApplication application;

    /**
    * 
    */
    @SerializedName("legacyCustomData")
    Map<String, Object> legacyCustomData;

    /**
    * 
    */
    @SerializedName("customerId")
    Integer customerId;

    /**
    * 
    */
    @SerializedName("ipAddress")
    String ipAddress;

    /**
    * 
    */
    @SerializedName("items")
    List<SubscriptionOrderItem> items;

    /**
    * 
    */
    @SerializedName("membershipCard")
    SubscriptionOrderMembershipCard membershipCard;

    /**
    * 
    */
    @SerializedName("paymentTypes")
    List<SubscriptionOrderPaymentType> paymentTypes;

    /**
    * 
    */
    @SerializedName("subscriptionId")
    String subscriptionId;

    /**
    * 
    */
    @SerializedName("userAgent")
    String userAgent;

    /**
    * 
    */
    @SerializedName("voucher")
    SubscriptionOrderVoucher voucher;

}