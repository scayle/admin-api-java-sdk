package com.aboutyou.cloud.adminapi.service;

import java.util.Map;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class ProductVariantPriceService extends AbstractService {
    public ProductVariantPriceService(HttpClient httpClient) {
        super(httpClient);
    }

    public ProductVariantPrice create(Object productIdentifier, Object variantIdentifier, ProductVariantPrice model) throws ApiErrorException, ConnectionException {
        Class<ProductVariantPrice> responseModel = (Class<ProductVariantPrice>)(Class<?>)ProductVariantPrice.class;

        return this.request("post", this.resolvePath("/products/%s/variants/%s/prices", productIdentifier, variantIdentifier), null, responseModel, model);
    }

    public ProductVariantPrice create(Object productIdentifier, Object variantIdentifier, ProductVariantPrice model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariantPrice> responseModel = (Class<ProductVariantPrice>)(Class<?>)ProductVariantPrice.class;

        return this.request("post", this.resolvePath("/products/%s/variants/%s/prices", productIdentifier, variantIdentifier), options, responseModel, model);
    }

    public ApiCollection<ProductVariantPrice> all(Object productIdentifier, Object variantIdentifier) throws ApiErrorException, ConnectionException {
        Class<ProductVariantPrice> responseModel = (Class<ProductVariantPrice>)(Class<?>)ProductVariantPrice.class;

        return this.requestCollection("get", this.resolvePath("/products/%s/variants/%s/prices", productIdentifier, variantIdentifier), null, responseModel);
    }

    public ApiCollection<ProductVariantPrice> all(Object productIdentifier, Object variantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariantPrice> responseModel = (Class<ProductVariantPrice>)(Class<?>)ProductVariantPrice.class;

        return this.requestCollection("get", this.resolvePath("/products/%s/variants/%s/prices", productIdentifier, variantIdentifier), options, responseModel);
    }

}