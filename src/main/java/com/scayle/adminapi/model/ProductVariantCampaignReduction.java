package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductVariantCampaignReduction extends AbstractModel  {
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

    public void setProductVariantReferenceKey(String value) {
        if (value == null) {
            this.setNull("productVariantReferenceKey");
        }
        this.productVariantReferenceKey = value;
    }
    /**
    * The reduction percentage applied to this specific variant.
    */
    @SerializedName("reduction")
    Integer reduction;

}