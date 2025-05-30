package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PartialMerchantAssortmentConfiguration extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("include")
    PartialMerchantAssortmentConfigurationInclude include;

    /**
    * 
    */
    @SerializedName("exclude")
    PartialMerchantAssortmentConfigurationExclude exclude;

}