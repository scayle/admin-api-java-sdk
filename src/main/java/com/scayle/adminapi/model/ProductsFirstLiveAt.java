package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductsFirstLiveAt implements ApiObjectInterface {
    /**
    * A key that uniquely identifies the shop within the tenant's ecosystem.
    */
    @SerializedName("shopKey")
    String shopKey;

    /**
    * List of country codes.
    */
    @SerializedName("countryCodes")
    List<String> countryCodes;

    /**
    * 
    */
    @SerializedName("products")
    List<Object> products;

}