package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MasterCategory implements ApiObjectInterface {
    /**
    * The id of the master category created by Backbone Core.
    */
    @SerializedName("id")
    Integer id;

    /**
    * The id of the parent master category if exists.
    */
    @SerializedName("parentId")
    Integer parentId;

    /**
    * The complete category path.
    */
    @SerializedName("path")
    List<String> path;

    /**
    * List of attributes which are related to this category.
    */
    @SerializedName("attributes")
    List<MasterCategoryAttribute> attributes;

}