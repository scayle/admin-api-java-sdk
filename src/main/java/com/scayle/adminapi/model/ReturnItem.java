package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReturnItem implements ApiObjectInterface {
    /**
    * Timestamp when the product return is received
    */
    @SerializedName("received")
    String received;

    /**
    * A key that is assigned to uniquely identify a return request
    */
    @SerializedName("returnKey")
    String returnKey;

    /**
    * Description of why the return is initiated
    */
    @SerializedName("returnReason")
    String returnReason;

    /**
     * Reference key of the merchant to which the return belongs to.
     Please note that all items in the request should belong to same merchant.

     */
    @SerializedName("merchantReferenceKey")
    String merchantReferenceKey;

}