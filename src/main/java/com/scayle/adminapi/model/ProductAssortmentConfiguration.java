package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductAssortmentConfiguration extends AbstractModel  {
    /**
    * The product IDs to include.
    */
    @SerializedName("include")
    List<Integer> include;

    /**
    * The product IDs to exclude.
    */
    @SerializedName("exclude")
    List<Integer> exclude;

}