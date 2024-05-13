package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PromotionUsageLimit implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("promotion")
    PromotionUsageLimitPromotion promotion;

    /**
    * 
    */
    @SerializedName("promotionCodes")
    PromotionUsageLimitPromotionCode promotionCodes;

}