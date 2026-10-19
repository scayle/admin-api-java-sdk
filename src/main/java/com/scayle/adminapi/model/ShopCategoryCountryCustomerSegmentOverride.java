package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ShopCategoryCountryCustomerSegmentOverride extends AbstractModel  {
    /**
    * GUID of the customer segment.
    */
    @SerializedName("customerSegmentId")
    String customerSegmentId;

    /**
    * System smart sorting key or custom smart sorting key from the catalog.
Optional when `customSortingKey` is set. Shop and shop country overrides still require `smartSortingKey`.

    */
    @SerializedName("smartSortingKey")
    Object smartSortingKey;

    public void setSmartSortingKey(Object value) {
        if (value == null) {
            this.setNull("smartSortingKey");
        }
        this.smartSortingKey = value;
    }
    /**
    * Custom sorting key applied for this customer segment. Null when no custom sorting key is set.
    */
    @SerializedName("customSortingKey")
    String customSortingKey;

    public void setCustomSortingKey(String value) {
        if (value == null) {
            this.setNull("customSortingKey");
        }
        this.customSortingKey = value;
    }
    /**
    * Priority of this override relative to other segment overrides on the same shop category country. Must be unique within the array.
    */
    @SerializedName("priority")
    Integer priority;

    /**
    * Whether the customer segment is currently active. Present on read responses only.
    */
    @SerializedName("isActive")
    Boolean isActive;

}