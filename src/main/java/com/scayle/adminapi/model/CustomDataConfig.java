package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CustomDataConfig extends AbstractModel  {
    /**
    * Collection of custom config properties.
    */
    @SerializedName("properties")
    List<CustomDataConfigProperty> properties;

}