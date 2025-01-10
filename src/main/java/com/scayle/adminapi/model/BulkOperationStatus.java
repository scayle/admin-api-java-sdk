package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.BulkOperationStatusEnum;

@Getter
@Setter
public class BulkOperationStatus extends AbstractModel  {
    /**
    * Operation key, that is unique within the given bulk request
    */
    @SerializedName("key")
    String key;

    /**
    * Status of the bulk operation
    */
    @SerializedName("status")
    BulkOperationStatusEnum status;

    /**
    * 
    */
    @SerializedName("response")
    BulkOperationResponse response;

    /**
    * 
    */
    @SerializedName("bulkRequest")
    BulkRequestStatus bulkRequest;

}