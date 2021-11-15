package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderVat implements ApiObjectInterface {
    /**
    * 
    */
    @SerializedName("amount")
    Double amount;

    /**
    * 
    */
    @SerializedName("rate")
    Double rate;

}