package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductAssortmentConfiguration implements ApiObjectInterface {
    /**
    * The product ids to include.
    */
    @SerializedName("include")
    List<Integer> include;

    /**
    * The product ids to exclude.
    */
    @SerializedName("exclude")
    List<Integer> exclude;

}