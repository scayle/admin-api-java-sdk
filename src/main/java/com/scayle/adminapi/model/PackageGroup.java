package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PackageGroup extends AbstractModel  {
    /**
    * The ID of the package group.
    */
    @SerializedName("id")
    Integer id;

}