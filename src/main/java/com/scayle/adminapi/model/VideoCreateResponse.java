package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class VideoCreateResponse extends AbstractModel  {
    /**
    * List of video upload entities with URLs and parameters.
    */
    @SerializedName("entities")
    List<VideoUploadEntity> entities;

}