package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.Gender;

@Getter
@Setter
public class SubscriptionOrderAddressInstance extends AbstractModel  {
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
    * Gender of the customer mentioned as per defined ENUM as "m" , "f", "d", "n"
    */
    @SerializedName("gender")
    Gender gender;

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

    public void setPhone(String value) {
        if (value == null) {
            this.setNull("phone");
        }
        this.phone = value;
    }
    /**
    * 
    */
    @SerializedName("state")
    String state;

    public void setState(String value) {
        if (value == null) {
            this.setNull("state");
        }
        this.state = value;
    }
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

    public void setTitle(String value) {
        if (value == null) {
            this.setNull("title");
        }
        this.title = value;
    }
    /**
    * 
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
    * 
    */
    @SerializedName("parcelShop")
    SubscriptionOrderAddressInstanceParcelShop parcelShop;

}