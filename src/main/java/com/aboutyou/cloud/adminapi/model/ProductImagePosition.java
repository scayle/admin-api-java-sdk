package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductImagePosition implements ApiObjectInterface {
    /**
    * Position of the image
    */
    @SerializedName("position")
    Integer position;

}