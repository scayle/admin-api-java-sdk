package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.PromotionEffectMaxCountType;
import com.scayle.adminapi.enums.PromotionEffectBuyXGetYDiscountType;
import com.scayle.adminapi.enums.PromotionEffectBuyXGetYDiscountDistribution;
import com.scayle.adminapi.enums.PromotionEffectBuyXGetYApplicableItemSelectionType;

@Getter
@Setter
public class PromotionEffectBuyXGetY extends AbstractModel  {
    /**
    * Depicts what items can be given away for free when the promotion conditions match.
    */
    @SerializedName("variantIds")
    List<Integer> variantIds;

    /**
    * Depicts maximum no of items that can be given for free as part of this promotion
    */
    @SerializedName("maxCount")
    Integer maxCount;

    /**
    * Has to be configured together with `eligibleItemsQuantity`. String, available values:
* omit for empty
* `per_eligible_unique_items`: Requires a total `eligibleItemsQuantity` of unique eligible items. Quantity is summed across all item sets if multiple are used.
* `per_eligible_items_quantity`: Requires a total `eligibleItemsQuantity` of eligible items. Quantity is summed across all item sets if multiple are used.
* `per_item_set`: Requires `eligibleItemsQuantity` of eligible items from each item set. Not applicable if the item_sets list is empty.
* `single_item`: Requires `eligibleItemsQuantity` of any single eligible item.

    */
    @SerializedName("maxCountType")
    PromotionEffectMaxCountType maxCountType;

    /**
    * Has to be configured with `maxCountType=per_eligible_items_quantity`. Used for calculating of limit free items, check formula above.
    */
    @SerializedName("eligibleItemsQuantity")
    Integer eligibleItemsQuantity;

    /**
    * Depicts if the discount should be % of item cost or absolute amount that can be reduced from the item cost.
    */
    @SerializedName("discountType")
    PromotionEffectBuyXGetYDiscountType discountType;

    /**
    * Integer value that depicts relative (percentage) or absolute amount - currency is considered from the shop settings.
    */
    @SerializedName("discountValue")
    Double discountValue;

    /**
    * - **none**: Applies the promotion reduction only to unit items specified in `promotionGroups.*.applicableUnitItemIds`. Items in `promotionGroups.*.eligibleUnitItemIds` receive a reduction of 0.
- **pro_rata**: Distributes the promotion reduction proportionally among all `promotionGroups` and unit items within them.

    */
    @SerializedName("discountDistribution")
    PromotionEffectBuyXGetYDiscountDistribution discountDistribution;

    /**
    * Allows different `y` item selection strategies:  
* `variant_ids`: The `y` item is selected from the provided `additionalData.variantIds` list. This type allows to support already existing promotions.
* `cheapest`:
  * `x` item - the most expensive item from eligible items is selected
  * `y` item - the cheapest item from eligible items is selected
* `most_expensive`:
  * `x` item - the first most expensive item from eligible items is selected
  * `y` item - the second most expensive item from eligible items is selected

    */
    @SerializedName("applicableItemSelectionType")
    PromotionEffectBuyXGetYApplicableItemSelectionType applicableItemSelectionType;

}