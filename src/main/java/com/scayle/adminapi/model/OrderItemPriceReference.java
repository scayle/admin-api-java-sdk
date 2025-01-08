package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderItemPriceReference extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("size")
    String size;

    /**
    * 
    */
    @SerializedName("unit")
    String unit;

    /**
    * 
    */
    @SerializedName("withTax")
    Integer withTax;

}