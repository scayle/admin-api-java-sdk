package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PartialWebhookSubscriptionMerchantFilterIncludeExclude extends AbstractModel  {
    /**
    * List of merchants to be added to the list.
    */
    @SerializedName("add")
    List<String> add;

    /**
    * List of merchants to be removed from the list.
    */
    @SerializedName("remove")
    List<String> remove;

}