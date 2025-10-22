package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.BillingStatus;

@Getter
@Setter
public class OrderItemBillingStatus extends AbstractModel  {
    /**
    * Order item id
    */
    @SerializedName("id")
    Integer id;

    /**
    * Target order billing status value
    */
    @SerializedName("code")
    BillingStatus code;

}