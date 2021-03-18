package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomDataConfigProperty implements ApiObjectInterface {
    /**
    * Name of the property.
    */
    @SerializedName("name")
    String name;

    /**
    * Type of the property.
    */
    @SerializedName("type")
    String type;

    /**
    * Whether the property is localized or not.
    */
    @SerializedName("isLocalized")
    Boolean isLocalized;

    /**
    * Default value for the property.
    */
    @SerializedName("defaultValue")
    Object defaultValue;

    /**
    * A collection of rules that applies to the corresponding property in the entity custom data.
    */
    @SerializedName("rules")
    Map<String, Object> rules;

    /**
    * Whether the property is inheritable or not this would apply for entities
   having parent entities or self referencing like categories.

    */
    @SerializedName("inherit")
    Boolean inherit;

}