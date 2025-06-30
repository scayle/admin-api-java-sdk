package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class WebhookSubscriptionMerchantFilter extends AbstractModel  {
    /**
    * Merchant reference keys included.
    */
    @SerializedName("include")
    List<String> include;

    /**
    * Merchant reference keys excluded.
    */
    @SerializedName("exclude")
    List<String> exclude;

}