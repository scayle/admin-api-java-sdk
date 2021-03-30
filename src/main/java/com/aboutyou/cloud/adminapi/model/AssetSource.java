package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssetSource implements ApiObjectInterface {
    /**
    * URL of remote asset.
    */
    @SerializedName("url")
    String url;

    /**
    * Base64-encoded binary asset data.
    */
    @SerializedName("attachment")
    String attachment;

}