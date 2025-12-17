package com.scayle.adminapi.service;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import com.scayle.adminapi.exception.ApiErrorException;
import com.scayle.adminapi.exception.ConnectionException;
import com.scayle.adminapi.http.HttpClient;
import com.scayle.adminapi.model.*;

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

    
    public BulkRequest createBulkRequest(CreateBulkRequest model) throws ApiErrorException, ConnectionException {
        Class<BulkRequest> responseModel = (Class<BulkRequest>)(Class<?>)BulkRequest.class;

        return this.request("post", this.resolvePath("/variants/stocks/bulk-requests"), null, null, responseModel, model);
    }

    
    public BulkRequest createBulkRequest(CreateBulkRequest model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<BulkRequest> responseModel = (Class<BulkRequest>)(Class<?>)BulkRequest.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/variants/stocks/bulk-requests"), query, null, responseModel, model);
    }

}
