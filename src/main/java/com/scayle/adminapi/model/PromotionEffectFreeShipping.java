package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PromotionEffectFreeShipping extends AbstractModel  {
    /**
    * Per-shop shipping options the free shipping effect applies to.
Each entry is either an internal configuration (`isExternal` false/unset → `shippingOptions` required)
or an external configuration (`isExternal` true → `shippingOptions` optional).

    */
    @SerializedName("shippingOptionsConfiguration")
    List<PromotionEffectFreeShippingShopConfiguration> shippingOptionsConfiguration;

}