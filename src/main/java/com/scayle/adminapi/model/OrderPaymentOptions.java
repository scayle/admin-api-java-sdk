package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderPaymentOptions extends AbstractModel  {
    /**
    * Number of installments chosen by the Customer for the Order
    */
    @SerializedName("countOfInstallments")
    Integer countOfInstallments;

    /**
    * If true, the Customer elected to have a delay in payment capture
    */
    @SerializedName("hasPaybreak")
    Boolean hasPaybreak;

}