package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * External reference set by the client to integrate a third party system.
    */
    @SerializedName("referenceKey")
    String referenceKey;

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
    * 
    */
    @SerializedName("gender")
    String gender;

    /**
    * 
    */
    @SerializedName("birthDate")
    String birthDate;

    /**
    * 
    */
    @SerializedName("email")
    String email;

    /**
    * 
    */
    @SerializedName("phone")
    String phone;

    /**
    * Public reference set by the client to display to customers in account areas and transactional emails.
    */
    @SerializedName("publicKey")
    String publicKey;

    /**
    * 
    */
    @SerializedName("title")
    String title;

    /**
    * 
    */
    @SerializedName("type")
    String type;

    /**
    * 
    */
    @SerializedName("groups")
    List<String> groups;

    /**
    * 
    */
    @SerializedName("status")
    CustomerStatus status;

    /**
    * 
    */
    @SerializedName("addresses")
    List<CustomerAddress> addresses;

    /**
    * 
    */
    @SerializedName("legacyCustomData")
    Map<String, Object> legacyCustomData;

}