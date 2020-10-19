package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopProperty implements ApiObjectInterface {
    /**
    * The key of the shop property.
    */
    @SerializedName("key")
    String key;

    /**
    * The value of the shop property.
    */
    @SerializedName("value")
    String value;

}