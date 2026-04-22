package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CopyProductMaster extends AbstractModel  {
    /**
    * The reference key of the master to attach the copied product to. When the value is new, a new ProductMaster is created.
    */
    @SerializedName("referenceKey")
    String referenceKey;

}