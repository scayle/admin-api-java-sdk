package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.WebhookProducerVisibility;

@Getter
@Setter
public class WebhookProducerRegistration extends AbstractModel  {
    /**
    * Immutable identifier of the producer, used in the paths of its events, subscriptions and webhooks.

    */
    @SerializedName("identifier")
    String identifier;

    /**
    * User friendly name of the producer. Defaults to the identifier.

    */
    @SerializedName("name")
    String name;

    /**
    * Whether tenants can see the producer. Defaults to customer.

    */
    @SerializedName("visibility")
    WebhookProducerVisibility visibility;

    /**
    * Always true for a registered producer.

    */
    @SerializedName("isExternal")
    Boolean isExternal;

}