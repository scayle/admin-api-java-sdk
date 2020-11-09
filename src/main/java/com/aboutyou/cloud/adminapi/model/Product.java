package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product implements ApiObjectInterface {
    /**
    * The id of the product created by Backbone Core.
    */
    @SerializedName("id")
    Integer id;

    /**
    * If product is in problem state, the reasons are listed here.
    */
    @SerializedName("problems")
    List<String> problems;

    /**
    * A key that uniquely identifies the product (e.g. a shirt in a specific color) within the tenant's ecosystem.
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * The localized product name. At least the base language that is configured in Backbone Core is mandatory.
    */
    @SerializedName("name")
    Map<String, String> name;

    /**
    * The master the product is attached to.
    */
    @SerializedName("master")
    Master master;

    /**
    * The state of the product determined by the state evaluation process.
    */
    @SerializedName("state")
    String state = "live";

    /**
    * The products category path. Sorted from root to leaf.
    */
    @SerializedName("categories")
    List<List<String>> categories;

    /**
    * A list of attributes attached to the product.
    */
    @SerializedName("attributes")
    List<Attribute> attributes;

    /**
    * A list of product variants attached to the product.
    */
    @SerializedName("variants")
    List<ProductVariant> variants;

    /**
    * A list of product images attached to the product.
    */
    @SerializedName("images")
    List<ProductImage> images;

}