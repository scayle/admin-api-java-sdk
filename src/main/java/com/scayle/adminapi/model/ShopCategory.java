package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ShopCategory extends AbstractModel  {
    /**
    * The ID of the shop category.
    */
    @SerializedName("id")
    Integer id;

    /**
    * The ID of the parent shop category.
    */
    @SerializedName("parentId")
    Integer parentId;

    /**
    * The ID of the left sibling shop category. It defines the shop category position in the category tree.
    */
    @SerializedName("leftSiblingId")
    Integer leftSiblingId;

    /**
    * The localized category name.
    */
    @SerializedName("name")
    Map<String, String> name;

    /**
    * Product sets define which products to include in the shop category.
    */
    @SerializedName("productSets")
    List<ShopCategoryProductSet> productSets;

    /**
    * List of supported filter groups.
    */
    @SerializedName("supportedFilterGroups")
    List<String> supportedFilterGroups;

    /**
    * The properties assigned to the shop category. Can be specified on creation only.
    */
    @SerializedName("properties")
    List<ShopCategoryProperty> properties;

    /**
    * Declares whether the shop category is active or not. Can be specified on creation only.
    */
    @SerializedName("isActive")
    Boolean isActive;

    /**
    * Declares whether the shop category is visible in the shop or not. Can be specified on creation only.
    */
    @SerializedName("isVisible")
    Boolean isVisible;

    /**
    * Declares whether the shop category should be excluded from search.
    */
    @SerializedName("isExcludedFromSearch")
    Boolean isExcludedFromSearch;

    /**
    * Arbitrary fields assigned to shop categories
    */
    @SerializedName("customData")
    Object customData;

    /**
    * List of country specific configurations.
    */
    @SerializedName("countries")
    List<ShopCategoryCountry> countries;

}