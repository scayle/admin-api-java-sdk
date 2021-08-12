package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cancellation implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("shopKey")
    String shopKey;

    /**
    * 
    */
    @SerializedName("countryCode")
    String countryCode;

    /**
    * 
    */
    @SerializedName("items")
    List<CancellationItem> items;

    /**
    * 
    */
    @SerializedName("orderId")
    Integer orderId;

}