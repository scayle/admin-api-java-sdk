package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdvancedAttributeList implements ApiObjectInterface, AttributeInterface {
    /**
    * The attribute name
    */
    @SerializedName("name")
    String name;

    /**
    * The attribute type. In this case always advancedList.
    */
    @SerializedName("type")
    String type = "advancedList";

    /**
    * The attribute value. In this case it is a list of arrays or objects.
    */
    @SerializedName("value")
    List<Map<String, Object>> value;

    /**
    * Specifies if the attribute was locked via the Cloud Panel.
    */
    @SerializedName("isLocked")
    Boolean isLocked;

    /**
    * Used to override the attribute value for a specific Shop.
    */
    @SerializedName("shopSpecific")
    Map<String, Object> shopSpecific;

}