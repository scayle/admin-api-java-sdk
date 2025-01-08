package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.VoucherCriteriaKey;
import com.scayle.adminapi.enums.VoucherCriteriaKeyType;

@Getter
@Setter
public class VoucherCriterion extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * 
    */
    @SerializedName("key")
    VoucherCriteriaKey key;

    /**
    * If the 'shopCategoryId' key is utilized, it should be associated with a 'country' type of application rather than 'shop'.
    */
    @SerializedName("type")
    VoucherCriteriaKeyType type;

    /**
    * 
    */
    @SerializedName("value")
    List<Object> value;

}