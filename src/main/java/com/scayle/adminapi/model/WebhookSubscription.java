package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class WebhookSubscription extends AbstractModel  {
    /**
    * The unique webhook identifier.
    */
    @SerializedName("id")
    Integer id;

    /**
    * Name of the hook event.
    */
    @SerializedName("event")
    String event;

    /**
    * The version of the hook.
    */
    @SerializedName("version")
    Integer version;

    /**
    * The URL that will be called whenever the hook is triggered. Sensitive data will be obfuscated in responses.
    */
    @SerializedName("url")
    String url;

}