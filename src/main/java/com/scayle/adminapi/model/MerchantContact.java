package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MerchantContact extends AbstractModel  {
    /**
    * The ID of the contact created by SCAYLE.
    */
    @SerializedName("id")
    Integer id;

    /**
    * The name of the contact.
    */
    @SerializedName("name")
    String name;

    /**
    * The email of the contact.
    */
    @SerializedName("email")
    String email;

    /**
    * The phone of the contact.
    */
    @SerializedName("phone")
    String phone;

    /**
    * The cell phone of the contact.
    */
    @SerializedName("cellPhone")
    String cellPhone;

    /**
    * The type of the contact.
    */
    @SerializedName("type")
    String type;

    /**
    * The position of the contact.
    */
    @SerializedName("position")
    String position;

    /**
    * The description of the contact.
    */
    @SerializedName("description")
    String description;

}