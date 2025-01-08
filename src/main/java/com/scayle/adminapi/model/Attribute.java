package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.AttributeType;

@Getter
@Setter
public class Attribute extends AbstractModel  {
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
    * The attribute value where the datatype is defined by the type property.
    */
    @SerializedName("value")
    Object value;

    /**
    * Specifies if the attribute was locked via SCAYLE Panel.
    */
    @SerializedName("isLocked")
    Boolean isLocked;

    /**
    * Used to override the attribute value for a specific shop country. Only supported by products, product masters and variants.
    */
    @SerializedName("shopCountrySpecific")
    List<AttributeShopCountrySpecific> shopCountrySpecific;

}