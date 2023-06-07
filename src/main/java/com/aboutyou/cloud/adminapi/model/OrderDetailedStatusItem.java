package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDetailedStatusItem implements ApiObjectInterface {
    /**
    * Unique identifier of the state
    */
    @SerializedName("code")
    String code;

    /**
    * Name of the state
    */
    @SerializedName("name")
    String name;

}