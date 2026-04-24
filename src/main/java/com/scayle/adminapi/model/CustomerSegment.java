package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CustomerSegment extends AbstractModel  {
    /**
    * Unique identifier of the segment.
    */
    @SerializedName("guid")
    String guid;

    /**
    * Business-facing identifier.
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * Display name of the segment.
    */
    @SerializedName("name")
    String name;

    /**
    * Criteria DSL defining the segment rules (e.g. `"TIER-A" IN groups AND LTV > 1000`).
    */
    @SerializedName("criteriaDsl")
    String criteriaDsl;

    /**
    * The number of conditions in the criteriaDsl.
    */
    @SerializedName("rules")
    Integer rules;

    /**
    * Whether the segment is active.
    */
    @SerializedName("active")
    Boolean active;

    /**
    * 
    */
    @SerializedName("createdDate")
    java.time.Instant createdDate;

    /**
    * 
    */
    @SerializedName("updatedDate")
    java.time.Instant updatedDate;

}