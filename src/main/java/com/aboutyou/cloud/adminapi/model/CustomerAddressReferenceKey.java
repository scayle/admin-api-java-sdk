package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerAddressReferenceKey implements ApiObjectInterface {
    /**
    * External address reference set by the client to integrate a 3rd party system
    */
    @SerializedName("referenceKey")
    String referenceKey;

}