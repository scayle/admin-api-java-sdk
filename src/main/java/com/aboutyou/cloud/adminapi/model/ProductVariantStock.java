package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductVariantStock implements ApiObjectInterface {
    /**
    * New quantity of SKU
    */
    @SerializedName("quantity")
    Double quantity;

    /**
    * Reference key of warehouse for which the stock update is related to
    */
    @SerializedName("warehouseReferenceKey")
    String warehouseReferenceKey;

    /**
    * Reference key of merchant
    */
    @SerializedName("merchantReferenceKey")
    String merchantReferenceKey;

    /**
    * Date time when the stock changed
    */
    @SerializedName("changedAt")
    String changedAt;

}