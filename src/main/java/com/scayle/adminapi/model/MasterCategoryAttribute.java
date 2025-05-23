package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.AttributeType;

@Getter
@Setter
public class MasterCategoryAttribute extends AbstractModel  {
    /**
    * The attribute name.
    */
    @SerializedName("name")
    String name;

    /**
    * The attribute type.
    */
    @SerializedName("type")
    AttributeType type;

    /**
    * Whether the attribute is mandatory or not. Used in the state *calculation*.
    */
    @SerializedName("isMandatory")
    Boolean isMandatory;

    /**
    * The default value of the attribute if it is mandatory. Used in all attribute related processes if that specific attribute is not provided.
    */
    @SerializedName("defaultValue")
    Object defaultValue;

}