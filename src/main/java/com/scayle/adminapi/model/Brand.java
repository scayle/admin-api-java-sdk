package com.scayle.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Brand implements ApiObjectInterface {
    /**
    * The ID of the brand created by SCAYLE.
    */
    @SerializedName("id")
    Integer id;

    /**
    * Name of the brand.
    */
    @SerializedName("name")
    String name;

    /**
    * Group name allowing to group different brands.
    */
    @SerializedName("group")
    String group;

    /**
    * URL of the image, either manually specified or generated by SCAYLE, if the SCAYLE CDN is used.
    */
    @SerializedName("logoUrl")
    String logoUrl;

    /**
    * A source specifying where to download the logo from.
    */
    @SerializedName("logoSource")
    AssetSource logoSource;

    /**
    * A list of attributes attached to the brand.
    */
    @SerializedName("attributes")
    List<Attribute> attributes;

    /**
    * Arbitrary fields assigned to Brands
    */
    @SerializedName("customData")
    Object customData;

}