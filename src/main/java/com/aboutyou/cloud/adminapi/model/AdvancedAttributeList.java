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
    * 
    */
    @SerializedName("name")
    String name;

    /**
    * 
    */
    @SerializedName("type")
    String type = "advancedList";

    /**
    * 
    */
    @SerializedName("value")
    List<Map<String, Object>> value;

    /**
    * 
    */
    @SerializedName("isLocked")
    Boolean isLocked;

    /**
    * 
    */
    @SerializedName("shopSpecific")
    Map<String, Object> shopSpecific;

}