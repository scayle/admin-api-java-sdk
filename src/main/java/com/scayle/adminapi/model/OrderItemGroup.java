package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemGroup extends AbstractModel  {
    /**
    * Item group ID
    */
    @SerializedName("id")
    String id;

    /**
    * Specifies the main item in the group (true for only one item in a group)
    */
    @SerializedName("isMainItem")
    Boolean isMainItem;

    /**
    * Specifies if the item is mandatory or optional
    */
    @SerializedName("isRequired")
    Boolean isRequired;

}