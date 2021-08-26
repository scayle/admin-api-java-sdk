package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebhookSubscription implements ApiObjectInterface {
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
    * The URL that will be called whenever the hook is triggered.
    */
    @SerializedName("url")
    String url;

}