package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Channel extends AbstractModel  {
    /**
    * Numeric primary key generated during creation.
    */
    @SerializedName("id")
    Integer id;

    /**
    * Slug short key to identify the channel. Not allowed to be modified after channel is used for an order.
    */
    @SerializedName("key")
    String key;

    /**
    * Not allowed to be modified after channel is used for an order.
    */
    @SerializedName("type")
    String type;

    /**
    * Custom name of the channel.
    */
    @SerializedName("name")
    String name;

    /**
    * Optional description about the channel in text format.
    */
    @SerializedName("description")
    String description;

    public void setDescription(String value) {
        if (value == null) {
            this.setNull("description");
        }
        this.description = value;
    }
    /**
    * 
    */
    @SerializedName("shopCountry")
    ShopCountry shopCountry;

    /**
    * 
    */
    @SerializedName("defaultPaymentMethod")
    DefaultPaymentMethodResponse defaultPaymentMethod;

    /**
    * If set to false, the channel cannot be used during external order creation.
    */
    @SerializedName("active")
    Boolean active = true;

    /**
    * Shows if the channel is already used in orders.
    */
    @SerializedName("isUsedInOrders")
    Boolean isUsedInOrders;

    /**
    * 
    */
    @SerializedName("configs")
    ChannelConfigsWithDefaults configs;

    /**
    * The date and time when the channel was created.
    */
    @SerializedName("createdAt")
    java.time.Instant createdAt;

    /**
    * The date and time when the channel was last updated.
    */
    @SerializedName("updatedAt")
    java.time.Instant updatedAt;

}