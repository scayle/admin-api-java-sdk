package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PartialMerchantAssortmentConfigurationExclude extends AbstractModel  {
    /**
    * Merchant reference keys to be added to the exclude list.
    */
    @SerializedName("add")
    List<String> add;

    /**
    * Merchant reference keys to be removed from the exclude list.
    */
    @SerializedName("remove")
    List<String> remove;

}