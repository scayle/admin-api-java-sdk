package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductQualityScore extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("score")
    Integer score;

    /**
    * 
    */
    @SerializedName("calculatedAt")
    java.time.Instant calculatedAt;

    /**
    * 
    */
    @SerializedName("breakdown")
    List<ProductQualityScoreBreakdownEntry> breakdown;

}