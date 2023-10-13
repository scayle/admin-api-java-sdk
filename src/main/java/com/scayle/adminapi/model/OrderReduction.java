package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderReduction implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("amount")
    OrderReductionAmount amount;

    /**
    * 
    */
    @SerializedName("category")
    String category;

    /**
    * 
    */
    @SerializedName("type")
    String type;

}