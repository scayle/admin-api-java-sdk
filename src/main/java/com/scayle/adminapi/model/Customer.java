package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.Gender;

@Getter
@Setter
public class Customer extends AbstractModel  {
    /**
    * The ID of the customer
    */
    @SerializedName("id")
    Integer id;

    /**
    * External reference set by the client to integrate a third party system.
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * First name of the customer
    */
    @SerializedName("firstName")
    String firstName;

    /**
    * Last name of the customer
    */
    @SerializedName("lastName")
    String lastName;

    /**
    * Gender of the customer mentioned as per defined ENUM as "m" , "f", "d", "n"
    */
    @SerializedName("gender")
    Gender gender;

    /**
    * Date of birth of the customer in YYYY-MM-DD format
    */
    @SerializedName("birthDate")
    String birthDate;

    /**
    * email address of the customer
    */
    @SerializedName("email")
    String email;

    /**
    * phone number of the customer
    */
    @SerializedName("phone")
    String phone;

    /**
    * Public reference set by the client to display to customers in account areas and transactional emails.
    */
    @SerializedName("publicKey")
    String publicKey;

    /**
    * User defined title. It can be set to NULL otherwise
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
    * Type of customer (like personal)
    */
    @SerializedName("type")
    String type;

    /**
    * Group to which the customer belongs to
    */
    @SerializedName("groups")
    List<String> groups;

    /**
    * A list of Identity Providers (IDP)
    */
    @SerializedName("identities")
    List<CustomerIdentityProvider> identities;

    /**
    * Defines if customer isActive or not and if customer isGuestCustomer or not
    */
    @SerializedName("status")
    CustomerStatus status;

    /**
    * Company to which the customer belongs to
    */
    @SerializedName("company")
    Company company;

    /**
    * Customers address (es)
    */
    @SerializedName("addresses")
    List<CustomerAddress> addresses;

    /**
    * Custom data added to the customers (legacy feature)
    */
    @SerializedName("legacyCustomData")
    Object legacyCustomData;

    /**
    * Defines if the customer has a password set.
    */
    @SerializedName("hasPassword")
    Boolean hasPassword;

    /**
    * Timestamp when the customer is created
    */
    @SerializedName("createdAt")
    java.time.Instant createdAt;

    /**
    * Timestamp when the customer is updated
    */
    @SerializedName("updatedAt")
    java.time.Instant updatedAt;

}