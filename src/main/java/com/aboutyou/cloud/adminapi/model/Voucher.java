package com.aboutyou.cloud.adminapi.model;

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
    @SerializedName("name")
    String name;

    /**
    * one of: active, inactive, pending-review, archived
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