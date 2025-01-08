package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MerchantProductState extends AbstractModel  {
    /**
    * Reference key of the merchant to which the product belongs to.
    */
    @SerializedName("merchantReferenceKey")
    String merchantReferenceKey;

    /**
    * State of the merchant product.
    */
    @SerializedName("state")
    String state;

}