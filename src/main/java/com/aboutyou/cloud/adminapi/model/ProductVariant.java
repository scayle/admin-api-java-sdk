package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductVariant implements ApiObjectInterface {
    /**
    * ID assigned by BACKBONE Core.
    */
    @SerializedName("id")
    Integer id;

    /**
    * A key that uniquely identifies the variant of a product (usually an SKU) within the tenant's ecosystem.
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * An ean that refers to a product variant .
    */
    @SerializedName("ean")
    String ean;

    /**
    * A list of attributes attached to the product variant.
    */
    @SerializedName("attributes")
    List<Attribute> attributes;

    /**
    * A list of prices attached to the product variant.
    */
    @SerializedName("prices")
    List<ProductVariantPrice> prices;

    /**
    * The product variant stock information.
    */
    @SerializedName("stocks")
    List<ProductVariantStock> stocks;

    /**
    * 
    */
    @SerializedName("customData")
    Object customData;

    /**
    * Indicates whether the variant is composite.
    */
    @SerializedName("isComposite")
    Boolean isComposite;

    /**
    * A list of variants that belong to the composite variant.
    */
    @SerializedName("relatedVariants")
    List<RelatedProductVariant> relatedVariants;

}