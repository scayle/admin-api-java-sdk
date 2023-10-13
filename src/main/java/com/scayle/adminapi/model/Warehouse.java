package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Warehouse implements ApiObjectInterface {
    /**
    * The ID of the warehouse created by SCAYLE.
    */
    @SerializedName("id")
    Integer id;

    /**
    * A key that uniquely identifies the warehouse within the tenant's ecosystem.
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * A list of merchants the warehouse is attached to.
    */
    @SerializedName("merchants")
    List<Merchant> merchants;

    /**
    * Shop country information related to the warehouse.
    */
    @SerializedName("shopCountries")
    List<WarehouseShopCountry> shopCountries;

}