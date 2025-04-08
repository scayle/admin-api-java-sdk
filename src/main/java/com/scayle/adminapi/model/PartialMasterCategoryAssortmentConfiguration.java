package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PartialMasterCategoryAssortmentConfiguration extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("include")
    PartialMasterCategoryAssortmentConfigurationInclude include;

    /**
    * 
    */
    @SerializedName("exclude")
    PartialMasterCategoryAssortmentConfigurationExclude exclude;

}