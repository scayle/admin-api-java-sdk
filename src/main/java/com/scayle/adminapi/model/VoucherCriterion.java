package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VoucherCriterion implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * 
    */
    @SerializedName("key")
    String key;

    /**
    * If the 'shopCategoryId' key is utilized, it should be associated with a 'country' type of application rather than 'shop'.
    */
    @SerializedName("type")
    String type;

    /**
    * 
    */
    @SerializedName("value")
    List<Object> value;

}