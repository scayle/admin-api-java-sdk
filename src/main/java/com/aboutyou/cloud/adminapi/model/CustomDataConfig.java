package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomDataConfig implements ApiObjectInterface {
    /**
    * Collection of custom config properties.
    */
    @SerializedName("properties")
    List<CustomDataConfigProperty> properties;

}