package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderPayment extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("amount")
    Integer amount;

    /**
    * 
    */
    @SerializedName("data")
    Map<String, Object> data;

    /**
    * 
    */
    @SerializedName("key")
    String key;

    /**
    * 
    */
    @SerializedName("transactionKey")
    String transactionKey;

    /**
    * Details about installments, included as a listing of the values involved in the Installments transaction.
    */
    @SerializedName("installment")
    List<OrderPaymentInstallment> installment;

    /**
    * 
    */
    @SerializedName("options")
    OrderPaymentOptions options;

    /**
    * 
    */
    @SerializedName("isGiftCard")
    Boolean isGiftCard;

}