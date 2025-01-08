package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PromotionCodes extends AbstractModel  {
    /**
    * List of promotion codes
    */
    @SerializedName("promotionCodes")
    List<String> promotionCodes;

}