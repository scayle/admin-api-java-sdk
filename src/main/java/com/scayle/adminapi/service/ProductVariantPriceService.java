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
public class ProductVariantPriceService extends AbstractService {
    public ProductVariantPriceService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ProductVariantPrice create(Identifier variantIdentifier, ProductVariantPrice model) throws ApiErrorException, ConnectionException {
        Class<ProductVariantPrice> responseModel = (Class<ProductVariantPrice>)(Class<?>)ProductVariantPrice.class;

        return this.request("post", this.resolvePath("/variants/%s/prices", variantIdentifier), null, null, responseModel, model);
    }

    
    public ProductVariantPrice create(Identifier variantIdentifier, ProductVariantPrice model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariantPrice> responseModel = (Class<ProductVariantPrice>)(Class<?>)ProductVariantPrice.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/variants/%s/prices", variantIdentifier), query, null, responseModel, model);
    }

    
    public ApiCollection<ProductVariantPrice> all(Identifier variantIdentifier) throws ApiErrorException, ConnectionException {
        Class<ProductVariantPrice> responseModel = (Class<ProductVariantPrice>)(Class<?>)ProductVariantPrice.class;

        return this.requestCollection("get", this.resolvePath("/variants/%s/prices", variantIdentifier), null, null, responseModel);
    }

    
    public ApiCollection<ProductVariantPrice> all(Identifier variantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariantPrice> responseModel = (Class<ProductVariantPrice>)(Class<?>)ProductVariantPrice.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/variants/%s/prices", variantIdentifier), query, null, responseModel);
    }

    
    public void delete(Identifier variantIdentifier, String priceKey) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/variants/%s/prices/%s", variantIdentifier, priceKey), null, null, null);
    }

    
    public void delete(Identifier variantIdentifier, String priceKey, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/variants/%s/prices/%s", variantIdentifier, priceKey), query, null, null);
    }

    
    public BulkRequest createBulkRequest(CreateBulkRequest model) throws ApiErrorException, ConnectionException {
        Class<BulkRequest> responseModel = (Class<BulkRequest>)(Class<?>)BulkRequest.class;

        return this.request("post", this.resolvePath("/variants/prices/bulk-requests"), null, null, responseModel, model);
    }

    
    public BulkRequest createBulkRequest(CreateBulkRequest model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<BulkRequest> responseModel = (Class<BulkRequest>)(Class<?>)BulkRequest.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/variants/prices/bulk-requests"), query, null, responseModel, model);
    }

}
