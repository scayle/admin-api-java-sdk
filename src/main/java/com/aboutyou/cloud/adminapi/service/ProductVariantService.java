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
public class ProductVariantService extends AbstractService {
    public ProductVariantService(HttpClient httpClient) {
        super(httpClient);
    }

    public ProductVariant create(Identifier productIdentifier, ProductVariant model) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.request("post", this.resolvePath("/products/%s/variants", productIdentifier), null, null, responseModel, model);
    }

    public ProductVariant create(Identifier productIdentifier, ProductVariant model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/products/%s/variants", productIdentifier), query, null, responseModel, model);
    }

    public ProductVariant get(Identifier productIdentifier, Identifier variantIdentifier) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.request("get", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), null, null, responseModel);
    }

    public ProductVariant get(Identifier productIdentifier, Identifier variantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), query, null, responseModel);
    }

    public ApiCollection<ProductVariant> all(Identifier productIdentifier) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.requestCollection("get", this.resolvePath("/products/%s/variants", productIdentifier), null, null, responseModel);
    }

    public ApiCollection<ProductVariant> all(Identifier productIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/products/%s/variants", productIdentifier), query, null, responseModel);
    }

    public ProductVariant update(Identifier productIdentifier, Identifier variantIdentifier, ProductVariant model) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        return this.request("put", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), null, null, responseModel, model);
    }

    public ProductVariant update(Identifier productIdentifier, Identifier variantIdentifier, ProductVariant model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariant> responseModel = (Class<ProductVariant>)(Class<?>)ProductVariant.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), query, null, responseModel, model);
    }

    public void delete(Identifier productIdentifier, Identifier variantIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), null, null, null);
    }

    public void delete(Identifier productIdentifier, Identifier variantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/products/%s/variants/%s", productIdentifier, variantIdentifier), query, null, null);
    }

    public Attribute updateOrCreateAttribute(Identifier productIdentifier, Identifier variantIdentifier, Attribute model) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.request("post", this.resolvePath("/products/%s/variants/%s/attributes", productIdentifier, variantIdentifier), null, null, responseModel, model);
    }

    public Attribute updateOrCreateAttribute(Identifier productIdentifier, Identifier variantIdentifier, Attribute model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/products/%s/variants/%s/attributes", productIdentifier, variantIdentifier), query, null, responseModel, model);
    }

    public void deleteAttribute(Identifier productIdentifier, Identifier variantIdentifier, String attributeGroupName) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s/variants/%s/attributes/%s", productIdentifier, variantIdentifier, attributeGroupName), null, null, null);
    }

    public void deleteAttribute(Identifier productIdentifier, Identifier variantIdentifier, String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/products/%s/variants/%s/attributes/%s", productIdentifier, variantIdentifier, attributeGroupName), query, null, null);
    }

    public Attribute getAttribute(Identifier productIdentifier, Identifier variantIdentifier, String attributeGroupName) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.request("get", this.resolvePath("/products/%s/variants/%s/attributes/%s", productIdentifier, variantIdentifier, attributeGroupName), null, null, responseModel);
    }

    public Attribute getAttribute(Identifier productIdentifier, Identifier variantIdentifier, String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/products/%s/variants/%s/attributes/%s", productIdentifier, variantIdentifier, attributeGroupName), query, null, responseModel);
    }

    public ApiCollection<Attribute> allAttributes(Identifier productIdentifier, Identifier variantIdentifier) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.requestCollection("get", this.resolvePath("/products/%s/variants/%s/attributes", productIdentifier, variantIdentifier), null, null, responseModel);
    }

    public ApiCollection<Attribute> allAttributes(Identifier productIdentifier, Identifier variantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/products/%s/variants/%s/attributes", productIdentifier, variantIdentifier), query, null, responseModel);
    }

    public Map<String, Object> createOrUpdateCustomData(Identifier variantIdentifier, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/variants/%s/custom-data", variantIdentifier), null, null, responseModel, model);
    }

    public Map<String, Object> createOrUpdateCustomData(Identifier variantIdentifier, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/variants/%s/custom-data", variantIdentifier), query, null, responseModel, model);
    }

    public void deleteCustomData(Identifier variantIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/variants/%s/custom-data", variantIdentifier), null, null, null);
    }

    public void deleteCustomData(Identifier variantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/variants/%s/custom-data", variantIdentifier), query, null, null);
    }

    public Map<String, Object> getCustomData(Identifier variantIdentifier) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/variants/%s/custom-data", variantIdentifier), null, null, responseModel);
    }

    public Map<String, Object> getCustomData(Identifier variantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/variants/%s/custom-data", variantIdentifier), query, null, responseModel);
    }

    public Map<String, Object> createOrUpdateCustomDataForKey(Identifier variantIdentifier, String key, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/variants/%s/custom-data/%s", variantIdentifier, key), null, null, responseModel, model);
    }

    public Map<String, Object> createOrUpdateCustomDataForKey(Identifier variantIdentifier, String key, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/variants/%s/custom-data/%s", variantIdentifier, key), query, null, responseModel, model);
    }

    public void deleteCustomDataForKey(Identifier variantIdentifier, String key) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/variants/%s/custom-data/%s", variantIdentifier, key), null, null, null);
    }

    public void deleteCustomDataForKey(Identifier variantIdentifier, String key, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/variants/%s/custom-data/%s", variantIdentifier, key), query, null, null);
    }

    public Map<String, Object> getCustomDataForKey(Identifier variantIdentifier, String key) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/variants/%s/custom-data/%s", variantIdentifier, key), null, null, responseModel);
    }

    public Map<String, Object> getCustomDataForKey(Identifier variantIdentifier, String key, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/variants/%s/custom-data/%s", variantIdentifier, key), query, null, responseModel);
    }

}
