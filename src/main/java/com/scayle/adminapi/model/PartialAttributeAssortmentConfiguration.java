package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PartialAttributeAssortmentConfiguration extends AbstractModel  {
    /**
    * The attribute name.
    */
    @SerializedName("name")
    String name;

    /**
    * 
    */
    @SerializedName("include")
    PartialAttributeAssortmentConfigurationInclude include;

    /**
    * 
    */
    @SerializedName("exclude")
    PartialAttributeAssortmentConfigurationExclude exclude;

}