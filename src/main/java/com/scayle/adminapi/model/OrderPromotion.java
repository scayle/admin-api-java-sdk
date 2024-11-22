package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderPromotion extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("id")
    String id;

    /**
    * 
    */
    @SerializedName("code")
    String code;

    /**
    * 
    */
    @SerializedName("displayName")
    String displayName;

    /**
    * 
    */
    @SerializedName("reduction")
    String reduction;

    /**
    * 
    */
    @SerializedName("version")
    String version;

}