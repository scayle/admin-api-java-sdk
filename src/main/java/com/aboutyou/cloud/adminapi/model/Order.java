package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("id")
    Integer id;

    /**
    * 
    */
    @SerializedName("address")
    OrderAddress address;

    /**
    * 
    */
    @SerializedName("basketKey")
    String basketKey;

    /**
    * 
    */
    @SerializedName("confirmedAt")
    String confirmedAt;

    /**
    * 
    */
    @SerializedName("cost")
    OrderCost cost;

    /**
    * 
    */
    @SerializedName("currencyCode")
    String currencyCode;

    /**
    * 
    */
    @SerializedName("customer")
    Customer customer;

    /**
    * 
    */
    @SerializedName("shopCountry")
    ShopCountry shopCountry;

    /**
    * 
    */
    @SerializedName("invoicedAt")
    String invoicedAt;

    /**
    * 
    */
    @SerializedName("items")
    List<OrderItem> items;

    /**
    * 
    */
    @SerializedName("legacyCustomData")
    Map<String, Object> legacyCustomData;

    /**
    * 
    */
    @SerializedName("packages")
    List<OrderPackage> packages;

    /**
    * 
    */
    @SerializedName("payment")
    List<OrderPayment> payment;

    /**
    * Public reference set by the client to display to customers in account areas and transactional emails.
    */
    @SerializedName("publicKey")
    String publicKey;

    /**
    * External order reference set by the client to integrate a third party system.
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * 
    */
    @SerializedName("shipping")
    OrderShipping shipping;

    /**
    * 
    */
    @SerializedName("status")
    String status;

    /**
    * 
    */
    @SerializedName("vouchers")
    List<OrderVoucher> vouchers;

}