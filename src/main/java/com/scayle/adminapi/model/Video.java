package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.VideoFormatEnum;

@Getter
@Setter
public class Video extends AbstractModel  {
    /**
    * A key that uniquely identifies the video within the tenant's ecosystem.
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * Video url path stored in Scayle (`{public_id}.{format}`).
    */
    @SerializedName("assetUrl")
    String assetUrl;

    /**
    * The video container format.
    */
    @SerializedName("format")
    VideoFormatEnum format;

    /**
    * Whether the video has been uploaded.
    */
    @SerializedName("isUploaded")
    Boolean isUploaded;

}