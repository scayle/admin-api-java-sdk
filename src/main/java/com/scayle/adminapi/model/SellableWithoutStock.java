package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SellableWithoutStock implements ApiObjectInterface {
    /**
    * Reference key of warehouse for which the stock update is related to.
    */
    @SerializedName("warehouseReferenceKey")
    String warehouseReferenceKey;

    /**
    * Defines if the variant can be sold even when the available stock is 0.
    */
    @SerializedName("sellableWithoutStock")
    Boolean sellableWithoutStock;

    /**
    * A merchant reference key the stock belongs to.
    */
    @SerializedName("merchantReferenceKey")
    String merchantReferenceKey;

}