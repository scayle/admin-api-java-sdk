package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Redirect implements ApiObjectInterface {
    /**
    * id of the redirect
    */
    @SerializedName("id")
    Integer id;

    /**
    * url of the source
    */
    @SerializedName("source")
    String source;

    /**
    * url of the target
    */
    @SerializedName("target")
    String target;

    /**
    * status of the redirect
    */
    @SerializedName("statusCode")
    Integer statusCode;

    /**
    * 
    */
    @SerializedName("isRegex")
    Boolean isRegex;

    /**
    * 
    */
    @SerializedName("parent")
    Redirect parent;

    /**
    * 
    */
    @SerializedName("priority")
    Integer priority;

    /**
    * 
    */
    @SerializedName("error")
    RedirectError error;

    /**
    * Timestamp when the redirect is created
    */
    @SerializedName("createdAt")
    String createdAt;

    /**
    * Timestamp when the redirect is updated
    */
    @SerializedName("updatedAt")
    String updatedAt;

}