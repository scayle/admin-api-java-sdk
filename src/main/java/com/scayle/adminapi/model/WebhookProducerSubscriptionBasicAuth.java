package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class WebhookProducerSubscriptionBasicAuth extends AbstractModel  {
    /**
    * Username for HTTP Basic authentication when invoking the webhook URL.
    */
    @SerializedName("username")
    String username;

    /**
    * Password for HTTP Basic authentication when invoking the webhook URL.
    */
    @SerializedName("password")
    String password;

}