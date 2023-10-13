package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderLoyaltyCard implements ApiObjectInterface {
    /**
    * The loyalty card number
    */
    @SerializedName("cardNumber")
    String cardNumber;

    /**
    * The number of points received for the purchase
    */
    @SerializedName("points")
    Integer points;

    /**
    * The provider of the loyalty card
    */
    @SerializedName("provider")
    String provider;

}