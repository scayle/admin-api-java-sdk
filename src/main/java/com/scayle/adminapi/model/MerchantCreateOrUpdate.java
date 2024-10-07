package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MerchantCreateOrUpdate implements ApiObjectInterface {
    /**
    * The ID of the merchant created by SCAYLE.
    */
    @SerializedName("id")
    Integer id;

    /**
    * Reference key of the merchant.
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * Name of the merchant.
    */
    @SerializedName("name")
    String name;

    /**
    * Priority of the merchant.
    */
    @SerializedName("priority")
    Integer priority;

    /**
    * URL to send order delegation requests to the merchants.
    */
    @SerializedName("orderDelegationUrl")
    String orderDelegationUrl;

    /**
    * URL to send order cancellation requests.
    */
    @SerializedName("cancellationUrl")
    String cancellationUrl;

}