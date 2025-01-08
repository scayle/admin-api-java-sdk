package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderItemLowestPriorPrice extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("relativeDifferenceToPrice")
    Double relativeDifferenceToPrice;

    /**
    * Lowest price including taxes
    */
    @SerializedName("withTax")
    Integer withTax;

}