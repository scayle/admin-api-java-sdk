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

    public void setCustomerId(String value) {
        if (value == null) {
            this.setNull("customerId");
        }
        this.customerId = value;
    }
    /**
    * 
    */
    @SerializedName("delegationId")
    String delegationId;

    public void setDelegationId(String value) {
        if (value == null) {
            this.setNull("delegationId");
        }
        this.delegationId = value;
    }
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