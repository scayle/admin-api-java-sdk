package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderFeeAmount extends AbstractModel  {
    /**
    * If the order has an external price, this field becomes optional.
    */
    @SerializedName("withoutTax")
    Integer withoutTax;

    /**
    * If the order has an external price, this field becomes optional.
    */
    @SerializedName("withTax")
    Integer withTax;

}