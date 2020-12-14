package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopPropertyKey implements ApiObjectInterface {
    /**
    * The id of the shop property key.
    */
    @SerializedName("id")
    Integer id;

    /**
    * The unique identifier of the shop property key.
    */
    @SerializedName("key")
    String key;

}