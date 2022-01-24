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
    * Current quantity of SKU.
    */
    @SerializedName("quantity")
    Integer quantity;

    /**
    * Reference key of warehouse for which the stock update is related to.
    */
    @SerializedName("warehouseReferenceKey")
    String warehouseReferenceKey;

    /**
    * Date time when the stock changed in Iso8601 format.
    */
    @SerializedName("changedAt")
    String changedAt;

    /**
    * Defines if the variant can be sold even when the available stock is 0.
    */
    @SerializedName("sellableWithoutStock")
    Boolean sellableWithoutStock;

}