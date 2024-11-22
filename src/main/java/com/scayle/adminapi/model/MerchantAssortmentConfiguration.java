package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MerchantAssortmentConfiguration extends AbstractModel  {
    /**
    * Merchant reference keys to include.
    */
    @SerializedName("include")
    List<String> include;

    /**
    * Merchant reference keys to exclude.
    */
    @SerializedName("exclude")
    List<String> exclude;

}