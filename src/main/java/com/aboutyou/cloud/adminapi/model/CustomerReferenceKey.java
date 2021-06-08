package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerReferenceKey implements ApiObjectInterface {
    /**
    * External reference set by the client to integrate a 3rd party system
    */
    @SerializedName("referenceKey")
    String referenceKey;

}