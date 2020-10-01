package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductImageSource implements ApiObjectInterface {
    /**
    * Url of remote image.
    */
    @SerializedName("url")
    String url;

    /**
    * Base64 encoded binary image data.
    */
    @SerializedName("attachment")
    String attachment;

}