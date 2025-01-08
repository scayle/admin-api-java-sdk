package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.SubscriptionOrderApplicationDevice;

@Getter
@Setter
public class SubscriptionOrderApplication extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("checkout")
    String checkout;

    /**
    * 
    */
    @SerializedName("device")
    SubscriptionOrderApplicationDevice device;

}