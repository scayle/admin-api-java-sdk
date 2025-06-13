package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.CustomDataConfigPropertyType;

@Getter
@Setter
public class CustomDataConfigProperty extends AbstractModel  {
    /**
    * Name of the property.
    */
    @SerializedName("name")
    String name;

    /**
    * Type of the property.
    */
    @SerializedName("type")
    CustomDataConfigPropertyType type;

    /**
    * Whether the property is localized or not. Default is `false`, supported only for config properties of type `json` and `string`. Toggling `isLocalized` from `true` to `false` is not supported when there is custom data on the corresponding entity.
    */
    @SerializedName("isLocalized")
    Boolean isLocalized;

    /**
    * Default value for the property. If `required` rule is set to `true` then `defaultValue` is mandatory in case there is custom data on the corresponding entity.
    */
    @SerializedName("defaultValue")
    Object defaultValue;

    public void setDefaultValue(Object value) {
        if (value == null) {
            this.setNull("defaultValue");
        }
        this.defaultValue = value;
    }
    /**
    * A collection of rules that applies to the corresponding property in the entity custom data.
    */
    @SerializedName("rules")
    Object rules;

    /**
    * Whether the property is inheritable or not this would apply for entities
   having parent entities or self referencing like categories.

    */
    @SerializedName("inherit")
    Boolean inherit;

}