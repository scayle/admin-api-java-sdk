package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopCategoryProductCriteria implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("isNew")
    Boolean isNew;

    /**
    * 
    */
    @SerializedName("attributes")
    List<ShopCategoryAttributeCriterion> attributes;

    /**
    * 
    */
    @SerializedName("categories")
    ShopCategoryCategoryCriterion categories;

}