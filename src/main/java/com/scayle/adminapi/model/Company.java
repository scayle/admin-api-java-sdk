package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Company extends AbstractModel  {
    /**
    * The ID of the company created by SCAYLE.
    */
    @SerializedName("id")
    Integer id;

    /**
    * Name of the company.
    */
    @SerializedName("name")
    String name;

}