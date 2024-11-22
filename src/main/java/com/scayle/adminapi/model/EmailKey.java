package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailKey extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * 
    */
    @SerializedName("key")
    String key;

    /**
    * 
    */
    @SerializedName("name")
    String name;

    /**
    * 
    */
    @SerializedName("createdAt")
    String createdAt;

    /**
    * 
    */
    @SerializedName("updatedAt")
    String updatedAt;

}