package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CustomerIdentityProvider extends AbstractModel  {
    /**
    * The code of an Identity Provider
    */
    @SerializedName("identityProviderCode")
    String identityProviderCode;

    /**
    * User ID from the external Identity Provider
    */
    @SerializedName("externalUserId")
    String externalUserId;

    public void setExternalUserId(String value) {
        if (value == null) {
            this.setNull("externalUserId");
        }
        this.externalUserId = value;
    }
}