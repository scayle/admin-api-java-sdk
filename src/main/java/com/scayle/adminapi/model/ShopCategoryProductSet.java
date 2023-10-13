package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopCategoryProductSet implements ApiObjectInterface {
    /**
    * The ID of the product set.
    */
    @SerializedName("productSetId")
    Integer productSetId;

    /**
    * The ID of the referenced product set.
    */
    @SerializedName("referencedProductSetId")
    Integer referencedProductSetId;

    /**
    * Product IDs, which are explicitly included in the shop category.
    */
    @SerializedName("includeProductIds")
    List<Integer> includeProductIds;

    /**
    * Product IDs, which are explicitly excluded from the shop category.
    */
    @SerializedName("excludeProductIds")
    List<Integer> excludeProductIds;

    /**
    * Declares whether the product set should only contain new products.
    */
    @SerializedName("isNew")
    Boolean isNew;

    /**
    * Defines which products to include or exclude by attributes.
    */
    @SerializedName("attributes")
    List<ShopCategoryAttributeCriterion> attributes;

}