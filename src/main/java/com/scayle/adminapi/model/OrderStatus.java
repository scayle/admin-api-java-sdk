package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.OrderStatusEnum;

@Getter
@Setter
public class OrderStatus extends AbstractModel  {
    /**
    * Status of the order, e.g. invoice_completed
    */
    @SerializedName("status")
    OrderStatusEnum status;

    /**
    * 
    */
    @SerializedName("detailedStatus")
    OrderDetailedStatus detailedStatus;

}