package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderReductionAmount implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("absoluteWithTax")
    Integer absoluteWithTax;

    /**
    * 
    */
    @SerializedName("relative")
    Integer relative;

}