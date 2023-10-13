package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product implements ApiObjectInterface {
    /**
    * The ID of the product created by SCAYLE.
    */
    @SerializedName("id")
    Integer id;

    /**
    * If product is in problem state, the reasons are listed here.
    */
    @SerializedName("problems")
    List<String> problems;

    /**
    * A key that uniquely identifies the product (e.g., a shirt in a specific color) within the tenant's ecosystem.
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * The localized product name. At least the base language that is configured in SCAYLE is mandatory.
    */
    @SerializedName("name")
    Map<String, String> name;

    /**
    * The master the product is attached to.
    */
    @SerializedName("master")
    Master master;

    /**
    * The state of the product determined by the state evaluation process. The only possible values to request are `live`, `draft` and `blocked`. The `problem` state can only be the result of the state evaluation process. If product is in problem state, the reasons are listed in read-only 'problems' field. The `new` and `inApproval` states can be set in the SCAYLE Panel.
    */
    @SerializedName("state")
    String state = "live";

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

    /**
    * A list of product sortings.
    */
    @SerializedName("productSortings")
    List<ProductSorting> productSortings;

    /**
    * 
    */
    @SerializedName("customData")
    Object customData;

    /**
    * Indicates whether the product is composite.
    */
    @SerializedName("isComposite")
    Boolean isComposite;

    /**
    * A list of merchant reference keys the product belongs to.
    */
    @SerializedName("merchantReferenceKeys")
    List<String> merchantReferenceKeys;

}