package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PartialAssortment extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("masterCategories")
    PartialMasterCategoryAssortmentConfiguration masterCategories;

    /**
    * 
    */
    @SerializedName("products")
    PartialProductAssortmentConfiguration products;

    /**
    * Configuration of attribute includes/excludes.
    */
    @SerializedName("attributes")
    List<PartialAttributeAssortmentConfiguration> attributes;

    /**
    * 
    */
    @SerializedName("merchantReferenceKeys")
    PartialMerchantAssortmentConfiguration merchantReferenceKeys;

}