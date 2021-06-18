package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class ProductVariantPriceService extends AbstractService {
    public ProductVariantPriceService(HttpClient httpClient) {
        super(httpClient);
    }

    public ProductVariantPrice create(Identifier variantIdentifier, ProductVariantPrice model) throws ApiErrorException, ConnectionException {
        Class<ProductVariantPrice> responseModel = (Class<ProductVariantPrice>)(Class<?>)ProductVariantPrice.class;

        return this.request("post", this.resolvePath("/variants/%s/prices", variantIdentifier), null, responseModel, model);
    }

    public ProductVariantPrice create(Identifier variantIdentifier, ProductVariantPrice model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariantPrice> responseModel = (Class<ProductVariantPrice>)(Class<?>)ProductVariantPrice.class;

        return this.request("post", this.resolvePath("/variants/%s/prices", variantIdentifier), options, responseModel, model);
    }

    public ApiCollection<ProductVariantPrice> all(Identifier variantIdentifier) throws ApiErrorException, ConnectionException {
        Class<ProductVariantPrice> responseModel = (Class<ProductVariantPrice>)(Class<?>)ProductVariantPrice.class;

        return this.requestCollection("get", this.resolvePath("/variants/%s/prices", variantIdentifier), null, responseModel);
    }

    public ApiCollection<ProductVariantPrice> all(Identifier variantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariantPrice> responseModel = (Class<ProductVariantPrice>)(Class<?>)ProductVariantPrice.class;

        return this.requestCollection("get", this.resolvePath("/variants/%s/prices", variantIdentifier), options, responseModel);
    }

    public void deleteFuturePrice(Identifier variantIdentifier, Integer priceId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/variants/%s/prices/%s", variantIdentifier, priceId), null, null);
    }

    public void deleteFuturePrice(Identifier variantIdentifier, Integer priceId, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/variants/%s/prices/%s", variantIdentifier, priceId), options, null);
    }

}