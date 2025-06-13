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

    public void setName(String value) {
        if (value == null) {
            this.setNull("name");
        }
        this.name = value;
    }
    /**
    * The email of the contact.
    */
    @SerializedName("email")
    String email;

    public void setEmail(String value) {
        if (value == null) {
            this.setNull("email");
        }
        this.email = value;
    }
    /**
    * The phone of the contact.
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
    * The cell phone of the contact.
    */
    @SerializedName("cellPhone")
    String cellPhone;

    public void setCellPhone(String value) {
        if (value == null) {
            this.setNull("cellPhone");
        }
        this.cellPhone = value;
    }
    /**
    * The type of the contact.
    */
    @SerializedName("type")
    String type;

    public void setType(String value) {
        if (value == null) {
            this.setNull("type");
        }
        this.type = value;
    }
    /**
    * The position of the contact.
    */
    @SerializedName("position")
    String position;

    public void setPosition(String value) {
        if (value == null) {
            this.setNull("position");
        }
        this.position = value;
    }
    /**
    * The description of the contact.
    */
    @SerializedName("description")
    String description;

    public void setDescription(String value) {
        if (value == null) {
            this.setNull("description");
        }
        this.description = value;
    }
}