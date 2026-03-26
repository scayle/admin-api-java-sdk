package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.OrderDocumentFormat;
import com.scayle.adminapi.enums.OrderDocumentType;

@Getter
@Setter
public class OrderDocument extends AbstractModel  {
    /**
    * Document id (distinct from order identifiers).
    */
    @SerializedName("id")
    Integer id;

    /**
    * Whether the document content can be fetched.
    */
    @SerializedName("availabilityStatus")
    Boolean availabilityStatus;

    /**
    * 
    */
    @SerializedName("createdAt")
    java.time.Instant createdAt;

    /**
    * File format of the document (`pdf` for PDF binaries, `eml` for email messages).
    */
    @SerializedName("format")
    OrderDocumentFormat format;

    /**
    * Document category. PDF-backed types (for example `merchant_partial_invoice`) return PDF bytes from the show endpoint, same as [order invoices](/en/core-documentation/checkout-guide/features/transactions-and-orders#get-order-invoice).
Email-backed types (for example `email_shipment`) are built from JSON stored at the document's storage path and returned as `message/rfc822`.

    */
    @SerializedName("type")
    OrderDocumentType type;

}