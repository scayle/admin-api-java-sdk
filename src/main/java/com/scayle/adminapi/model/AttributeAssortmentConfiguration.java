package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AttributeAssortmentConfiguration extends AbstractModel  {
    /**
    * The attribute name.
    */
    @SerializedName("name")
    String name;

    /**
    * The attribute values to include.
    */
    @SerializedName("include")
    List<String> include;

    /**
    * The attribute values to exclude.
    */
    @SerializedName("exclude")
    List<String> exclude;

}