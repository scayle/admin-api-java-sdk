package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductImagePosition extends AbstractModel  {
    /**
    * Position of the image. Counting starts with 0, so when a product image should be on the first position, you have to send 0.
    */
    @SerializedName("position")
    Integer position;

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
}