package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PackageGroupWarehouse implements ApiObjectInterface {
    /**
    * The ID of the warehouse created by SCAYLE.
    */
    @SerializedName("warehouseId")
    Integer warehouseId;

    /**
    * A key that uniquely identifies the warehouse within the tenant's ecosystem.
    */
    @SerializedName("warehouseReferenceKey")
    String warehouseReferenceKey;

}