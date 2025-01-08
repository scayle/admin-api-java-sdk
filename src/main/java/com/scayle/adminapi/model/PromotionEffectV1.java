package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.PromotionEffectType;

@Getter
@Setter
public class PromotionEffectV1 extends AbstractModel  {
    /**
    * Type of the promotion
    */
    @SerializedName("id")
    PromotionEffectType id;

    /**
    * Additional data of the promotion effect, max_count_type and eligible_items_quantity are optional
    */
    @SerializedName("additionalData")
    Object additionalData;

}