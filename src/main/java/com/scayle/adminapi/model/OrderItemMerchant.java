package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderItemMerchant extends AbstractModel  {
    /**
    * The merchant id to which the item belongs.
    */
    @SerializedName("id")
    Integer id;

    /**
    * A merchant reference key the item belongs to.
    */
    @SerializedName("referenceKey")
    String referenceKey;

}