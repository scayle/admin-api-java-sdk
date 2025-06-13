package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MerchantReturnAddress extends AbstractModel  {
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

    public void setName(String value) {
        if (value == null) {
            this.setNull("name");
        }
        this.name = value;
    }
    /**
    * The street name of the return address.
    */
    @SerializedName("street")
    String street;

    public void setStreet(String value) {
        if (value == null) {
            this.setNull("street");
        }
        this.street = value;
    }
    /**
    * The street number of the return address.
    */
    @SerializedName("streetNo")
    String streetNo;

    public void setStreetNo(String value) {
        if (value == null) {
            this.setNull("streetNo");
        }
        this.streetNo = value;
    }
    /**
    * The postal code of the return address.
    */
    @SerializedName("zipCode")
    String zipCode;

    public void setZipCode(String value) {
        if (value == null) {
            this.setNull("zipCode");
        }
        this.zipCode = value;
    }
    /**
    * The city name of the return address.
    */
    @SerializedName("city")
    String city;

    public void setCity(String value) {
        if (value == null) {
            this.setNull("city");
        }
        this.city = value;
    }
    /**
    * ISO 3166 alpha 2 country code.
    */
    @SerializedName("countryCode")
    String countryCode;

    public void setCountryCode(String value) {
        if (value == null) {
            this.setNull("countryCode");
        }
        this.countryCode = value;
    }
    /**
    * The DHL code of the return address.
    */
    @SerializedName("dhlCode")
    String dhlCode;

    public void setDhlCode(String value) {
        if (value == null) {
            this.setNull("dhlCode");
        }
        this.dhlCode = value;
    }
}