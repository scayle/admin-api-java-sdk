package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Assortment implements ApiObjectInterface {
    /**
    * Configuration of master category includes/excludes.
    */
    @SerializedName("masterCategories")
    MasterCategoryAssortmentConfiguration masterCategories;

    /**
    * Configuration of product includes/excludes.
    */
    @SerializedName("products")
    ProductAssortmentConfiguration products;

    /**
    * Configuration of attribute includes/excludes.
    */
    @SerializedName("attributes")
    List<AttributeAssortmentConfiguration> attributes;

    /**
    * Configuration of merchant includes/excludes.
    */
    @SerializedName("merchantReferenceKeys")
    MerchantAssortmentConfiguration merchantReferenceKeys;

}