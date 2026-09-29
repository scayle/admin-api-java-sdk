package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductVideoPosition extends AbstractModel  {
    /**
    * Position of the video. Counting starts with 0.
    */
    @SerializedName("position")
    Integer position;

    /**
    * Optional per-shop-country positions. When present, must contain at least one entry.
    */
    @SerializedName("shopCountrySpecific")
    List<ProductVideoShopCountryPosition> shopCountrySpecific;

    /**
    * 
    */
    @SerializedName("customData")
    Object customData;

    public void setCustomData(Object value) {
        if (value == null) {
            this.setNull("customData");
        }
        this.customData = value;
    }
    /**
    * Video sorting locks for this product (`videoPositions` only).
Use PATCH image or create/update product to set `imagePositions`.

    */
    @SerializedName("productLocks")
    ProductVideoLocks productLocks;

}