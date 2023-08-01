package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemMerchant implements ApiObjectInterface {
    /**
    * A merchant reference key the item belongs to.
    */
    @SerializedName("referenceKey")
    String referenceKey;

}