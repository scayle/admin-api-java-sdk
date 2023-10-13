package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MasterCategoryAssortmentConfiguration implements ApiObjectInterface {
    /**
    * List of master categories to include.
    */
    @SerializedName("include")
    List<List<String>> include;

    /**
    * List of master categories to exclude.
    */
    @SerializedName("exclude")
    List<List<String>> exclude;

}