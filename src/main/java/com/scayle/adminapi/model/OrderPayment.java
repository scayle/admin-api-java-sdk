package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderPayment implements ApiObjectInterface {
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

}