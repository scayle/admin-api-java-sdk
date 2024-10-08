package com.scayle.adminapi.model;

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
    * External reference set by the client to integrate third party systems.
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * Street is the mandatory string value in recipient's address
    */
    @SerializedName("street")
    String street;

    /**
    * House number of the recipient address
    */
    @SerializedName("houseNumber")
    String houseNumber;

    /**
    * Additional data pertaining to the address
    */
    @SerializedName("additional")
    String additional;

    /**
    * Zip code is the postal code of the recipient's location. Its a mandatory value
    */
    @SerializedName("zipCode")
    String zipCode;

    /**
    * City of the recipient. It is a mandatory value
    */
    @SerializedName("city")
    String city;

    /**
    * ISO 3166-1 alpha-3 country code
    */
    @SerializedName("countryCode")
    String countryCode;

    /**
    * Details of the point where the parcel is received (if used)
    */
    @SerializedName("collectionPoint")
    CustomerAddressCollectionPoint collectionPoint;

    /**
    * Defines whether the address is the default billing and shipping address
    */
    @SerializedName("isDefault")
    CustomerAddressDefault isDefault;

    /**
    * Recipient personal details
    */
    @SerializedName("recipient")
    CustomerAddressRecipient recipient;

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

}