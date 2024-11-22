package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderMembershipDiscount extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("membershipCardId")
    Integer membershipCardId;

    /**
    * 
    */
    @SerializedName("pointsUsed")
    Integer pointsUsed;

    /**
    * 
    */
    @SerializedName("reductionValue")
    Integer reductionValue;

    /**
    * 
    */
    @SerializedName("tax")
    Integer tax;

}