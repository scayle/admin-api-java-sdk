package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderDetailedStatusItem extends AbstractModel  {
    /**
    * Unique identifier of the state
    */
    @SerializedName("code")
    String code;

    /**
    * Name of the state
    */
    @SerializedName("name")
    String name;

}