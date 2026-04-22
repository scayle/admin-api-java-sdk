package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CopyProductVariant extends AbstractModel  {
    /**
    * The reference key of the variant in the source product to copy from.
    */
    @SerializedName("sourceReferenceKey")
    String sourceReferenceKey;

    /**
    * The reference key to assign to the corresponding variant in the copied product.
    */
    @SerializedName("referenceKey")
    String referenceKey;

}