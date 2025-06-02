package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderItemAbsoluteVoucherReducedPrice extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("tax")
    OrderTax tax;

    /**
    * Item absolute voucher discounted price excluding taxes
    */
    @SerializedName("withOutTax")
    Integer withOutTax;

    /**
    * Item absolute voucher discounted price including taxes
    */
    @SerializedName("withTax")
    Integer withTax;

}