package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductVariantUnitPrice implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("unit")
    String unit;

    /**
    * 
    */
    @SerializedName("amount")
    Integer amount;

    /**
    * 
    */
    @SerializedName("price")
    Integer price;

}