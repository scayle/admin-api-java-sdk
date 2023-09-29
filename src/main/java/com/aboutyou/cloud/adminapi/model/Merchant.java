package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Merchant implements ApiObjectInterface {
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

}