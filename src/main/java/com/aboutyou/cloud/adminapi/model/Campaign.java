package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Campaign implements ApiObjectInterface {
    /**
    * The id of the campaign created by Backbone Core.
    */
    @SerializedName("id")
    Integer id;

    /**
    * Name of the campaign.
    */
    @SerializedName("name")
    String name;

    /**
    * Optional description of the campaign.
    */
    @SerializedName("description")
    String description;

    /**
    * List of shop keys the campaign is assigned to.
    */
    @SerializedName("shopKeys")
    List<String> shopKeys;

    /**
    * The reduction percentage applied to all variants, which don't have a specific reduction set.
    */
    @SerializedName("reduction")
    Double reduction;

    /**
    * Start time of campaign in Iso8601 Zulu format.
    */
    @SerializedName("startAt")
    String startAt;

    /**
    * End time of campaign in Iso8601 Zulu format.
    */
    @SerializedName("endAt")
    String endAt;

}