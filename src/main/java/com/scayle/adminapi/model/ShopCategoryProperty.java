package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopCategoryProperty extends AbstractModel  {
    /**
    * The key of the shop category property.
    */
    @SerializedName("key")
    String key;

    /**
    * The value of the shop category property.
    */
    @SerializedName("value")
    String value;

}