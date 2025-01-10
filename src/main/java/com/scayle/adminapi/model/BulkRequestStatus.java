package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.BulkRequestStatusEnum;

@Getter
@Setter
public class BulkRequestStatus extends AbstractModel  {
    /**
    * Bulk request identifier
    */
    @SerializedName("key")
    Integer key;

    /**
    * Status of the bulk request
    */
    @SerializedName("status")
    BulkRequestStatusEnum status;

    /**
    * 
    */
    @SerializedName("progress")
    BulkRequestProgress progress;

}