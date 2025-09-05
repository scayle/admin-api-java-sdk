package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ChannelUpdateRequest extends AbstractModel  {
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

    /**
    * The application / shop country association of the channel. References an existing company application.
    */
    @SerializedName("shopCountryId")
    Integer shopCountryId;

    /**
    * 
    */
    @SerializedName("defaultPaymentMethod")
    DefaultPaymentMethod defaultPaymentMethod;

    /**
    * If set to false, the channel cannot be used during external order creation.
    */
    @SerializedName("active")
    Boolean active;

    /**
    * 
    */
    @SerializedName("configs")
    ChannelConfigs configs;

}