package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VoucherCriterion implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * 
    */
    @SerializedName("key")
    String key;

    /**
    * In case shopCategoryId key used that should be corresponded for country type of application instead of shop.
    */
    @SerializedName("type")
    String type;

    /**
    * 
    */
    @SerializedName("value")
    List<Object> value;

}