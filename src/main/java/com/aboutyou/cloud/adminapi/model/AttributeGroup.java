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
    * An attribute group name, which will be display in the frontend.
    */
    @SerializedName("frontendName")
    String frontendName;

    /**
    * An attribute group type.
    */
    @SerializedName("type")
    String type;

    /**
    * Defines whether an attribute value is shared beetwen the entities or every entity has its own value.
Not applicable to advanced and advancedList types.

    */
    @SerializedName("isShared")
    Boolean isShared;

    /**
    * A classification name, which is used to cluster attribute groups.
    */
    @SerializedName("group")
    String group;

    /**
    * An attribute group level, which defines an entity the group is valid for.
    */
    @SerializedName("level")
    String level;

    /**
    * A structure, which describes advanced attribute values. Mandatory for advanced and advancedList types.
    */
    @SerializedName("structure")
    Map<String, Object> structure;

    /**
    * A list of shop ids the attribute group is valid for.
    */
    @SerializedName("shopIds")
    List<Integer> shopIds;

    /**
    * If shopIds are set and isOverridablePerShop is true, then entity attributes can be overriden.
    */
    @SerializedName("isOverridablePerShop")
    Boolean isOverridablePerShop;

    /**
    * An attribute group sort position, mainly used in the frontend.
    */
    @SerializedName("sort")
    Integer sort;

    /**
    * 
    */
    @SerializedName("isAttributeAddingAllowed")
    Boolean isAttributeAddingAllowed;

    /**
    * If an attribute group is differentiating, then every entity must have a unique attribute value.
This configuration is not applicable to advanced and advancedList types, neither to attribute groups marked as isShared=false.

    */
    @SerializedName("isDifferentiating")
    Boolean isDifferentiating;

    /**
    * 
    */
    @SerializedName("isIndexable")
    Boolean isIndexable;

}