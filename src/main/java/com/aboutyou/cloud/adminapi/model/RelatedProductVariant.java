package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RelatedProductVariant implements ApiObjectInterface {
    /**
    * A key that uniquely identifies the variant, which is a part of a composite variant.
    */
    @SerializedName("variantReferenceKey")
    String variantReferenceKey;

    /**
    * Defines the main variant of a composite product. Each composite product must contain one and only one main variant.
    */
    @SerializedName("isMainVariant")
    Boolean isMainVariant;

}