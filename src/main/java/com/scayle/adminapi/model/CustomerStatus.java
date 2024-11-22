package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerStatus extends AbstractModel  {
    /**
    * Declares whether the customer account is active or not
    */
    @SerializedName("isActive")
    Boolean isActive;

    /**
    * Declares if the customer have an account or not
    */
    @SerializedName("isGuestCustomer")
    Boolean isGuestCustomer;

}