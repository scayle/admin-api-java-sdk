package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

import com.scayle.adminapi.enums.WebhookProducerSubscriptionDisabledReason;

@Getter
@Setter
public class WebhookProducerSubscription extends AbstractModel  {
    /**
    * Subscription ID.
    */
    @SerializedName("id")
    Integer id;

    /**
    * Identifier in an external system; must be unique per producer when set.
    */
    @SerializedName("externalId")
    String externalId;

    public void setExternalId(String value) {
        if (value == null) {
            this.setNull("externalId");
        }
        this.externalId = value;
    }
    /**
    * Event name this subscription listens to.
    */
    @SerializedName("eventName")
    String eventName;

    /**
    * Delivery URL including scheme (HTTP or HTTPS).
    */
    @SerializedName("url")
    String url;

    /**
    * Subscription scope context (for example company or shop country identifiers) used for routing and filtering.
    */
    @SerializedName("target")
    Map<String, Object> target;

    /**
    * When false, webhooks are not delivered until re-enabled.
    */
    @SerializedName("enabled")
    Boolean enabled = true;

    /**
    * Set when the subscription was automatically disabled (for example due to excessive delivery failures). The only sentinel value exposed today is `max_suspensions`.
    */
    @SerializedName("disabledReason")
    WebhookProducerSubscriptionDisabledReason disabledReason;

    public void setDisabledReason(WebhookProducerSubscriptionDisabledReason value) {
        if (value == null) {
            this.setNull("disabledReason");
        }
        this.disabledReason = value;
    }
    /**
    * 
    */
    @SerializedName("auth")
    Object auth;

    /**
    * Extra HTTP headers attached to webhook requests.
    */
    @SerializedName("customHeaders")
    Map<String, String> customHeaders;

    /**
    * Maximum delivery requests per minute for this subscription.
    */
    @SerializedName("rpm")
    Integer rpm;

    /**
    * When set, deliveries are deferred until after this timestamp.
    */
    @SerializedName("suspendedUntil")
    java.time.Instant suspendedUntil;

    /**
    * Notification email (for example when a subscription becomes suspended).
    */
    @SerializedName("email")
    String email;

    /**
    * When true, the subscription is used for a managed integration path. When false, notifications are sent to the HTTPS URL you configure in `url`.
    */
    @SerializedName("isInternal")
    Boolean isInternal;

}