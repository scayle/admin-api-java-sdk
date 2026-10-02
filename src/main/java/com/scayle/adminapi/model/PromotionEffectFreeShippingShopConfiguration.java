package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PromotionEffectFreeShippingShopConfiguration extends AbstractModel  {
    /**
    * Whether this shop is external.
An external shop does not use internal shipping options, so `shippingOptions` may be omitted.
An internal shop (`false` or unset) grants free shipping only for the options listed in `shippingOptions`.

    */
    @SerializedName("isExternal")
    Boolean isExternal;

    /**
    * Shop country ID this configuration applies to. Must be one of the promotion shop country IDs.
    */
    @SerializedName("shopCountryId")
    Integer shopCountryId;

    /**
    * Shipping options this promotion makes free for an internal shop.
When present, the list must contain at least one option.
Required for an internal shop; omit it for an external shop.

    */
    @SerializedName("shippingOptions")
    List<PromotionEffectFreeShippingOption> shippingOptions;

}