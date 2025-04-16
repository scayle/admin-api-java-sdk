package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PartialProductAssortmentConfigurationInclude extends AbstractModel  {
    /**
    * The product IDs to be added to the include list.
    */
    @SerializedName("add")
    List<Integer> add;

    /**
    * The product IDs to be removed from the include list.
    */
    @SerializedName("remove")
    List<Integer> remove;

}