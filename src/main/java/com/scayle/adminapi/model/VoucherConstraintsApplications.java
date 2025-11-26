package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.VoucherConstraintsApplicationsRestriction;

@Getter
@Setter
public class VoucherConstraintsApplications extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("count")
    Long count;

    /**
    * 
    */
    @SerializedName("restriction")
    VoucherConstraintsApplicationsRestriction restriction;

}