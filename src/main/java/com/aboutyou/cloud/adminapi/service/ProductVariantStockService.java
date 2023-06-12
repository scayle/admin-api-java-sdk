package com.aboutyou.cloud.adminapi.service;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class ProductVariantStockService extends AbstractService {
    public ProductVariantStockService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ProductVariantStock create(Identifier variantIdentifier, ProductVariantStock model) throws ApiErrorException, ConnectionException {
        Class<ProductVariantStock> responseModel = (Class<ProductVariantStock>)(Class<?>)ProductVariantStock.class;

        return this.request("post", this.resolvePath("/variants/%s/stocks", variantIdentifier), null, null, responseModel, model);
    }

    
    public ProductVariantStock create(Identifier variantIdentifier, ProductVariantStock model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariantStock> responseModel = (Class<ProductVariantStock>)(Class<?>)ProductVariantStock.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/variants/%s/stocks", variantIdentifier), query, null, responseModel, model);
    }

    
    public ApiCollection<ProductVariantStock> all(Identifier variantIdentifier) throws ApiErrorException, ConnectionException {
        Class<ProductVariantStock> responseModel = (Class<ProductVariantStock>)(Class<?>)ProductVariantStock.class;

        return this.requestCollection("get", this.resolvePath("/variants/%s/stocks", variantIdentifier), null, null, responseModel);
    }

    
    public ApiCollection<ProductVariantStock> all(Identifier variantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariantStock> responseModel = (Class<ProductVariantStock>)(Class<?>)ProductVariantStock.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/variants/%s/stocks", variantIdentifier), query, null, responseModel);
    }

}
