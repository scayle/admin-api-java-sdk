package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductVideo extends AbstractModel  {
    /**
    * ID of the ProductVideo assigned by SCAYLE.
    */
    @SerializedName("id")
    Integer id;

    /**
    * A key that uniquely identifies the video within the tenant's ecosystem.
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * URL of the video, this will be set once the video has been uploaded.
    */
    @SerializedName("assetUrl")
    String assetUrl;

    public void setAssetUrl(String value) {
        if (value == null) {
            this.setNull("assetUrl");
        }
        this.assetUrl = value;
    }
    /**
    * 
    */
    @SerializedName("format")
    Object format;

    /**
    * Flag indicating whether the video has been uploaded.
    */
    @SerializedName("isUploaded")
    Boolean isUploaded;

    /**
    * A list of attributes attached to the video.
    */
    @SerializedName("attributes")
    List<Attribute> attributes;

    /**
    * 
    */
    @SerializedName("customData")
    Object customData;

    public void setCustomData(Object value) {
        if (value == null) {
            this.setNull("customData");
        }
        this.customData = value;
    }
}