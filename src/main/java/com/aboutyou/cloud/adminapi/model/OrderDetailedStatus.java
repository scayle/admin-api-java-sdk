package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDetailedStatus implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("order")
    OrderDetailedStatusItem order;

    /**
    * 
    */
    @SerializedName("shipping")
    OrderDetailedStatusItem shipping;

    /**
    * 
    */
    @SerializedName("billing")
    OrderDetailedStatusItem billing;

}