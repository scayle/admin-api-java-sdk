package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class WebhookSubscriptionPatch extends AbstractModel  {
    /**
    * The URL that will be called whenever the hook is triggered. Sensitive data will be obfuscated in responses.
    */
    @SerializedName("url")
    String url;

    /**
    * 
    */
    @SerializedName("filters")
    List<PartialWebhookSubscriptionFilter> filters;

}