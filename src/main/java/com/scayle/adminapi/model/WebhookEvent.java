package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebhookEvent implements ApiObjectInterface {
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
    * Explaination for the hook.
    */
    @SerializedName("description")
    String description;

    /**
    * The webhook event is deprecated and is not allowed for new subscriptions.
    */
    @SerializedName("isDeprecated")
    Boolean isDeprecated;

    /**
    * Indicates whether the event triggers a blocking or non-blocking webhook.
    */
    @SerializedName("isBlocking")
    Boolean isBlocking;

}