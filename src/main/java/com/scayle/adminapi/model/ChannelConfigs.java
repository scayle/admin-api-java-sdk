package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ChannelConfigs extends AbstractModel  {
    /**
    * State of the tenant config email.all.enabled for the channel and shopCountryId combination.
    */
    @SerializedName("emailsEnabled")
    Boolean emailsEnabled;

    /**
    * State of the tenant config invoiceGenerateDocument.enabled for the channel and shopCountryId combination.
    */
    @SerializedName("invoicesEnabled")
    Boolean invoicesEnabled;

    /**
    * State of the tenant config externalOrder.priceOverride.enabled for the channel and shopCountryId combination.
    */
    @SerializedName("externalPriceOverrideEnabled")
    Boolean externalPriceOverrideEnabled;

}