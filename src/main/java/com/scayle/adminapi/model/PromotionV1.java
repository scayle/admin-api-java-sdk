package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PromotionV1 extends AbstractModel  {
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
    * Time range when the promotion is active
    */
    @SerializedName("schedule")
    PromotionScheduleV1 schedule;

    /**
    * Promotion active flag
    */
    @SerializedName("isActive")
    Boolean isActive;

    /**
    * The list of shop ids where the promotion takes place
    */
    @SerializedName("shopId")
    List<String> shopId;

    /**
    * The list of company ids where the promotion takes place
    */
    @SerializedName("companyId")
    List<String> companyId;

    /**
    * Sibling promotions allow/block other promotions from being used together with this one
    */
    @SerializedName("siblingPromotions")
    PromotionSiblingPromotionsV1 siblingPromotions;

    /**
    * Audiences allow/block list. Use it to restrict promotions to specific customer groups
    */
    @SerializedName("audiences")
    PromotionAudiencesV1 audiences;

    /**
    * The effect that will be applied if all conditions are satisfied
    */
    @SerializedName("effect")
    PromotionEffectV1 effect;

    /**
    * The list of conditions ('payload.*') that determines whether the promotion is applicable or not
    */
    @SerializedName("globalConditions")
    List<PromotionGlobalConditionV1> globalConditions;

    /**
    * The list conditions ('item.*') that determine whether promotion is applicable or not for a particular item
    */
    @SerializedName("itemConditions")
    List<PromotionItemConditionV1> itemConditions;

    /**
    * Priority of the promotion
    */
    @SerializedName("priority")
    String priority;

    /**
    * Additional data of the promotion. Can be legal text or some other info, that will be shown to customer
    */
    @SerializedName("additionalData")
    Map<String, Object> additionalData;

    /**
    * The list of promotion tiers. Tiers must be sent in ascending order
    */
    @SerializedName("tiers")
    List<PromotionTierV1> tiers;

}