package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AttributeGroup implements ApiObjectInterface {
    /**
    * The id of the attribute group created by Backbone Core.
    */
    @SerializedName("id")
    Integer id;

    /**
    * A name, that uniquely identifies an attribute group.
    */
    @SerializedName("name")
    String name;

    /**
    * The localized attribute group name. At least the base language that is configured in Backbone Core is mandatory.
    */
    @SerializedName("frontendName")
    Map<String, String> frontendName;

    /**
    * An attribute group type.
    */
    @SerializedName("type")
    String type;

    /**
    * Defines whether an attribute value is shared beetwen the entities or every entity has its own value.
It's not possible to share attributes of advanced and advancedList types, therefore isShared must be always false in this case.

    */
    @SerializedName("isShared")
    Boolean isShared;

    /**
    * An attribute group level, which defines an entity the group is valid for.
    */
    @SerializedName("level")
    String level;

    /**
    * A structure, which describes advanced attribute values.
Mandatory for advanced and advancedList types.

    */
    @SerializedName("structure")
    Map<String, Object> structure;

    /**
    * A list of shop keys the attribute group is valid for.
The attribute group is valid for all shops if the field is omitted.

    */
    @SerializedName("shopKeys")
    List<String> shopKeys;

    /**
    * Defines if shop specific attribute values are allowed for the given attribute group.

    */
    @SerializedName("isOverridablePerShop")
    Boolean isOverridablePerShop;

    /**
    * If an attribute group is differentiating, then every entity must have a unique attribute value.
This configuration is not applicable to advanced and advancedList types, neither to attribute groups marked as isShared=false.

    */
    @SerializedName("isDifferentiating")
    Boolean isDifferentiating;

}