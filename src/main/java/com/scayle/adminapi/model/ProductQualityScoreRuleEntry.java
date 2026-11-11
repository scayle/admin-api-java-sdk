package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductQualityScoreRuleEntry extends AbstractModel  {
    /**
    * Name of the attribute group this weight applies to.
    */
    @SerializedName("attributeGroupName")
    String attributeGroupName;

    /**
    * Weight of the attribute group, from 1 to 10.
    */
    @SerializedName("weight")
    Integer weight;

}