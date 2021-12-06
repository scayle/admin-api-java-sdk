package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Company implements ApiObjectInterface {
    /**
    * The ID of the company created by Backbone Core.
    */
    @SerializedName("id")
    Integer id;

    /**
    * Name of the company.
    */
    @SerializedName("name")
    String name;

}