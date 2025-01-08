package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Audience extends AbstractModel  {
    /**
    * Audience id
    */
    @SerializedName("id")
    String id;

    /**
    * Internal name of the audience
    */
    @SerializedName("name")
    String name;

    /**
    * Internal description of the audience
    */
    @SerializedName("description")
    String description;

    /**
    * The list of company ids where the audience takes place
    */
    @SerializedName("companyIds")
    List<Integer> companyIds;

    /**
    * The list of customer ids
    */
    @SerializedName("customerIds")
    List<Integer> customerIds;

    /**
    * Created at date
    */
    @SerializedName("createdAt")
    String createdAt;

    /**
    * Updated at date
    */
    @SerializedName("updatedAt")
    String updatedAt;

}