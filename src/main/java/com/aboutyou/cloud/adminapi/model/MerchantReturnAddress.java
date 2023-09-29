package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MerchantReturnAddress implements ApiObjectInterface {
    /**
    * The ID of the return address created by SCAYLE.
    */
    @SerializedName("id")
    Integer id;

    /**
    * The name of the return address.
    */
    @SerializedName("name")
    String name;

    /**
    * The street name of the return address.
    */
    @SerializedName("street")
    String street;

    /**
    * The street number of the return address.
    */
    @SerializedName("streetNo")
    String streetNo;

    /**
    * The postal code of the return address.
    */
    @SerializedName("zipCode")
    String zipCode;

    /**
    * The city name of the return address.
    */
    @SerializedName("city")
    String city;

    /**
    * ISO 3166 alpha 2 country code.
    */
    @SerializedName("countryCode")
    String countryCode;

    /**
    * The DHL code of the return address.
    */
    @SerializedName("dhlCode")
    String dhlCode;

}