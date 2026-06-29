package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Hosting extends AbstractModel  {
    /**
    * Hosting environment identifier within the shop.
    */
    @SerializedName("envKey")
    String envKey;

}