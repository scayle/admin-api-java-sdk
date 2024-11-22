package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemProduct extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * The product name.
    */
    @SerializedName("name")
    String name;

    /**
    * 
    */
    @SerializedName("images")
    List<OrderItemProductImage> images;

}