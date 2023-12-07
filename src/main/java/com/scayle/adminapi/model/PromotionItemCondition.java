package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PromotionItemCondition implements ApiObjectInterface {
    /**
    * Key of the condition. Can be used to identify which condition failed in the validate endpoint
    */
    @SerializedName("key")
    String key;

    /**
    * 
    */
    @SerializedName("condition")
    String condition;

}