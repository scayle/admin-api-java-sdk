package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carrier implements ApiObjectInterface {
    /**
    * The ID of the carrier created by SCAYLE.
    */
    @SerializedName("id")
    Integer id;

    /**
    * Reference key of the carrier.
    */
    @SerializedName("referenceKey")
    String referenceKey;

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