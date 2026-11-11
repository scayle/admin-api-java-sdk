package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductQualityScoreRule extends AbstractModel  {
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
    * Attribute group weights stored on this ruleset.
    */
    @SerializedName("rules")
    List<ProductQualityScoreRuleEntry> rules;

    /**
    * Master category ids that own this ruleset. Only categories with
`isInherited` false are listed, in ascending id. Empty when the ruleset
has no owners.

    */
    @SerializedName("masterCategoryIds")
    List<Integer> masterCategoryIds;

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