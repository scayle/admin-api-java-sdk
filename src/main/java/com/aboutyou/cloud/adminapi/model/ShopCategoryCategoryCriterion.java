package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopCategoryCategoryCriterion implements ApiObjectInterface {
    /**
    * List of shop category urls to include.
    */
    @SerializedName("include")
    List<String> include;

    /**
    * List of shop category urls to exclude.
    */
    @SerializedName("exclude")
    List<String> exclude;

}