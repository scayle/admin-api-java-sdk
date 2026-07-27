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
    * If the order has an external price, this field will not be included in the response payload.
    */
    @SerializedName("expressDeliveryCosts")
    Integer expressDeliveryCosts;

}