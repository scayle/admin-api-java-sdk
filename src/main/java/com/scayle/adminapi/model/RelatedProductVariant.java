package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RelatedProductVariant extends AbstractModel  {
    /**
    * A key that uniquely identifies the variant, which is a part of a composite variant.
    */
    @SerializedName("variantReferenceKey")
    String variantReferenceKey;

    /**
    * The ID of the product variant created by SCAYLE. 
This can be retrieved from the product variant endpoint.

    */
    @SerializedName("variantId")
    Integer variantId;

    /**
    * Defines the main variant of a composite product. Each composite product must contain one and only one main variant.
    */
    @SerializedName("isMainVariant")
    Boolean isMainVariant;

}