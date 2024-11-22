package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Email extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("key")
    String key;

    /**
    * 
    */
    @SerializedName("payload")
    Map<String, Object> payload;

    /**
    * 
    */
    @SerializedName("recipient")
    String recipient;

    /**
    * 
    */
    @SerializedName("orderId")
    Integer orderId;

}