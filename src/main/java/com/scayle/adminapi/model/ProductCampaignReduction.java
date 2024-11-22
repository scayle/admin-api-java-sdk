package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductCampaignReduction extends AbstractModel  {
    /**
    * SCAYLE's internal product identifier.
    */
    @SerializedName("productId")
    Integer productId;

    /**
    * Tenant provided product identifier.
    */
    @SerializedName("productReferenceKey")
    String productReferenceKey;

    /**
    * The reduction percentage applied to all variants belonging to this product.
    */
    @SerializedName("reduction")
    Integer reduction;

}