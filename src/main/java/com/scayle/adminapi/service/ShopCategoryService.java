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
public class ShopCategoryService extends AbstractService {
    public ShopCategoryService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ShopCategory create(String shopKey, ShopCategory model) throws ApiErrorException, ConnectionException {
        Class<ShopCategory> responseModel = (Class<ShopCategory>)(Class<?>)ShopCategory.class;

        return this.request("post", this.resolvePath("/shops/%s/categories", shopKey), null, null, responseModel, model);
    }

    
    public ShopCategory create(String shopKey, ShopCategory model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategory> responseModel = (Class<ShopCategory>)(Class<?>)ShopCategory.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/shops/%s/categories", shopKey), query, null, responseModel, model);
    }

    
    public ApiCollection<ShopCategory> all(String shopKey) throws ApiErrorException, ConnectionException {
        Class<ShopCategory> responseModel = (Class<ShopCategory>)(Class<?>)ShopCategory.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/categories", shopKey), null, null, responseModel);
    }

    
    public ApiCollection<ShopCategory> all(String shopKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategory> responseModel = (Class<ShopCategory>)(Class<?>)ShopCategory.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/shops/%s/categories", shopKey), query, null, responseModel);
    }

    
    public ShopCategory get(String shopKey, Integer shopCategoryId) throws ApiErrorException, ConnectionException {
        Class<ShopCategory> responseModel = (Class<ShopCategory>)(Class<?>)ShopCategory.class;

        return this.request("get", this.resolvePath("/shops/%s/categories/%s", shopKey, shopCategoryId), null, null, responseModel);
    }

    
    public ShopCategory get(String shopKey, Integer shopCategoryId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategory> responseModel = (Class<ShopCategory>)(Class<?>)ShopCategory.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/shops/%s/categories/%s", shopKey, shopCategoryId), query, null, responseModel);
    }

    
    public ShopCategory update(String shopKey, Integer shopCategoryId, ShopCategory model) throws ApiErrorException, ConnectionException {
        Class<ShopCategory> responseModel = (Class<ShopCategory>)(Class<?>)ShopCategory.class;

        return this.request("patch", this.resolvePath("/shops/%s/categories/%s", shopKey, shopCategoryId), null, null, responseModel, model);
    }

    
    public ShopCategory update(String shopKey, Integer shopCategoryId, ShopCategory model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategory> responseModel = (Class<ShopCategory>)(Class<?>)ShopCategory.class;

        Map<String, Object> query = options.all();

        return this.request("patch", this.resolvePath("/shops/%s/categories/%s", shopKey, shopCategoryId), query, null, responseModel, model);
    }

    
    public void delete(String shopKey, Integer shopCategoryId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/categories/%s", shopKey, shopCategoryId), null, null, null);
    }

    
    public void delete(String shopKey, Integer shopCategoryId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/categories/%s", shopKey, shopCategoryId), query, null, null);
    }

    
    public ShopCategoryProperty updateOrCreateProperty(String shopKey, String countryCode, Integer shopCategoryId, ShopCategoryProperty model) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryProperty> responseModel = (Class<ShopCategoryProperty>)(Class<?>)ShopCategoryProperty.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/categories/%s/properties", shopKey, countryCode, shopCategoryId), null, null, responseModel, model);
    }

    
    public ShopCategoryProperty updateOrCreateProperty(String shopKey, String countryCode, Integer shopCategoryId, ShopCategoryProperty model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryProperty> responseModel = (Class<ShopCategoryProperty>)(Class<?>)ShopCategoryProperty.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/categories/%s/properties", shopKey, countryCode, shopCategoryId), query, null, responseModel, model);
    }

    
    public void deleteProperty(String shopKey, String countryCode, Integer shopCategoryId, String shopCategoryPropertyKey) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/categories/%s/properties/%s", shopKey, countryCode, shopCategoryId, shopCategoryPropertyKey), null, null, null);
    }

    
    public void deleteProperty(String shopKey, String countryCode, Integer shopCategoryId, String shopCategoryPropertyKey, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/categories/%s/properties/%s", shopKey, countryCode, shopCategoryId, shopCategoryPropertyKey), query, null, null);
    }

    
    public ShopCategoryProperty getProperty(String shopKey, String countryCode, Integer shopCategoryId, String shopCategoryPropertyKey) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryProperty> responseModel = (Class<ShopCategoryProperty>)(Class<?>)ShopCategoryProperty.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/categories/%s/properties/%s", shopKey, countryCode, shopCategoryId, shopCategoryPropertyKey), null, null, responseModel);
    }

    
    public ShopCategoryProperty getProperty(String shopKey, String countryCode, Integer shopCategoryId, String shopCategoryPropertyKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryProperty> responseModel = (Class<ShopCategoryProperty>)(Class<?>)ShopCategoryProperty.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/categories/%s/properties/%s", shopKey, countryCode, shopCategoryId, shopCategoryPropertyKey), query, null, responseModel);
    }

    
    public ApiCollection<ShopCategoryProperty> allProperties(String shopKey, String countryCode, Integer shopCategoryId) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryProperty> responseModel = (Class<ShopCategoryProperty>)(Class<?>)ShopCategoryProperty.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/categories/%s/properties", shopKey, countryCode, shopCategoryId), null, null, responseModel);
    }

    
    public ApiCollection<ShopCategoryProperty> allProperties(String shopKey, String countryCode, Integer shopCategoryId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryProperty> responseModel = (Class<ShopCategoryProperty>)(Class<?>)ShopCategoryProperty.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/categories/%s/properties", shopKey, countryCode, shopCategoryId), query, null, responseModel);
    }

    
    public Map<String, Object> createOrUpdateCustomData(String shopKey, Integer shopCategoryId, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/categories/%s/custom-data", shopKey, shopCategoryId), null, null, responseModel, model);
    }

    
    public Map<String, Object> createOrUpdateCustomData(String shopKey, Integer shopCategoryId, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/shops/%s/categories/%s/custom-data", shopKey, shopCategoryId), query, null, responseModel, model);
    }

    
    public void deleteCustomData(String shopKey, Integer shopCategoryId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/categories/%s/custom-data", shopKey, shopCategoryId), null, null, null);
    }

    
    public void deleteCustomData(String shopKey, Integer shopCategoryId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/categories/%s/custom-data", shopKey, shopCategoryId), query, null, null);
    }

    
    public Map<String, Object> getCustomData(String shopKey, Integer shopCategoryId) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/categories/%s/custom-data", shopKey, shopCategoryId), null, null, responseModel);
    }

    
    public Map<String, Object> getCustomData(String shopKey, Integer shopCategoryId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/shops/%s/categories/%s/custom-data", shopKey, shopCategoryId), query, null, responseModel);
    }

    
    public Map<String, Object> createOrUpdateCustomDataForKey(String shopKey, Integer shopCategoryId, String key, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/categories/%s/custom-data/%s", shopKey, shopCategoryId, key), null, null, responseModel, model);
    }

    
    public Map<String, Object> createOrUpdateCustomDataForKey(String shopKey, Integer shopCategoryId, String key, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/shops/%s/categories/%s/custom-data/%s", shopKey, shopCategoryId, key), query, null, responseModel, model);
    }

    
    public void deleteCustomDataForKey(String shopKey, Integer shopCategoryId, String key) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/categories/%s/custom-data/%s", shopKey, shopCategoryId, key), null, null, null);
    }

    
    public void deleteCustomDataForKey(String shopKey, Integer shopCategoryId, String key, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/categories/%s/custom-data/%s", shopKey, shopCategoryId, key), query, null, null);
    }

    
    public Map<String, Object> getCustomDataForKey(String shopKey, Integer shopCategoryId, String key) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/categories/%s/custom-data/%s", shopKey, shopCategoryId, key), null, null, responseModel);
    }

    
    public Map<String, Object> getCustomDataForKey(String shopKey, Integer shopCategoryId, String key, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/shops/%s/categories/%s/custom-data/%s", shopKey, shopCategoryId, key), query, null, responseModel);
    }

    
    public Map<String, Object> createOrUpdateCustomDataForCountry(String shopKey, Integer shopCategoryId, String countryCode, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data", shopKey, shopCategoryId, countryCode), null, null, responseModel, model);
    }

    
    public Map<String, Object> createOrUpdateCustomDataForCountry(String shopKey, Integer shopCategoryId, String countryCode, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data", shopKey, shopCategoryId, countryCode), query, null, responseModel, model);
    }

    
    public void deleteCustomDataForCountry(String shopKey, Integer shopCategoryId, String countryCode) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data", shopKey, shopCategoryId, countryCode), null, null, null);
    }

    
    public void deleteCustomDataForCountry(String shopKey, Integer shopCategoryId, String countryCode, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data", shopKey, shopCategoryId, countryCode), query, null, null);
    }

    
    public Map<String, Object> getCustomDataForCountry(String shopKey, Integer shopCategoryId, String countryCode) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data", shopKey, shopCategoryId, countryCode), null, null, responseModel);
    }

    
    public Map<String, Object> getCustomDataForCountry(String shopKey, Integer shopCategoryId, String countryCode, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data", shopKey, shopCategoryId, countryCode), query, null, responseModel);
    }

    
    public Map<String, Object> createOrUpdateCustomDataKeyForCountry(String shopKey, Integer shopCategoryId, String countryCode, String key, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data/%s", shopKey, shopCategoryId, countryCode, key), null, null, responseModel, model);
    }

    
    public Map<String, Object> createOrUpdateCustomDataKeyForCountry(String shopKey, Integer shopCategoryId, String countryCode, String key, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data/%s", shopKey, shopCategoryId, countryCode, key), query, null, responseModel, model);
    }

    
    public void deleteCustomDataKeyForCountry(String shopKey, Integer shopCategoryId, String countryCode, String key) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data/%s", shopKey, shopCategoryId, countryCode, key), null, null, null);
    }

    
    public void deleteCustomDataKeyForCountry(String shopKey, Integer shopCategoryId, String countryCode, String key, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data/%s", shopKey, shopCategoryId, countryCode, key), query, null, null);
    }

    
    public Map<String, Object> getCustomDataKeyForCountry(String shopKey, Integer shopCategoryId, String countryCode, String key) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data/%s", shopKey, shopCategoryId, countryCode, key), null, null, responseModel);
    }

    
    public Map<String, Object> getCustomDataKeyForCountry(String shopKey, Integer shopCategoryId, String countryCode, String key, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data/%s", shopKey, shopCategoryId, countryCode, key), query, null, responseModel);
    }

    
    public ShopCategoryCountry getCountry(String shopKey, String countryCode, Integer shopCategoryId) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryCountry> responseModel = (Class<ShopCategoryCountry>)(Class<?>)ShopCategoryCountry.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/categories/%s", shopKey, countryCode, shopCategoryId), null, null, responseModel);
    }

    
    public ShopCategoryCountry getCountry(String shopKey, String countryCode, Integer shopCategoryId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryCountry> responseModel = (Class<ShopCategoryCountry>)(Class<?>)ShopCategoryCountry.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/categories/%s", shopKey, countryCode, shopCategoryId), query, null, responseModel);
    }

    
    public ShopCategoryCountry updateOrCreateCountry(String shopKey, String countryCode, Integer shopCategoryId, ShopCategoryCountry model) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryCountry> responseModel = (Class<ShopCategoryCountry>)(Class<?>)ShopCategoryCountry.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/categories/%s", shopKey, countryCode, shopCategoryId), null, null, responseModel, model);
    }

    
    public ShopCategoryCountry updateOrCreateCountry(String shopKey, String countryCode, Integer shopCategoryId, ShopCategoryCountry model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryCountry> responseModel = (Class<ShopCategoryCountry>)(Class<?>)ShopCategoryCountry.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/categories/%s", shopKey, countryCode, shopCategoryId), query, null, responseModel, model);
    }

}
