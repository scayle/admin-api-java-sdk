package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopCategoryPropertyKey implements ApiObjectInterface {
    /**
    * The id of the shop category property key.
    */
    @SerializedName("id")
    Integer id;

    /**
    * The unique identifier of the shop category property key.
    */
    @SerializedName("key")
    String key;

    /**
    * If true, then properties of the same key are inherited by children.
    */
    @SerializedName("isInheritable")
    Boolean isInheritable;

}