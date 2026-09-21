package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderAddress extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("billing")
    Object billing;

    /**
    * Carrier-chosen fallback if the parcel cannot be handed over (forward to a collection point).
Not a physical address; street, city, zipCode, recipient names, and collectionPoint.key may be absent.

    */
    @SerializedName("forward")
    CustomerAddress forward;

    /**
    * 
    */
    @SerializedName("shipping")
    Object shipping;

}