package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopCategoryConfiguration implements ApiObjectInterface {
    /**
    * The name of the category, which is displayed in the shop.
    */
    @SerializedName("name")
    String name;

    /**
    * String representation of the URL path to the category.
    */
    @SerializedName("url")
    String url;

    /**
    * Declares whether the shop category is active or not.
    */
    @SerializedName("isActive")
    Boolean isActive;

    /**
    * Declares whether the shop category is visible in the shop or not.
    */
    @SerializedName("isVisible")
    Boolean isVisible;

    /**
    * The properties assigned to the shop category.
    */
    @SerializedName("properties")
    List<ShopCategoryProperty> properties;

}