package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SubscriptionOrderPaymentTypeConfirmationData extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("amount")
    Double amount;

    /**
    * 
    */
    @SerializedName("apiVersion")
    String apiVersion;

    /**
    * 
    */
    @SerializedName("authorizationId")
    String authorizationId;

    /**
    * 
    */
    @SerializedName("authorizedDate")
    String authorizedDate;

    /**
    * 
    */
    @SerializedName("chargePermissionId")
    String chargePermissionId;

    /**
    * 
    */
    @SerializedName("checkoutId")
    String checkoutId;

    /**
    * 
    */
    @SerializedName("creditCardBrand")
    String creditCardBrand;

    public void setCreditCardBrand(String value) {
        if (value == null) {
            this.setNull("creditCardBrand");
        }
        this.creditCardBrand = value;
    }
    /**
    * 
    */
    @SerializedName("descriptor")
    String descriptor;

    /**
    * 
    */
    @SerializedName("expirationDate")
    String expirationDate;

    /**
    * 
    */
    @SerializedName("giftCardCode")
    String giftCardCode;

    /**
    * 
    */
    @SerializedName("giftCardPin")
    String giftCardPin;

    /**
    * 
    */
    @SerializedName("isRegularCustomer")
    Boolean isRegularCustomer;

    /**
    * 
    */
    @SerializedName("merchantAccount")
    String merchantAccount;

    /**
    * 
    */
    @SerializedName("orderId")
    String orderId;

    /**
    * 
    */
    @SerializedName("orderNumber")
    String orderNumber;

    /**
    * 
    */
    @SerializedName("payId")
    String payId;

    /**
    * 
    */
    @SerializedName("paymentMeans")
    Map<String, Object> paymentMeans;

    public void setPaymentMeans(Map<String, Object> value) {
        if (value == null) {
            this.setNull("paymentMeans");
        }
        this.paymentMeans = value;
    }
    /**
    * 
    */
    @SerializedName("paymentPurpose")
    String paymentPurpose;

    public void setPaymentPurpose(String value) {
        if (value == null) {
            this.setNull("paymentPurpose");
        }
        this.paymentPurpose = value;
    }
    /**
    * 
    */
    @SerializedName("paymentSubType")
    String paymentSubType;

    /**
    * 
    */
    @SerializedName("profileId")
    String profileId;

    public void setProfileId(String value) {
        if (value == null) {
            this.setNull("profileId");
        }
        this.profileId = value;
    }
    /**
    * 
    */
    @SerializedName("pspReference")
    String pspReference;

    /**
    * 
    */
    @SerializedName("serial")
    Integer serial;

    /**
    * 
    */
    @SerializedName("subscriptionPaymentReference")
    String subscriptionPaymentReference;

    /**
    * 
    */
    @SerializedName("success")
    Boolean success;

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

    /**
    * 
    */
    @SerializedName("userData")
    Map<String, Object> userData;

    /**
    * 
    */
    @SerializedName("XID")
    List<String> XID;

}