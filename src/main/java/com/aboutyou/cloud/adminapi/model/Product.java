package com.aboutyou.cloud.adminapi.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product implements ApiObjectInterface {
    /**
    * The id of the product created by Backbone Core.
    */
    @SerializedName("id")
    Integer id;

    /**
    * If product is in problem state, the reasons are listed here.
    */
    @SerializedName("problems")
    List<String> problems;

    /**
    * A key that uniquely identifies the product (e.g. a shirt in a specific color) within the tenant's ecosystem.
    */
    @SerializedName("referenceKey")
    String referenceKey;

    /**
    * The localized product name. At least the base language that is configured in Backbone Core is mandatory.
    */
    @SerializedName("name")
    Map<String, String> name;

    /**
    * 
    */
    @SerializedName("master")
    Master master;

    /**
    * During a write operation, the state can either be specified as `live` or `draft`.

Within a shop only products which are `live` are being shown.

If the desired state is set to `live`, the product will be validated by the following rules first:

1. The product data is complete and valid
  - The product is not missing any mandatory attributes (only if mandatory attribute groups are configured).
  - The product has at least one image (if images are configured as mandatory).
  - The product has no blacklisted term (if the feature is enabled).
  - The product does not have the same differentiating attribute with other products of the same master (if the feature is enabled).
2. At least one variant of the product has a valid price for the country that's connected to the shop.
3. At least one variant of the product is in stock (or sellable without stock) for the warehouse that's connected to the shop.
4. The product matches the assortment configuration of the shop.
5. The product passes all other filters (e.g. product/variant is neither deleted nor blocked).

If all checks pass, the product state will be set to `live`.
If one or more checks fail, the product state will be set to `problem`. Additionally the response will contain a property named `problems`, listing all validation errors. These errors needs to get resolved, before a product can go `live`.

    */
    @SerializedName("state")
    String state = "live";

    /**
    * All products belonging to the same master must share the same categories.

Every category must be represented as an ordered list representing a category path. The lowest index of a category
list must contain the root category and the highest index must contain the leaf category.

    */
    @SerializedName("categories")
    List<List<String>> categories;

    /**
    * 
    */
    @SerializedName("attributes")
    List<AttributeInterface> attributes;

    /**
    * 
    */
    @SerializedName("variants")
    List<ProductVariant> variants;

    /**
    * 
    */
    @SerializedName("images")
    List<ProductImage> images;

}