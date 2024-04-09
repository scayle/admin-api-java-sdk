package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderShipping implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("policy")
    String policy;

    /**
    * 
    */
    @SerializedName("deliveredOn")
    String deliveredOn;

    /**
    * 
    */
    @SerializedName("deliveryCosts")
    Integer deliveryCosts;

    /**
    * 
    */
    @SerializedName("expressDeliveryCosts")
    Integer expressDeliveryCosts;

}