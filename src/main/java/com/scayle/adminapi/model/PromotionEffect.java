package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.PromotionEffectType;

@Getter
@Setter
public class PromotionEffect extends AbstractModel  {
    /**
    * Type of the promotion
    */
    @SerializedName("type")
    PromotionEffectType type;

    /**
    * Additional data of the promotion effect, maxCountType and eligibleItemsQuantity are optional
    */
    @SerializedName("additionalData")
    Object additionalData;

}