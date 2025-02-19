package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.InvoiceType;

@Getter
@Setter
public class OrderInvoice extends AbstractModel  {
    /**
    * PDF document id (different from invoice identifier)
    */
    @SerializedName("id")
    Integer id;

    /**
    * 
    */
    @SerializedName("createdAt")
    java.time.Instant createdAt;

    /**
    * Document types
    */
    @SerializedName("type")
    InvoiceType type;

    /**
    * 
    */
    @SerializedName("invoice")
    Invoice invoice;

    /**
    * 
    */
    @SerializedName("available")
    Boolean available;

}