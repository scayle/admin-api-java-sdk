package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.PromotionUsageLimitPromotionCodeType;

@Getter
@Setter
public class PromotionUsageLimitPromotionCode extends AbstractModel  {
    /**
    * Promotion code usage limit count
    */
    @SerializedName("count")
    Integer count;

    /**
    * Promotion code usage limit count type. 
May be one of the following values: 
* order
* customer

Order - if different customers use the same code, it counts toward the total limit. 
Customer - if different customers use the same code, each customer has their own limit count'

    */
    @SerializedName("type")
    PromotionUsageLimitPromotionCodeType type;

}