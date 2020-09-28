package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductImage implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * A key that uniquely identifies the asset within the tenant's ecosystem.
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * Name of the image
    */
    @SerializedName("name")
    String name;

    /**
    * 
    */
    @SerializedName("mimeType")
    String mimeType;

    /**
    * Position of the image
    */
    @SerializedName("position")
    Integer position;

    /**
    * 
    */
    @SerializedName("source")
    ProductImageSource source;

    /**
    * If not using a AY Cloud CDN, the asset url can be manually set.
    */
    @SerializedName("assetUrl")
    String assetUrl;

    /**
    * 
    */
    @SerializedName("attributes")
    List<AttributeInterface> attributes;

}