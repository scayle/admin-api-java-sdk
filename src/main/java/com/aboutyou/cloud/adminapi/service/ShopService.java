package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class ShopService extends AbstractService {
    public ShopService(HttpClient httpClient) {
        super(httpClient);
    }

    public Shop create(Shop model) throws ApiErrorException, ConnectionException {
        Class<Shop> responseModel = (Class<Shop>)(Class<?>)Shop.class;

        return this.request("post", this.resolvePath("/shops"), null, responseModel, model);
    }

    public Shop create(Shop model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Shop> responseModel = (Class<Shop>)(Class<?>)Shop.class;

        return this.request("post", this.resolvePath("/shops"), options, responseModel, model);
    }

    public ApiCollection<Shop> all() throws ApiErrorException, ConnectionException {
        Class<Shop> responseModel = (Class<Shop>)(Class<?>)Shop.class;

        return this.requestCollection("get", this.resolvePath("/shops"), null, responseModel);
    }

    public ApiCollection<Shop> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Shop> responseModel = (Class<Shop>)(Class<?>)Shop.class;

        return this.requestCollection("get", this.resolvePath("/shops"), options, responseModel);
    }

    public Shop get(String shopKey) throws ApiErrorException, ConnectionException {
        Class<Shop> responseModel = (Class<Shop>)(Class<?>)Shop.class;

        return this.request("get", this.resolvePath("/shops/%s", shopKey), null, responseModel);
    }

    public Shop get(String shopKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Shop> responseModel = (Class<Shop>)(Class<?>)Shop.class;

        return this.request("get", this.resolvePath("/shops/%s", shopKey), options, responseModel);
    }

    public Shop update(String shopKey, Shop model) throws ApiErrorException, ConnectionException {
        Class<Shop> responseModel = (Class<Shop>)(Class<?>)Shop.class;

        return this.request("put", this.resolvePath("/shops/%s", shopKey), null, responseModel, model);
    }

    public Shop update(String shopKey, Shop model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Shop> responseModel = (Class<Shop>)(Class<?>)Shop.class;

        return this.request("put", this.resolvePath("/shops/%s", shopKey), options, responseModel, model);
    }

    public Map<String, Object> createOrUpdateCustomData(String shopKey, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/custom-data", shopKey), null, responseModel, model);
    }

    public Map<String, Object> createOrUpdateCustomData(String shopKey, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/custom-data", shopKey), options, responseModel, model);
    }

    public void deleteCustomData(String shopKey) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/custom-data", shopKey), null, null);
    }

    public void deleteCustomData(String shopKey, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/custom-data", shopKey), options, null);
    }

    public Map<String, Object> getCustomData(String shopKey) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/custom-data", shopKey), null, responseModel);
    }

    public Map<String, Object> getCustomData(String shopKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/custom-data", shopKey), options, responseModel);
    }

    public Map<String, Object> createOrUpdateCustomDataForKey(String shopKey, String key, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/custom-data/%s", shopKey, key), null, responseModel, model);
    }

    public Map<String, Object> createOrUpdateCustomDataForKey(String shopKey, String key, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/custom-data/%s", shopKey, key), options, responseModel, model);
    }

    public void deleteCustomDataForKey(String shopKey, String key) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/custom-data/%s", shopKey, key), null, null);
    }

    public void deleteCustomDataForKey(String shopKey, String key, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/custom-data/%s", shopKey, key), options, null);
    }

    public Map<String, Object> getCustomDataForKey(String shopKey, String key) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/custom-data/%s", shopKey, key), null, responseModel);
    }

    public Map<String, Object> getCustomDataForKey(String shopKey, String key, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/custom-data/%s", shopKey, key), options, responseModel);
    }

}