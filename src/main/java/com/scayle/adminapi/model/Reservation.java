package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Reservation extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * 
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * 
    */
    @SerializedName("warehouseReferenceKey")
    String warehouseReferenceKey;

    /**
    * 
    */
    @SerializedName("variant")
    ReservationVariant variant;

    /**
    * 
    */
    @SerializedName("error")
    ReservationError error;

}