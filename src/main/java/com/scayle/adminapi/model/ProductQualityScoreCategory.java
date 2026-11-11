package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductQualityScoreCategory extends AbstractModel  {
    /**
    * Identifier of the product quality score rule.
    */
    @SerializedName("id")
    Integer id;

    /**
    * Whether this is the default ruleset.
    */
    @SerializedName("isDefault")
    Boolean isDefault;

    /**
    * Whether this category inherits the ruleset from an ancestor.
    */
    @SerializedName("isInherited")
    Boolean isInherited;

    /**
    * Attribute group weights stored on this ruleset.
    */
    @SerializedName("rules")
    List<ProductQualityScoreRuleEntry> rules;

    /**
    * Timestamp when the ruleset was created.
    */
    @SerializedName("createdAt")
    java.time.Instant createdAt;

    /**
    * Timestamp when the ruleset was last updated.
    */
    @SerializedName("updatedAt")
    java.time.Instant updatedAt;

}