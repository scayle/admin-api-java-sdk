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
    * Key indicating the bulk request id. By passing this bulkRequestKey with requestStatus=incomplete, the operations of that bulk request can be extended. When extending the bulk operations, same operation key that may exists in the previous bulk requests will not be checked. Extending the operations of an already completed request is not possible. When not provided a new bulk request is created.
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