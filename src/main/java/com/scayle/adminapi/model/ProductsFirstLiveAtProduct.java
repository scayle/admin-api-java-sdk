package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductsFirstLiveAtProduct extends AbstractModel  {
    /**
    * Id of the product.
    */
    @SerializedName("productId")
    Integer productId;

    /**
    * Date and time of first live at.
    */
    @SerializedName("firstLiveAt")
    java.time.Instant firstLiveAt;

}