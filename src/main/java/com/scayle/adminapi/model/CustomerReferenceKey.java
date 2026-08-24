package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CustomerReferenceKey extends AbstractModel  {
    /**
    * External reference set by the client to integrate a third party system. It can be set to NULL otherwise
    */
    @SerializedName("referenceKey")
    String referenceKey;

    public void setReferenceKey(String value) {
        if (value == null) {
            this.setNull("referenceKey");
        }
        this.referenceKey = value;
    }
}