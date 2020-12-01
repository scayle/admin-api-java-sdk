package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopCategoryProducts implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("ids")
    ShopCategoryProductIds ids;

    /**
    * Criteria, which define products included in or excluded from the shop category.
    */
    @SerializedName("criteria")
    List<ShopCategoryProductCriteria> criteria;

}