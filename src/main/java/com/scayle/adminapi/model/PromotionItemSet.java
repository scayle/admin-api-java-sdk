package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PromotionItemSet extends AbstractModel  {
    /**
    * Item Set id
    */
    @SerializedName("id")
    String id;

    /**
    * Name of the item set
    */
    @SerializedName("name")
    String name;

    /**
    * A list of variant ids that belong to the item set
    */
    @SerializedName("variantIds")
    List<Integer> variantIds;

    /**
    * A Common Expression Language valid condition
    */
    @SerializedName("condition")
    String condition;

    /**
    * Specifies how many items need to be in a basket to form a group. The usage of this configuration depends on a promotion `max_count_type` configuration.
    */
    @SerializedName("eligibleItemsQuantity")
    Integer eligibleItemsQuantity;

}