package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CopyProductRequest extends AbstractModel  {
    /**
    * The reference key to assign to the newly copied product. Must be unique within the tenant's ecosystem.
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * Mapping of every source variant reference key to a new variant reference key. All variants of the source product must be mapped.
    */
    @SerializedName("variants")
    List<CopyProductVariant> variants;

    /**
    * 
    */
    @SerializedName("master")
    CopyProductMaster master;

    /**
    * When provided, the copy is only applied to these specific merchant entities.
    */
    @SerializedName("merchantReferenceKeys")
    List<String> merchantReferenceKeys;

    /**
    * Overrides for source image reference keys on the copied product.
Image reference keys are globally unique across product images, so any source image that has a `referenceKey` must be remapped here to a new, unique value.
Source images without a `referenceKey` may also be remapped via this list, but doing so is optional. Source images that are not listed in this mapping are copied without a `referenceKey`.

    */
    @SerializedName("images")
    List<CopyProductImage> images;

    /**
    * When true, copies prices from the source product to the new product.
    */
    @SerializedName("copyPrices")
    Boolean copyPrices;

    /**
    * When true, copies stocks (including quantities and sellable timeframes) from the source product to the new product.
    */
    @SerializedName("copyStocks")
    Boolean copyStocks;

}