package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Merchant extends AbstractModel  {
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

    /**
    * A list of merchant contacts.
    */
    @SerializedName("contacts")
    List<MerchantContact> contacts;

    /**
    * A list of merchant return addresses.
    */
    @SerializedName("returnAddresses")
    List<MerchantReturnAddress> returnAddresses;

    /**
    * A list of carriers attached to the merchant.
    */
    @SerializedName("carriers")
    List<MerchantCarrier> carriers;

    /**
    * A list of warehouses attached to the merchant.
    */
    @SerializedName("warehouses")
    List<Object> warehouses;

}