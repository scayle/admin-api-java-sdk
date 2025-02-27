package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderItemVariant extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("stock")
    OrderItemVariantStock stock;

    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * External reference set by the client to integrate third party systems.
    */
    @SerializedName("referenceKey")
    String referenceKey;

}