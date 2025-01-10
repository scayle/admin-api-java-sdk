package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BulkOperationResponse extends AbstractModel  {
    /**
    * Operation response body. Can be null if operation doesn't return any response (e.g. 204 status code)
    */
    @SerializedName("body")
    Object body;

    /**
    * Operation response status code.
    */
    @SerializedName("statusCode")
    Integer statusCode;

}