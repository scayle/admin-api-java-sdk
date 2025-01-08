package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.TransactionOperationStatus;

@Getter
@Setter
public class Transaction extends AbstractModel  {
    /**
    * 
    */
    @SerializedName("transactionId")
    String transactionId;

    /**
    * 
    */
    @SerializedName("operationStatus")
    TransactionOperationStatus operationStatus;

}