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
    * When `true`, `shippingOptions` may be empty or omitted. When `false` or unset, `shippingOptions` is required.
    */
    @SerializedName("isExternal")
    Boolean isExternal;

    /**
    * Shop country ID this configuration applies to. Must be one of the promotion shop country IDs.
    */
    @SerializedName("shopCountryId")
    Integer shopCountryId;

    /**
    * Required when `isExternal` is `false` or unset; optional when `isExternal` is `true`.
    */
    @SerializedName("shippingOptions")
    List<PromotionEffectFreeShippingOption> shippingOptions;

}