package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.VoucherStatus;
import com.scayle.adminapi.enums.VoucherType;

@Getter
@Setter
public class Voucher extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * 
    */
    @SerializedName("code")
    String code;

    /**
    * 
    */
    @SerializedName("constraints")
    VoucherConstraints constraints;

    /**
    * 
    */
    @SerializedName("criteria")
    List<VoucherCriterion> criteria;

    /**
    * 
    */
    @SerializedName("isApplicableToPromotions")
    Boolean isApplicableToPromotions;

    /**
    * 
    */
    @SerializedName("name")
    String name;

    /**
    * 
    */
    @SerializedName("status")
    VoucherStatus status;

    /**
    * 
    */
    @SerializedName("summary")
    String summary;

    /**
    * 
    */
    @SerializedName("type")
    VoucherType type;

    /**
    * 
    */
    @SerializedName("value")
    Double value;

}