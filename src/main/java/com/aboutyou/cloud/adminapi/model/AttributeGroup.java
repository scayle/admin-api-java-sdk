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
    * A name, that uniquely idnetifies an attribute group.
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
    * Defines whether an attribute value is shared beetwen the products or every product has its own value.
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
    * A structure for advanced attribute values. Mandatory for advanced and advancedList types.
    */
    @SerializedName("structure")
    Map<String, Object> structure;

    /**
    * A list of shop ids the attribute group is valid for.
    */
    @SerializedName("shopIds")
    List<Integer> shopIds;

    /**
    * 
    */
    @SerializedName("isOverridablePerShop")
    Boolean isOverridablePerShop;

    /**
    * 
    */
    @SerializedName("sort")
    Integer sort;

    /**
    * 
    */
    @SerializedName("isAttributeAddingAllowed")
    Boolean isAttributeAddingAllowed;

    /**
    * 
    */
    @SerializedName("isDifferentiating")
    Boolean isDifferentiating;

    /**
    * 
    */
    @SerializedName("isIndexable")
    Boolean isIndexable;

}