package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubscriptionOrderAddressInstance implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("additional")
    String additional;

    /**
    * 
    */
    @SerializedName("city")
    String city;

    /**
    * 
    */
    @SerializedName("countryCode")
    String countryCode;

    /**
    * 
    */
    @SerializedName("firstName")
    String firstName;

    /**
    * 
    */
    @SerializedName("forwardToCollectionPoint")
    Boolean forwardToCollectionPoint;

    /**
    * 
    */
    @SerializedName("gender")
    String gender;

    /**
    * 
    */
    @SerializedName("houseNumber")
    String houseNumber;

    /**
    * 
    */
    @SerializedName("lastName")
    String lastName;

    /**
    * 
    */
    @SerializedName("phone")
    String phone;

    /**
    * 
    */
    @SerializedName("state")
    String state;

    /**
    * 
    */
    @SerializedName("street")
    String street;

    /**
    * 
    */
    @SerializedName("title")
    String title;

    /**
    * 
    */
    @SerializedName("zipCode")
    String zipCode;

    /**
    * 
    */
    @SerializedName("parcelShop")
    SubscriptionOrderAddressInstanceParcelShop parcelShop;

}