package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PartialMerchantAssortmentConfigurationInclude extends AbstractModel  {
    /**
    * Merchant reference keys to be added to the include list.
    */
    @SerializedName("add")
    List<String> add;

    /**
    * Merchant reference keys to be removed from the include list.
    */
    @SerializedName("remove")
    List<String> remove;

}