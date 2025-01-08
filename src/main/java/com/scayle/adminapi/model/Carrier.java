package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Carrier extends AbstractModel  {
    /**
    * The ID of the carrier created by SCAYLE.
    */
    @SerializedName("id")
    Integer id;

    /**
    * The key of the carrier.
    */
    @SerializedName("key")
    String key;

    /**
    * Name of the carrier.
    */
    @SerializedName("name")
    String name;

    /**
    * Tracking URL of the carrier.
    */
    @SerializedName("trackingUrl")
    String trackingUrl;

}