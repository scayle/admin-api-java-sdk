package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.ProductQualityScoreAttributeGroupLevel;
import com.scayle.adminapi.enums.ProductQualityScoreStatus;

@Getter
@Setter
public class ProductQualityScoreBreakdownEntry extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("attributeGroupId")
    Integer attributeGroupId;

    /**
    * 
    */
    @SerializedName("attributeGroupName")
    String attributeGroupName;

    /**
    * The level of the attribute group scored in this breakdown entry.
    */
    @SerializedName("attributeGroupLevel")
    ProductQualityScoreAttributeGroupLevel attributeGroupLevel;

    /**
    * 
    */
    @SerializedName("weight")
    Integer weight;

    /**
    * How completely the attribute group is filled.
    */
    @SerializedName("status")
    ProductQualityScoreStatus status;

    /**
    * 
    */
    @SerializedName("earnedWeight")
    Double earnedWeight;

}