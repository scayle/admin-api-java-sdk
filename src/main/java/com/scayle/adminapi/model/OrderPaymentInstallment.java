package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.OrderPaymentInstallmentType;

@Getter
@Setter
public class OrderPaymentInstallment extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("amount")
    Integer amount;

    /**
    * 
    */
    @SerializedName("type")
    OrderPaymentInstallmentType type;

}