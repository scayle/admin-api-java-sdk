package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MasterCategory extends AbstractModel  {
    /**
    * The ID of the master category created by SCAYLE.
    */
    @SerializedName("id")
    Integer id;

    /**
    * The ID of the parent master category if exists.
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