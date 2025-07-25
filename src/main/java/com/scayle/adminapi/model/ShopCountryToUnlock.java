package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ShopCountryToUnlock extends AbstractModel  {
    /**
    * A key that uniquely identifies the shop within the tenant's ecosystem.
    */
    @SerializedName("shopKey")
    String shopKey;

    /**
    * ISO 3166 alpha 2 country code.
    */
    @SerializedName("countryCode")
    String countryCode;

}