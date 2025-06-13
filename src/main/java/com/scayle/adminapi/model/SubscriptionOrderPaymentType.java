package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SubscriptionOrderPaymentType extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("authorizedValue")
    Integer authorizedValue;

    /**
    * 
    */
    @SerializedName("confirmationData")
    SubscriptionOrderPaymentTypeConfirmationData confirmationData;

    /**
    * 
    */
    @SerializedName("primaryPaymentMerchantKey")
    String primaryPaymentMerchantKey;

    public void setPrimaryPaymentMerchantKey(String value) {
        if (value == null) {
            this.setNull("primaryPaymentMerchantKey");
        }
        this.primaryPaymentMerchantKey = value;
    }
    /**
    * 
    */
    @SerializedName("transactionId")
    String transactionId;

    /**
    * 
    */
    @SerializedName("type")
    String type;

    public void setType(String value) {
        if (value == null) {
            this.setNull("type");
        }
        this.type = value;
    }
}