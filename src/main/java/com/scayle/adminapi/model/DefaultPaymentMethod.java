package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DefaultPaymentMethod extends AbstractModel  {
    /**
    * ID of the default payment method.
    */
    @SerializedName("id")
    Integer id;

    /**
    * Key of the default payment method.
    */
    @SerializedName("key")
    String key;

}