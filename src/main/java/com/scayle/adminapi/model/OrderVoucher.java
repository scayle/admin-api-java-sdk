package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.VoucherType;

@Getter
@Setter
public class OrderVoucher extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * 
    */
    @SerializedName("voucherId")
    Integer voucherId;

    /**
    * 
    */
    @SerializedName("applicableItems")
    List<OrderVoucherItem> applicableItems;

    /**
    * 
    */
    @SerializedName("code")
    String code;

    /**
    * 
    */
    @SerializedName("type")
    VoucherType type;

    /**
    * 
    */
    @SerializedName("value")
    Integer value;

}