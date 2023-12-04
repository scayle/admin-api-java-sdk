package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Voucher implements ApiObjectInterface {
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
    String status;

    /**
    * 
    */
    @SerializedName("summary")
    String summary;

    /**
    * 
    */
    @SerializedName("type")
    String type;

    /**
    * 
    */
    @SerializedName("value")
    Double value;

}