package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductVariantStock extends AbstractModel  {
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
    java.time.Instant changedAt;

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

    /**
    * Date when the stock is expected to be available. If provided, it MUST be in the future.
    */
    @SerializedName("expectedAvailabilityAt")
    String expectedAvailabilityAt;

    public void setExpectedAvailabilityAt(String value) {
        if (value == null) {
            this.setNull("expectedAvailabilityAt");
        }
        this.expectedAvailabilityAt = value;
    }
}