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
    * Id assigned by BACKBONE Core.
    */
    @SerializedName("id")
    Integer id;

    /**
    * A key that uniquely identifies the variant of a product (usually an SKU) within the tenant's ecosystem.
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * A list of attributes attached to the product variant.
    */
    @SerializedName("attributes")
    List<AttributeInterface> attributes;

    /**
    * A list of prices attached to the product variant.
    */
    @SerializedName("prices")
    List<ProductVariantPrice> prices;

}