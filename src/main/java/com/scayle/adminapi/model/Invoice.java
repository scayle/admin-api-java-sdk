package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Invoice extends AbstractModel  {
    /**
    * Invoice identifier number
    */
    @SerializedName("number")
    Integer number;

    /**
    * Invoice identifier number that customer views on Order page
    */
    @SerializedName("fullNumber")
    String fullNumber;

}