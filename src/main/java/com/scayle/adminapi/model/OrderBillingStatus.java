package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.BillingStatus;

@Getter
@Setter
public class OrderBillingStatus extends AbstractModel  {
    /**
    * Target order billing status value
    */
    @SerializedName("code")
    BillingStatus code;

    /**
    * A string describing the business case behind the update. Kept in the logs for auditing reasons.
    */
    @SerializedName("reason")
    String reason;

    /**
    * An list of order items and their new target billing status.
    */
    @SerializedName("items")
    List<OrderItemBillingStatus> items;

}