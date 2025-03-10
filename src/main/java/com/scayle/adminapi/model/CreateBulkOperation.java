package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.BulkOperationMethod;

@Getter
@Setter
public class CreateBulkOperation extends AbstractModel  {
    /**
    * Operation key, which is unique within the given bulk request
    */
    @SerializedName("key")
    String key;

    /**
    * Operation relative url
    */
    @SerializedName("url")
    String url;

    /**
    * Operation HTTP method
    */
    @SerializedName("method")
    BulkOperationMethod method;

    /**
    * Operation additional HTTP headers
    */
    @SerializedName("headers")
    Map<String, Object> headers;

    /**
    * Operation request body
    */
    @SerializedName("body")
    Map<String, Object> body;

}