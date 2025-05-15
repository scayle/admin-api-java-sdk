package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.PromotionEffectAutomationDiscountType;
import com.scayle.adminapi.enums.PromotionEffectDiscountDistribution;

@Getter
@Setter
public class PromotionEffectAutomaticDiscount extends AbstractModel  {
    /**
    * Depicts if the discount should be % of item cost or absolute amount that can be reduced from the item cost.
    */
    @SerializedName("type")
    PromotionEffectAutomationDiscountType type;

    /**
    * Integer value that depicts relative (percentage) or absolute amount - currency is considered from the shop settings.
    */
    @SerializedName("value")
    Double value;

    /**
    * - **none**: Applies the promotion reduction only to unit items specified in `promotionGroups.*.applicableUnitItemIds`. Items in `promotionGroups.*.eligibleUnitItemIds` receive a reduction of 0.
- **pro_rata**: Distributes the promotion reduction proportionally among all `promotionGroups` and unit items within them.

    */
    @SerializedName("discountDistribution")
    PromotionEffectDiscountDistribution discountDistribution;

}