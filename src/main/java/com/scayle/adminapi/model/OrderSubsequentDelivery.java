package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.OrderSubsequentDeliveryKey;

@Getter
@Setter
public class OrderSubsequentDelivery extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("key")
    OrderSubsequentDeliveryKey key;

}