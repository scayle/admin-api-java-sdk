package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderFee extends AbstractModel  {
    /**
    * If the order has an external price, this field becomes optional.
    */
    @SerializedName("amount")
    OrderFeeAmount amount;

    /**
    * Valid values in case of non-external order: [ payment, delivery, percentage_payment, return, additional]
If the order has an external price, this field becomes optional and can contain any string value defined by the client.

    */
    @SerializedName("category")
    String category;

    /**
    * If the order has an external price, this field becomes optional and can contain any string value defined by the client.
    */
    @SerializedName("key")
    String key;

    /**
    * 
    */
    @SerializedName("option")
    String option;

    /**
    * 
    */
    @SerializedName("tax")
    OrderTax tax;

}