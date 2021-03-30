package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Master implements ApiObjectInterface {
    /**
    * A key that uniquely identifies a group of products (e.g., all colors of a shirt) within the tenant's ecosystem.
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * The master categories all products of this group are attached to.
    */
    @SerializedName("categories")
    ProductMasterCategories categories;

    /**
    * A list of attributes attached to the master.
    */
    @SerializedName("attributes")
    List<Attribute> attributes;

}