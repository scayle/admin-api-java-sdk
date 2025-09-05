package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderChannel extends AbstractModel  {
    /**
    * Internal channel unique id
    */
    @SerializedName("id")
    Integer id;

    /**
    * Channel unique key
    */
    @SerializedName("key")
    String key;

    /**
    * Channel name
    */
    @SerializedName("name")
    String name;

    /**
    * Not allowed to be modified after channel is used for an order.
    */
    @SerializedName("type")
    String type;

}