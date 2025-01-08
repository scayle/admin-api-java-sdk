package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.CustomerPasswordHashingType;

@Getter
@Setter
public class CustomerPassword extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("hashingType")
    CustomerPasswordHashingType hashingType = CustomerPasswordHashingType.VALUE_INTERNAL;

    /**
    * 
    */
    @SerializedName("password")
    String password;

}