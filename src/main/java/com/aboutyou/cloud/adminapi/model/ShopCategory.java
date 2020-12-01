package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopCategory implements ApiObjectInterface {
    /**
    * The id of the shop category
    */
    @SerializedName("id")
    Integer id;

    /**
    * The id of the parent shop category
    */
    @SerializedName("parentId")
    Integer parentId;

    /**
    * The id of the left sibling shop category. It defines the shop category position in the category tree.
    */
    @SerializedName("leftSiblingId")
    Integer leftSiblingId;

    /**
    * The internal name of the shop category.
    */
    @SerializedName("name")
    String name;

    /**
    * When the flag is set to true on a category node, the category is a self containing tree. The parent of that node will not inherit the product assortments of the node.
    */
    @SerializedName("stopBubbleUp")
    Boolean stopBubbleUp;

    /**
    * 
    */
    @SerializedName("products")
    ShopCategoryProducts products;

    /**
    * 
    */
    @SerializedName("configuration")
    ShopCategoryConfiguration configuration;

    /**
    * List of supported filter groups
    */
    @SerializedName("supportedFilterGroups")
    List<String> supportedFilterGroups;

}