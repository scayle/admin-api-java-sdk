package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AttributeGroup implements ApiObjectInterface {
    /**
    * The ID of the attribute group created by SCAYLE.
    */
    @SerializedName("id")
    Integer id;

    /**
    * A name that uniquely identifies an attribute group.
    */
    @SerializedName("name")
    String name;

    /**
    * The localized attribute group name. At least the base language that is configured in SCAYLE is mandatory.
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
It is not possible to share attributes of advanced type, therefore isShared must be always false in this case.

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
Mandatory for the advanced type.

    */
    @SerializedName("structure")
    Map<String, Object> structure;

    /**
    * A list of shop countries the attribute group is valid for.
The attribute group is valid for all shop countries if the field is omitted.

    */
    @SerializedName("shopCountries")
    List<AttributeGroupShopCountry> shopCountries;

    /**
    * Defines if shop-specific attribute values are allowed for the given attribute group.

    */
    @SerializedName("isOverridablePerShop")
    Boolean isOverridablePerShop;

    /**
    * If an attribute group is differentiating, then every entity must have a unique attribute value.
This configuration is not applicable to the advanced type, neither to attribute groups marked as isShared=false.

    */
    @SerializedName("isDifferentiating")
    Boolean isDifferentiating;

}