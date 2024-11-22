package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cancellation extends AbstractModel  {
    /**
    * A key that uniquely identifies the shop within the tenant's ecosystem. Must be exactly 2 chars long.
    */
    @SerializedName("shopKey")
    String shopKey;

    /**
    * ISO 3166 alpha 2 country code; use shop country ID instead of country code when a country is ambiguous within a shop
    */
    @SerializedName("countryCode")
    String countryCode;

    /**
    * Collection of items requested for cancellation
    */
    @SerializedName("items")
    List<CancellationItem> items;

    /**
    * Unique identity of the order for which the cancellation was requested
    */
    @SerializedName("orderId")
    Integer orderId;

}