package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PackageGroup implements ApiObjectInterface {
    /**
    * The id of the package group.
    */
    @SerializedName("id")
    Integer id;

}