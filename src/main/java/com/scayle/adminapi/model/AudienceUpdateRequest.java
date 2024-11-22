package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AudienceUpdateRequest extends AbstractModel  {
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
    * The list of customer ids
    */
    @SerializedName("customerIds")
    List<Integer> customerIds;

}