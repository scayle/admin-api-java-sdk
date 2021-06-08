package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerAddressRecipient implements ApiObjectInterface {
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
    @SerializedName("title")
    String title;

    /**
    * 
    */
    @SerializedName("type")
    String type;

}