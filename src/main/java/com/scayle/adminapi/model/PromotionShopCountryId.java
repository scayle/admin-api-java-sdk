package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PromotionShopCountryId implements ApiObjectInterface {
    /**
    * The list of shop IDs where the promotion is allowed
    */
    @SerializedName("allowList")
    List<Integer> allowList;

    /**
    * The list of shop IDs where the promotion is blocked
    */
    @SerializedName("blockList")
    List<Integer> blockList;

}