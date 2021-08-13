package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VoucherConstraintsApplications implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("count")
    Integer count;

    /**
    * one of: customer, order
    */
    @SerializedName("restriction")
    String restriction;

}