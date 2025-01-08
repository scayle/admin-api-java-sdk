package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductMasterCategories extends AbstractModel  {
    /**
    * Specifies if the product categories were locked via the SCAYLE Panel.
    */
    @SerializedName("isLocked")
    Boolean isLocked;

    /**
    * The master category paths.
    */
    @SerializedName("paths")
    List<List<String>> paths;

}