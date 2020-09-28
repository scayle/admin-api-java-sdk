package com.aboutyou.cloud.adminapi.service;

import java.util.Map;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class ProductVariantService extends AbstractService {
    public ProductVariantService(HttpClient httpClient) {
        super(httpClient);
    }

    public ProductVariant create(Object productIdentifier, ProductVariant model) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.request("post", this.resolvePath("/products/%s/variants", productIdentifier), null, responseModel, model);
    }

    public ProductVariant create(Object productIdentifier, ProductVariant model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.request("post", this.resolvePath("/products/%s/variants", productIdentifier), options, responseModel, model);
    }

    public ProductVariant find(Object productIdentifier, Object variantIdentifier) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.request("get", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), null, responseModel);
    }

    public ProductVariant find(Object productIdentifier, Object variantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.request("get", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), options, responseModel);
    }

    public ApiCollection<ProductVariant> all(Object productIdentifier) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.requestCollection("get", this.resolvePath("/products/%s/variants", productIdentifier), null, responseModel);
    }

    public ApiCollection<ProductVariant> all(Object productIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.requestCollection("get", this.resolvePath("/products/%s/variants", productIdentifier), options, responseModel);
    }

    public ProductVariant replace(Object productIdentifier, Object variantIdentifier, ProductVariant model) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.request("put", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), null, responseModel, model);
    }

    public ProductVariant replace(Object productIdentifier, Object variantIdentifier, ProductVariant model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.request("put", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), options, responseModel, model);
    }

    public void delete(Object productIdentifier, Object variantIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), null, null);
    }

    public void delete(Object productIdentifier, Object variantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), options, null);
    }

}