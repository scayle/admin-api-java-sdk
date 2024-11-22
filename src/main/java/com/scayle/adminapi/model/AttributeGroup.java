package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AttributeGroup extends AbstractModel  {
    /**
    * The ID of the attribute group created by SCAYLE.
    */
    @SerializedName("id")
    Integer id;

    /**
    * A name that uniquely identifies an attribute group. 
Please ensure the input is URL-encoded, avoid using special characters like `%`, `&`, `#` directly.

    */
    @SerializedName("name")
    String name;

    /**
    * The localized attribute group name. It must include at least the default language that is configured in SCAYLE.
    */
    @SerializedName("frontendName")
    Map<String, String> frontendName;

    /**
    * An attribute group type.
    */
    @SerializedName("type")
    String type;

    /**
    * Specifies whether an attribute value is shared among multiple entities or if each entity has its own unique value. 
It's important to note that attributes of advanced types cannot be shared, so 'isShared' must always be set to false in such cases.

    */
    @SerializedName("isShared")
    Boolean isShared;

    /**
    * Defines the attribute group level, specifying the type of entity it is applicable to.
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

    /**
    * It is used for grouping the display of attribute groups in the Panel.

    */
    @SerializedName("group")
    String group;

}