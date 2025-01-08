package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.Gender;
import com.scayle.adminapi.enums.CustomerAddressRecipientType;

@Getter
@Setter
public class CustomerAddressRecipient extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("firstName")
    String firstName;

    /**
    * 
    */
    @SerializedName("lastName")
    String lastName;

    /**
    * Gender of the customer mentioned as per defined ENUM as "m" , "f", "d", "n"
    */
    @SerializedName("gender")
    Gender gender;

    /**
    * 
    */
    @SerializedName("title")
    String title;

    /**
    * 
    */
    @SerializedName("type")
    CustomerAddressRecipientType type;

}