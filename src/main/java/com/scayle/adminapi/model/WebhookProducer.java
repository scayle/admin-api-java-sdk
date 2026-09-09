package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class WebhookProducer extends AbstractModel  {
    /**
    * The name of the webhook producer.

    */
    @SerializedName("name")
    String name;

    /**
    * When true, the producer is an internal SCAYLE system. When false, the producer is an add-on or external publisher.

    */
    @SerializedName("isInternal")
    Boolean isInternal = false;

}