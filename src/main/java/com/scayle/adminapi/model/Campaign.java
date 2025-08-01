package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Campaign extends AbstractModel  {
    /**
    * The ID of the campaign created by SCAYLE.
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

    public void setDescription(String value) {
        if (value == null) {
            this.setNull("description");
        }
        this.description = value;
    }
    /**
    * List of country codes the campaign is valid for.
    */
    @SerializedName("countryCodes")
    List<String> countryCodes;

    /**
    * The reduction percentage applied to all variants, which do not have a specific reduction set.
    */
    @SerializedName("reduction")
    Double reduction;

    /**
    * Start time of campaign in Iso8601 format.
    */
    @SerializedName("startAt")
    java.time.Instant startAt;

    /**
    * End time of campaign in Iso8601 format.
    */
    @SerializedName("endAt")
    java.time.Instant endAt;

    /**
    * A specific key to identify the campaign. If not provided, it will be generated by SCAYLE.
    */
    @SerializedName("campaignKey")
    String campaignKey;

    /**
    * 
    */
    @SerializedName("customData")
    Object customData;

    public void setCustomData(Object value) {
        if (value == null) {
            this.setNull("customData");
        }
        this.customData = value;
    }
    /**
    * The localized headline. Recommended max length is up to 30 characters.
    */
    @SerializedName("headline")
    Map<String, String> headline;

    public void setHeadline(Map<String, String> value) {
        if (value == null) {
            this.setNull("headline");
        }
        this.headline = value;
    }
    /**
    * The localized sub line. Recommended max length is up to 75 characters.
    */
    @SerializedName("subline")
    Map<String, String> subline;

    public void setSubline(Map<String, String> value) {
        if (value == null) {
            this.setNull("subline");
        }
        this.subline = value;
    }
    /**
    * The localized relative link.
    */
    @SerializedName("link")
    Map<String, String> link;

    public void setLink(Map<String, String> value) {
        if (value == null) {
            this.setNull("link");
        }
        this.link = value;
    }
    /**
    * The localized condition. Recommended max length is up to 250 characters.
    */
    @SerializedName("condition")
    Map<String, String> condition;

    public void setCondition(Map<String, String> value) {
        if (value == null) {
            this.setNull("condition");
        }
        this.condition = value;
    }
    /**
    * Defines if the count down should be hidden or not. Displayed by default.
    */
    @SerializedName("hideCountdown")
    Boolean hideCountdown;

    /**
    * The campaign information related to product, for example badge label.
    */
    @SerializedName("product")
    CampaignProduct product;

    /**
    * The color of background and text in hex code with hash
    */
    @SerializedName("color")
    CampaignColor color;

}