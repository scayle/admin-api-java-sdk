package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CustomerSegmentOverride extends AbstractModel  {
    /**
    * GUID of the customer segment.
    */
    @SerializedName("customerSegmentId")
    String customerSegmentId;

    /**
    * System smart sorting key or custom smart sorting key from the catalog.
    */
    @SerializedName("smartSortingKey")
    Object smartSortingKey;

    /**
    * Priority of this override relative to other segment overrides on the same entity. Must be unique within the array.
    */
    @SerializedName("priority")
    Integer priority;

    /**
    * Whether the customer segment is currently active. Present on read responses only.
    */
    @SerializedName("isActive")
    Boolean isActive;

}