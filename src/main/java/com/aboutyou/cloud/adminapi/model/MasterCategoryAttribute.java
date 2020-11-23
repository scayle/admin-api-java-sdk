package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MasterCategoryAttribute implements ApiObjectInterface {
    /**
    * The attribute name.
    */
    @SerializedName("name")
    String name;

    /**
    * Whether the attribute is mandatory or not. Used in the state calculation.
    */
    @SerializedName("isMandatory")
    Boolean isMandatory;

    /**
    * The default value of the attribute if it's mandatory. Used in all attribute related processes if that specific attribute is not provided.
    */
    @SerializedName("defaultValue")
    Object defaultValue;

}