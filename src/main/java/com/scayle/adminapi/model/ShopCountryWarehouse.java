package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopCountryWarehouse extends AbstractModel  {
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
    * The priority of the warehouse. The higher the value, the higher the priority.
    */
    @SerializedName("priority")
    Integer priority;

    /**
    * The assigned package group of the warehouse.
    */
    @SerializedName("packageGroup")
    PackageGroup packageGroup;

}