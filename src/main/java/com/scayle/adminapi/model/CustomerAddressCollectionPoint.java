package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CustomerAddressCollectionPoint extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("customerKey")
    String customerKey;

    /**
    * 
    */
    @SerializedName("description")
    String description;

    /**
    * Identity of a specific collection point (for example a Packstation or ParcelShop).
Required for billing and shipping pickup addresses. Omitted on order `address.forward`,
where the carrier chooses the branch at delivery.

    */
    @SerializedName("key")
    String key;

    /**
    * 
    */
    @SerializedName("type")
    String type;

}