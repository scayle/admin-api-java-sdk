package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Attribute implements ApiObjectInterface {
    /**
    * The attribute name.
    */
    @SerializedName("name")
    String name;

    /**
    * The attribute type.
    */
    @SerializedName("type")
    String type;

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