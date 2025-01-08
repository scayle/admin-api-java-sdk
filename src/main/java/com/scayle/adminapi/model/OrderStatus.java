package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderStatus extends AbstractModel  {
    /**
    * Phases of order e.g: cancelled , delivered
    */
    @SerializedName("status")
    String status;

    /**
    * 
    */
    @SerializedName("detailedStatus")
    OrderDetailedStatus detailedStatus;

}