package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocalizedAttributeList implements ApiObjectInterface, AttributeInterface {
    /**
    * The attribute name.
    */
    @SerializedName("name")
    String name;

    /**
    * The attribute type. In this case always localizedStringList.
    */
    @SerializedName("type")
    String type = "localizedStringList";

    /**
    * The attribute value. In this case always an array of dictionaries mapping locale to translation.
    */
    @SerializedName("value")
    List<Map<String, String>> value;

    /**
    * Specifies if the attribute was locked via the Cloud Panel.
    */
    @SerializedName("isLocked")
    Boolean isLocked;

    /**
    * 
    */
    @SerializedName("shopSpecific")
    Map<String, Object> shopSpecific;

}