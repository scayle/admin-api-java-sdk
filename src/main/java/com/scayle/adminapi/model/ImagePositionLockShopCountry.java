package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ImagePositionLockShopCountry extends AbstractModel  {
    /**
    * A key that uniquely identifies the shop within the tenant's ecosystem.
    */
    @SerializedName("shopKey")
    String shopKey;

    /**
    * ISO 3166-1 alpha-2 country code.
    */
    @SerializedName("countryCode")
    String countryCode;

    /**
    * When true, create a product asset-sorting lock for this shop-country if none exists.
When false, no lock change (locks are only removed via unlock-asset-sortings).

    */
    @SerializedName("isLocked")
    Boolean isLocked;

}