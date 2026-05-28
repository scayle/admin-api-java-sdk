package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class WebhookProducerEvent extends AbstractModel  {
    /**
    * Event ID.
    */
    @SerializedName("id")
    Integer id;

    /**
    * Event name.
    */
    @SerializedName("name")
    String name;

    /**
    * Human-readable explanation of when the event is emitted.
    */
    @SerializedName("description")
    String description;

    /**
    * Subset of JSON Schema describing validated fields present in webhook payloads for this event.
    */
    @SerializedName("targetSchema")
    Map<String, Object> targetSchema;

}