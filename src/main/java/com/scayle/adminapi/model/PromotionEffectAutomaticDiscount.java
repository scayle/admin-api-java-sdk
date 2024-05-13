package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PromotionEffectAutomaticDiscount implements ApiObjectInterface {
    /**
    * Depicts if the discount should be % of item cost or absolute amount that can be reduced from the item cost.
    */
    @SerializedName("type")
    String type;

    /**
    * Integer value that depicts percentage or absolute amount - currency is considered from the shop settings.
    */
    @SerializedName("value")
    Double value;

}