package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductVariantCampaignReduction implements ApiObjectInterface {
    /**
    * SCAYLE's internal reduction identifier.
    */
    @SerializedName("id")
    Integer id;

    /**
    * SCAYLE's internal product variant identifier.
    */
    @SerializedName("productVariantId")
    Integer productVariantId;

    /**
    * Tenant provided product variant identifier.
    */
    @SerializedName("productVariantReferenceKey")
    String productVariantReferenceKey;

    /**
    * The reduction percentage applied to this specific variant.
    */
    @SerializedName("reduction")
    Integer reduction;

}