package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UnlockAssetSortingsRequest extends AbstractModel  {
    /**
    * When true, remove the global asset sorting lock (row with application_id = null). Optional; when omitted with shopCountrySpecific, semantics depend on the other field.
    */
    @SerializedName("unlockGlobal")
    Boolean unlockGlobal;

    /**
    * List of shop/country pairs for which to remove the asset sorting lock. Optional.
    */
    @SerializedName("shopCountrySpecific")
    List<ShopCountryToUnlock> shopCountrySpecific;

}