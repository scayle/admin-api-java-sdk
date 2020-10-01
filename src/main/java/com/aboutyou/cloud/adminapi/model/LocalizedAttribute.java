package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocalizedAttribute implements ApiObjectInterface, AttributeInterface {
    /**
    * The attribute name.
    */
    @SerializedName("name")
    String name;

    /**
    * The attribute type. In this case always localizedString.
    */
    @SerializedName("type")
    String type = "localizedString";

    /**
    * The attribute value. In this case always a dictionary mapping locale to translation.
    */
    @SerializedName("value")
    Map<String, String> value;

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