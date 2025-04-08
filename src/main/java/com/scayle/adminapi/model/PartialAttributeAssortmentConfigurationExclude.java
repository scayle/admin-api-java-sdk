package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PartialAttributeAssortmentConfigurationExclude extends AbstractModel  {
    /**
    * The attribute values to be added to the exclude list.
    */
    @SerializedName("add")
    List<String> add;

    /**
    * The attribute values to be removed from the exclude list.
    */
    @SerializedName("remove")
    List<String> remove;

}