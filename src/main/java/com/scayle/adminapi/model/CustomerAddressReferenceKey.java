package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CustomerAddressReferenceKey extends AbstractModel  {
    /**
    * External address reference set by the client to integrate a third party system.
    */
    @SerializedName("referenceKey")
    String referenceKey;

}