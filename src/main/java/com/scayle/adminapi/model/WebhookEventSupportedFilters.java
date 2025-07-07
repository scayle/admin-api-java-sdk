package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class WebhookEventSupportedFilters extends AbstractModel  {
    /**
    * Specifies if the webhook event could be filtered by merchant keys
    */
    @SerializedName("merchants")
    Boolean merchants;

}