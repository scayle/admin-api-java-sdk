package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopCategoryProductSetUnlinkInstruction implements ApiObjectInterface {
    /**
    * IDs of the referencing product sets for which the reference to the stated product set should be unlinked.
    */
    @SerializedName("productSetIds")
    List<Integer> productSetIds;

    /**
    * Declares whether the conditions of the stated product set should be copied over to the referencing product sets.
    */
    @SerializedName("copyConditions")
    Boolean copyConditions;

}