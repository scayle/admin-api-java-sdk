package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductQualityScoreRuleUpdateOrCreateRequest extends AbstractModel  {
    /**
    * Master category ids that will own this ruleset. Descendants are not sent.
Duplicate ids are stored once. Not accepted on the default ruleset.

    */
    @SerializedName("masterCategoryIds")
    List<Integer> masterCategoryIds;

    /**
    * Attribute group weights. At least one and at most 20.
    */
    @SerializedName("rules")
    List<ProductQualityScoreRuleEntry> rules;

}