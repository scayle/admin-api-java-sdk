package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CampaignProduct extends AbstractModel  {
    /**
    * The localized product badge label. Recommended max length is up to 30 characters.
    */
    @SerializedName("badgeLabel")
    Map<String, String> badgeLabel;

}