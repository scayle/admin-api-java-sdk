package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubscriptionOrderAddressInstanceParcelShop extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("id")
    String id;

    /**
    * 
    */
    @SerializedName("customerId")
    String customerId;

    /**
    * 
    */
    @SerializedName("delegationId")
    String delegationId;

    /**
    * 
    */
    @SerializedName("description")
    String description;

    /**
    * 
    */
    @SerializedName("type")
    String type;

}