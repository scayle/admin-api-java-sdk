package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.PromotionSiblingPromotionLevel;

@Getter
@Setter
public class PromotionSiblingPromotion extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("enabled")
    Boolean enabled;

    /**
    * The list of promotion ids that can be applied together with this promotion
    */
    @SerializedName("allowList")
    List<String> allowList;

    /**
    * The list of promotion ids that can not be applied together with this promotion
    */
    @SerializedName("blockList")
    List<String> blockList;

    /**
    * The level on which promotion is applied
    */
    @SerializedName("level")
    PromotionSiblingPromotionLevel level;

}