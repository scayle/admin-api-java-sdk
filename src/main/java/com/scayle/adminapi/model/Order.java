package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order extends AbstractModel  {
    /**
    * The ID of the order created
    */
    @SerializedName("id")
    Integer id;

    /**
    * Billing and Shipping address of the customer
    */
    @SerializedName("address")
    OrderAddress address;

    /**
    * A key that uniquely identifies customer's cart
    */
    @SerializedName("basketKey")
    String basketKey;

    /**
    * Reference to the campaign applied to this order
    */
    @SerializedName("campaignKey")
    String campaignKey;

    /**
    * Timestamp when the order was confirmed
    */
    @SerializedName("confirmedAt")
    String confirmedAt;

    /**
    * Collection of contacts
    */
    @SerializedName("contacts")
    List<OrderContact> contacts;

    /**
    * Total cost of the order that includes tax, VAT, etc
    */
    @SerializedName("cost")
    OrderCost cost;

    /**
    * ISO 4217 currency code
    */
    @SerializedName("currencyCode")
    String currencyCode;

    /**
    * Details about the customer account
    */
    @SerializedName("customer")
    Customer customer;

    /**
    * Country of the shop as ISO 3166 alpha 2 country code
    */
    @SerializedName("shopCountry")
    ShopCountry shopCountry;

    /**
    * Timestamp when the invoice is sent
    */
    @SerializedName("invoicedAt")
    String invoicedAt;

    /**
    * Timestamp when the order is created
    */
    @SerializedName("createdAt")
    String createdAt;

    /**
    * Timestamp when the order is updated
    */
    @SerializedName("updatedAt")
    String updatedAt;

    /**
    * Collection of items ordered
    */
    @SerializedName("items")
    List<OrderItem> items;

    /**
    * Custom data added to the order (legacy feature)
    */
    @SerializedName("legacyCustomData")
    Map<String, Object> legacyCustomData;

    /**
    * Membership discount information
    */
    @SerializedName("membershipDiscount")
    OrderMembershipDiscount membershipDiscount;

    /**
    * Details for the package(s) part of the order
    */
    @SerializedName("packages")
    List<OrderPackage> packages;

    /**
    * Payment details
    */
    @SerializedName("payment")
    List<OrderPayment> payment;

    /**
    * Order promotions
    */
    @SerializedName("promotion")
    List<OrderPromotion> promotion;

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
    * Shipping details
    */
    @SerializedName("shipping")
    OrderShipping shipping;

    /**
    * Status of the order e.g: invoice_completed
    */
    @SerializedName("status")
    String status;

    /**
    * 
    */
    @SerializedName("detailedStatus")
    OrderDetailedStatus detailedStatus;

    /**
    * Applicable voucher and its details
    */
    @SerializedName("vouchers")
    List<OrderVoucher> vouchers;

    /**
    * Applicable voucher and its details
    */
    @SerializedName("voucher")
    OrderVoucher voucher;

    /**
    * 
    */
    @SerializedName("loyaltyCard")
    OrderLoyaltyCard loyaltyCard;

}