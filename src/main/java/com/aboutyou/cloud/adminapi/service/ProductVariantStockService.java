package com.aboutyou.cloud.adminapi.service;

import java.util.Map;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class ProductVariantStockService extends AbstractService {
    public ProductVariantStockService(HttpClient httpClient) {
        super(httpClient);
    }

    public ProductVariantStock create(Identifier productIdentifier, Identifier variantIdentifier, ProductVariantStock model) throws ApiErrorException, ConnectionException {
        Class<ProductVariantStock> responseModel = (Class<ProductVariantStock>)(Class<?>)ProductVariantStock.class;

        return this.request("post", this.resolvePath("/products/%s/variants/%s/stocks", productIdentifier, variantIdentifier), null, responseModel, model);
    }

    public ProductVariantStock create(Identifier productIdentifier, Identifier variantIdentifier, ProductVariantStock model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariantStock> responseModel = (Class<ProductVariantStock>)(Class<?>)ProductVariantStock.class;

        return this.request("post", this.resolvePath("/products/%s/variants/%s/stocks", productIdentifier, variantIdentifier), options, responseModel, model);
    }

    public ApiCollection<ProductVariantStock> all(Identifier productIdentifier, Identifier variantIdentifier) throws ApiErrorException, ConnectionException {
        Class<ProductVariantStock> responseModel = (Class<ProductVariantStock>)(Class<?>)ProductVariantStock.class;

        return this.requestCollection("get", this.resolvePath("/products/%s/variants/%s/stocks", productIdentifier, variantIdentifier), null, responseModel);
    }

    public ApiCollection<ProductVariantStock> all(Identifier productIdentifier, Identifier variantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariantStock> responseModel = (Class<ProductVariantStock>)(Class<?>)ProductVariantStock.class;

        return this.requestCollection("get", this.resolvePath("/products/%s/variants/%s/stocks", productIdentifier, variantIdentifier), options, responseModel);
    }

}