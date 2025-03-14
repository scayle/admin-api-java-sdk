package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PromotionTierEffectV1 extends AbstractModel  {
    /**
    * Additional data of the promotion tier effect
    */
    @SerializedName("additionalData")
    Map<String, Object> additionalData;

}