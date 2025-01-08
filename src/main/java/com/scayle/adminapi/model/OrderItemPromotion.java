package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderItemPromotion extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("id")
    String id;

    /**
    * 
    */
    @SerializedName("name")
    String name;

    /**
    * 
    */
    @SerializedName("version")
    String version;

    /**
    * 
    */
    @SerializedName("displayName")
    String displayName;

    /**
    * 
    */
    @SerializedName("code")
    String code;

}