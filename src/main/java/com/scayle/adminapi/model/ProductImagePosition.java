package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductImagePosition implements ApiObjectInterface {
    /**
    * Position of the image. Counting starts with 0, so when a product image should be on the first position, you have to send 0.
    */
    @SerializedName("position")
    Integer position;

}