package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerAddressCollectionPoint extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("customerKey")
    String customerKey;

    /**
    * 
    */
    @SerializedName("description")
    String description;

    /**
    * 
    */
    @SerializedName("key")
    String key;

    /**
    * 
    */
    @SerializedName("type")
    String type;

}