package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductSorting implements ApiObjectInterface {
    /**
    * Backbone Core's internal product identifier.
    */
    @SerializedName("productId")
    Integer productId;

    /**
    * Tenant provided product identifier.
    */
    @SerializedName("productReferenceKey")
    String productReferenceKey;

    /**
    * A key that uniquely identifies the shop within the tenant's ecosystem.
    */
    @SerializedName("shopKey")
    String shopKey;

    /**
    * The sort key.
    */
    @SerializedName("sortKey")
    String sortKey;

    /**
    * The value used for sorting.
    */
    @SerializedName("sortValue")
    Integer sortValue;

}