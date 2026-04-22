package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CopyProductImage extends AbstractModel  {
    /**
    * The reference key of the image in the source product to copy from.
    */
    @SerializedName("sourceReferenceKey")
    String sourceReferenceKey;

    /**
    * The reference key to assign to the corresponding image in the copied product. Must be globally unique across product images.
    */
    @SerializedName("referenceKey")
    String referenceKey;

}