package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class VideoPositionLocks extends AbstractModel  {
    /**
    * Global video-position sorting lock for the product (application_id = null).
true creates the lock if missing; false is a no-op (locks can only be removed via unlock-video-sortings).

    */
    @SerializedName("isLocked")
    Boolean isLocked;

    /**
    * Per shop-country sorting locks. Omitted scopes are left unchanged.
    */
    @SerializedName("shopCountrySpecific")
    List<VideoPositionLockShopCountry> shopCountrySpecific;

}