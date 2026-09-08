package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class VideoUploadEntity extends AbstractModel  {
    /**
    * The reference key of the video.
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * The upload URL for the video.
    */
    @SerializedName("url")
    String url;

    /**
    * Upload parameters (e.g. public_id, format, signature, api_key).
    */
    @SerializedName("parameters")
    List<VideoUploadParameter> parameters;

}