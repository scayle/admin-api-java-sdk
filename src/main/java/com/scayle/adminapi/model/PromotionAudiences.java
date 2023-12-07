package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PromotionAudiences implements ApiObjectInterface {
    /**
    * The list of audience ids that can use this promotion
    */
    @SerializedName("allowList")
    List<String> allowList;

    /**
    * The list of audience ids that can not use this promotion
    */
    @SerializedName("blockList")
    List<String> blockList;

}