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

    public ProductVariant create(Identifier productIdentifier, ProductVariant model) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.request("post", this.resolvePath("/products/%s/variants", productIdentifier), null, responseModel, model);
    }

    public ProductVariant create(Identifier productIdentifier, ProductVariant model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.request("post", this.resolvePath("/products/%s/variants", productIdentifier), options, responseModel, model);
    }

    public ProductVariant get(Identifier productIdentifier, Identifier variantIdentifier) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.request("get", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), null, responseModel);
    }

    public ProductVariant get(Identifier productIdentifier, Identifier variantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.request("get", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), options, responseModel);
    }

    public ApiCollection<ProductVariant> all(Identifier productIdentifier) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.requestCollection("get", this.resolvePath("/products/%s/variants", productIdentifier), null, responseModel);
    }

    public ApiCollection<ProductVariant> all(Identifier productIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.requestCollection("get", this.resolvePath("/products/%s/variants", productIdentifier), options, responseModel);
    }

    public ProductVariant update(Identifier productIdentifier, Identifier variantIdentifier, ProductVariant model) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.request("put", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), null, responseModel, model);
    }

    public ProductVariant update(Identifier productIdentifier, Identifier variantIdentifier, ProductVariant model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.request("put", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), options, responseModel, model);
    }

    public void delete(Identifier productIdentifier, Identifier variantIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), null, null);
    }

    public void delete(Identifier productIdentifier, Identifier variantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), options, null);
    }

}