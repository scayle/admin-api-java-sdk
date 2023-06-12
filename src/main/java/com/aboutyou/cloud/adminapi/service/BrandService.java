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
public class BrandService extends AbstractService {
    public BrandService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ApiCollection<Brand> all() throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.requestCollection("get", this.resolvePath("/brands"), null, null, responseModel);
    }

    
    public ApiCollection<Brand> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/brands"), query, null, responseModel);
    }

    
    public Brand get(Integer brandId) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.request("get", this.resolvePath("/brands/%s", brandId), null, null, responseModel);
    }

    
    public Brand get(Integer brandId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/brands/%s", brandId), query, null, responseModel);
    }

    
    public Brand create(Brand model) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.request("post", this.resolvePath("/brands"), null, null, responseModel, model);
    }

    
    public Brand create(Brand model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/brands"), query, null, responseModel, model);
    }

    
    public Brand update(Integer brandId, Brand model) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.request("put", this.resolvePath("/brands/%s", brandId), null, null, responseModel, model);
    }

    
    public Brand update(Integer brandId, Brand model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/brands/%s", brandId), query, null, responseModel, model);
    }

    
    public void delete(Integer brandId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/brands/%s", brandId), null, null, null);
    }

    
    public void delete(Integer brandId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/brands/%s", brandId), query, null, null);
    }

    
    public Map<String, Object> createOrUpdateCustomData(Integer brandId, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/brands/%s/custom-data", brandId), null, null, responseModel, model);
    }

    
    public Map<String, Object> createOrUpdateCustomData(Integer brandId, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/brands/%s/custom-data", brandId), query, null, responseModel, model);
    }

    
    public void deleteCustomData(Integer brandId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/brands/%s/custom-data", brandId), null, null, null);
    }

    
    public void deleteCustomData(Integer brandId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/brands/%s/custom-data", brandId), query, null, null);
    }

    
    public Map<String, Object> getCustomData(Integer brandId) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/brands/%s/custom-data", brandId), null, null, responseModel);
    }

    
    public Map<String, Object> getCustomData(Integer brandId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/brands/%s/custom-data", brandId), query, null, responseModel);
    }

    
    public Map<String, Object> createOrUpdateCustomDataForKey(Integer brandId, String key, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/brands/%s/custom-data/%s", brandId, key), null, null, responseModel, model);
    }

    
    public Map<String, Object> createOrUpdateCustomDataForKey(Integer brandId, String key, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/brands/%s/custom-data/%s", brandId, key), query, null, responseModel, model);
    }

    
    public void deleteCustomDataForKey(Integer brandId, String key) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/brands/%s/custom-data/%s", brandId, key), null, null, null);
    }

    
    public void deleteCustomDataForKey(Integer brandId, String key, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/brands/%s/custom-data/%s", brandId, key), query, null, null);
    }

    
    public Map<String, Object> getCustomDataForKey(Integer brandId, String key) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/brands/%s/custom-data/%s", brandId, key), null, null, responseModel);
    }

    
    public Map<String, Object> getCustomDataForKey(Integer brandId, String key, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/brands/%s/custom-data/%s", brandId, key), query, null, responseModel);
    }

}
