package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class WebhookProducerWebhook extends AbstractModel  {
    /**
    * Name of the event the webhook is triggered for.
    */
    @SerializedName("eventName")
    String eventName;

    /**
    * Payload delivered to the subscribers.
    */
    @SerializedName("payload")
    Map<String, Object> payload;

    /**
    * Context of the webhook (for example company or shop country identifiers), matched against the subscription targets.
    */
    @SerializedName("target")
    Map<String, Object> target;

    /**
    * Extra HTTP headers attached to the delivery requests.
    */
    @SerializedName("customHeaders")
    Map<String, String> customHeaders;

}