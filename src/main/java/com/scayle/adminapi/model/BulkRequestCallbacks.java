package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.BulkRequestCreationStatus;

@Getter
@Setter
public class BulkRequestCallbacks extends AbstractModel  {
    /**
    * Callback url, which will be triggered when request status is changed
    */
    @SerializedName("requestUrl")
    String requestUrl;

    public void setRequestUrl(String value) {
        if (value == null) {
            this.setNull("requestUrl");
        }
        this.requestUrl = value;
    }
    /**
    * Callback url, which will be triggered when operation status is changed
    */
    @SerializedName("operationUrl")
    String operationUrl;

    public void setOperationUrl(String value) {
        if (value == null) {
            this.setNull("operationUrl");
        }
        this.operationUrl = value;
    }
    /**
    * Status of the bulk request creation
    */
    @SerializedName("requestStatus")
    BulkRequestCreationStatus requestStatus = BulkRequestCreationStatus.VALUE_COMPLETE;

    /**
    * Key indicating the bulk request id. To split a bulk request into multiple chunks, create the request with requestStatus=incomplete, then pass the returned key as bulkRequestKey when submitting additional chunks. For the final chunk, pass the same bulkRequestKey and set requestStatus=complete so the request can be queued for processing. Completed bulk requests cannot be extended. When extending a bulk request, operation keys that were already submitted in previous chunks are not checked again. When not provided, a new bulk request is created.
    */
    @SerializedName("bulkRequestKey")
    Integer bulkRequestKey;

    public void setBulkRequestKey(Integer value) {
        if (value == null) {
            this.setNull("bulkRequestKey");
        }
        this.bulkRequestKey = value;
    }
}