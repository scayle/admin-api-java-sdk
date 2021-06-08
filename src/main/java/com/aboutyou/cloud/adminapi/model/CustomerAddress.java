package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerAddress implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * External reference set by the client to integrate 3rd party systems
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * 
    */
    @SerializedName("street")
    String street;

    /**
    * 
    */
    @SerializedName("houseNumber")
    String houseNumber;

    /**
    * Additional data pertaining to the address, such as `c/o AboutYou`.
    */
    @SerializedName("additional")
    String additional;

    /**
    * 
    */
    @SerializedName("zipCode")
    String zipCode;

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
    @SerializedName("collectionPoint")
    CustomerAddressCollectionPoint collectionPoint;

    /**
    * 
    */
    @SerializedName("isDefault")
    CustomerAddressDefault isDefault;

    /**
    * 
    */
    @SerializedName("recipient")
    CustomerAddressRecipient recipient;

}