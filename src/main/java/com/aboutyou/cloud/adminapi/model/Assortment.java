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
    * Configuration of Master Category includes/excludes.
    */
    @SerializedName("masterCategories")
    MasterCategoryAssortmentConfiguration masterCategories;

    /**
    * Configuration of Product includes/excludes.
    */
    @SerializedName("products")
    ProductAssortmentConfiguration products;

    /**
    * Configuration of Attribute includes/excludes.
    */
    @SerializedName("attributes")
    List<AttributeAssortmentConfiguration> attributes;

}