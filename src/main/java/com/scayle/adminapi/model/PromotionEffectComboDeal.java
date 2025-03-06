package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.PromotionEffectComboDealMaxCountType;

@Getter
@Setter
public class PromotionEffectComboDeal extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("price")
    Integer price;

    /**
    * Has to be configured together with `eligibleItemsQuantity`. String, available values:
* `per_eligible_items_quantity`: a customer needs to have a total `eligible_items_quantity` amount of items in the basket.
* `per_item_set`: a customer needs to have a certain amount of items from item sets. The amount of items from each set can be configured in `additional_data.item_sets_configuration`. It can’t be used if `itemSets` list is empty.
* `single_item`: a customer needs to have an `eligibleItemsQuantity` amount of any single item

    */
    @SerializedName("maxCountType")
    PromotionEffectComboDealMaxCountType maxCountType;

    /**
    * How many eligible items a customer needs to have in the basket to fulfill the promotion condition.
    */
    @SerializedName("eligibleItemsQuantity")
    Integer eligibleItemsQuantity;

}