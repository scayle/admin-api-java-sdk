package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.PromotionStatus;
import com.scayle.adminapi.enums.PromotionActivationType;
import com.scayle.adminapi.enums.PromotionLevel;

@Getter
@Setter
public class Promotion extends AbstractModel  {
    /**
    * Promotion id
    */
    @SerializedName("id")
    String id;

    /**
    * Promotion version
    */
    @SerializedName("version")
    String version;

    /**
    * Name of the promotion
    */
    @SerializedName("name")
    String name;

    /**
    * Display name localisation
    */
    @SerializedName("displayName")
    Map<String, String> displayName;

    /**
    * The status of the promotion
    */
    @SerializedName("status")
    PromotionStatus status;

    /**
    * Promotion activation type
    */
    @SerializedName("activationType")
    PromotionActivationType activationType;

    /**
    * Promotion application level
    */
    @SerializedName("level")
    PromotionLevel level;

    /**
    * Time range when the promotion is active
    */
    @SerializedName("schedule")
    PromotionSchedule schedule;

    /**
    * The list of company ids where the promotion takes place
    */
    @SerializedName("companyIds")
    List<Integer> companyIds;

    /**
    * The list of shop country ids where the promotion takes place
    */
    @SerializedName("shopCountryIds")
    PromotionShopCountryId shopCountryIds;

    /**
    * Sibling promotions allow/block other promotions from being used together with this one
    */
    @SerializedName("siblingPromotions")
    PromotionSiblingPromotion siblingPromotions;

    /**
    * Audiences allow/block list. Use it to restrict promotions to specific customer groups
    */
    @SerializedName("audiences")
    PromotionAudience audiences;

    /**
    * The effect that will be applied if all conditions are satisfied
    */
    @SerializedName("effect")
    PromotionEffect effect;

    /**
    * The list of conditions ('payload.*') that determines whether the promotion is applicable or not
    */
    @SerializedName("conditions")
    List<PromotionCondition> conditions;

    /**
    * The list of itemSet IDs that can be applied into the promotion
    */
    @SerializedName("itemSetIds")
    List<String> itemSetIds;

    /**
    * Priority of the promotion
    */
    @SerializedName("priority")
    Integer priority;

    /**
    * Additional data of the promotion. Can be legal text or some other info, that will be shown to customer
    */
    @SerializedName("customData")
    Map<String, Object> customData;

    /**
    * The list of promotion tiers. Tiers must be sent in ascending order
    */
    @SerializedName("tiers")
    List<PromotionTier> tiers;

    /**
    * 
    */
    @SerializedName("usageLimit")
    PromotionUsageLimit usageLimit;

}