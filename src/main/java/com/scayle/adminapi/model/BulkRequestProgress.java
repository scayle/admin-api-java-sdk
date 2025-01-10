package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BulkRequestProgress extends AbstractModel  {
    /**
    * Total number of operations
    */
    @SerializedName("totalOperations")
    Integer totalOperations;

    /**
    * Number of processed operations
    */
    @SerializedName("processedOperations")
    Integer processedOperations;

    /**
    * Number of failed operations
    */
    @SerializedName("failedOperations")
    Integer failedOperations;

}