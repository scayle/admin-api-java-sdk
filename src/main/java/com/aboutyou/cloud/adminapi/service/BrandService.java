package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class BrandService extends AbstractService {
    public BrandService(HttpClient httpClient) {
        super(httpClient);
    }

    public ApiCollection<Brand> all() throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.requestCollection("get", this.resolvePath("/brands"), null, responseModel);
    }

    public ApiCollection<Brand> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.requestCollection("get", this.resolvePath("/brands"), options, responseModel);
    }

    public Brand get(Integer brandId) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.request("get", this.resolvePath("/brands/%s", brandId), null, responseModel);
    }

    public Brand get(Integer brandId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.request("get", this.resolvePath("/brands/%s", brandId), options, responseModel);
    }

    public Brand create(Brand model) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.request("post", this.resolvePath("/brands"), null, responseModel, model);
    }

    public Brand create(Brand model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.request("post", this.resolvePath("/brands"), options, responseModel, model);
    }

    public Brand update(Integer brandId, Brand model) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.request("put", this.resolvePath("/brands/%s", brandId), null, responseModel, model);
    }

    public Brand update(Integer brandId, Brand model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.request("put", this.resolvePath("/brands/%s", brandId), options, responseModel, model);
    }

    public void delete(Integer brandId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/brands/%s", brandId), null, null);
    }

    public void delete(Integer brandId, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/brands/%s", brandId), options, null);
    }

    public Map<String, Object> createOrUpdateCustomData(Integer brandId, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/brands/%s/custom-data", brandId), null, responseModel, model);
    }

    public Map<String, Object> createOrUpdateCustomData(Integer brandId, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/brands/%s/custom-data", brandId), options, responseModel, model);
    }

    public void deleteCustomData(Integer brandId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/brands/%s/custom-data", brandId), null, null);
    }

    public void deleteCustomData(Integer brandId, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/brands/%s/custom-data", brandId), options, null);
    }

    public Map<String, Object> getCustomData(Integer brandId) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/brands/%s/custom-data", brandId), null, responseModel);
    }

    public Map<String, Object> getCustomData(Integer brandId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/brands/%s/custom-data", brandId), options, responseModel);
    }

    public Map<String, Object> createOrUpdateCustomDataForKey(Integer brandId, String key, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/brands/%s/custom-data/%s", brandId, key), null, responseModel, model);
    }

    public Map<String, Object> createOrUpdateCustomDataForKey(Integer brandId, String key, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/brands/%s/custom-data/%s", brandId, key), options, responseModel, model);
    }

    public void deleteCustomDataForKey(Integer brandId, String key) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/brands/%s/custom-data/%s", brandId, key), null, null);
    }

    public void deleteCustomDataForKey(Integer brandId, String key, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/brands/%s/custom-data/%s", brandId, key), options, null);
    }

    public Map<String, Object> getCustomDataForKey(Integer brandId, String key) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/brands/%s/custom-data/%s", brandId, key), null, responseModel);
    }

    public Map<String, Object> getCustomDataForKey(Integer brandId, String key, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/brands/%s/custom-data/%s", brandId, key), options, responseModel);
    }

}