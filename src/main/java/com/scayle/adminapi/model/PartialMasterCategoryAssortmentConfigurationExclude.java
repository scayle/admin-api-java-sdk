package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PartialMasterCategoryAssortmentConfigurationExclude extends AbstractModel  {
    /**
    * List of master categories to be added to the exclude list.
    */
    @SerializedName("add")
    List<List<String>> add;

    /**
    * List of master categories to be removed from the exclude list.
    */
    @SerializedName("remove")
    List<List<String>> remove;

}