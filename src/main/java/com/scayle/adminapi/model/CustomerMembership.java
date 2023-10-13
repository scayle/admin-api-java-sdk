package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerMembership implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * Membership state.
    */
    @SerializedName("isActive")
    Boolean isActive;

    /**
    * Membership type key.
    */
    @SerializedName("typeKey")
    String typeKey;

    /**
    * Membership account number.
    */
    @SerializedName("accountNumber")
    String accountNumber;

    /**
    * Timestamp when the membership is created.
    */
    @SerializedName("createdAt")
    String createdAt;

    /**
    * Timestamp when the membership is updated.
    */
    @SerializedName("updatedAt")
    String updatedAt;

}