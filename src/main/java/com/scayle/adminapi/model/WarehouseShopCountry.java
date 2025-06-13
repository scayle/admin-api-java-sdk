package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class WarehouseShopCountry extends AbstractModel  {
    /**
    * The key of the shop created by SCAYLE.
    */
    @SerializedName("shopKey")
    String shopKey;

    /**
    * ISO 3166 alpha 2 country code.
    */
    @SerializedName("countryCode")
    String countryCode;

    /**
    * The priority of the warehouse. The higher the value, the higher the priority.
    */
    @SerializedName("priority")
    Integer priority;

    public void setPriority(Integer value) {
        if (value == null) {
            this.setNull("priority");
        }
        this.priority = value;
    }
    /**
    * The assigned package group of the warehouse.
    */
    @SerializedName("packageGroup")
    PackageGroup packageGroup;

    public void setPackageGroup(PackageGroup value) {
        if (value == null) {
            this.setNull("packageGroup");
        }
        this.packageGroup = value;
    }
}