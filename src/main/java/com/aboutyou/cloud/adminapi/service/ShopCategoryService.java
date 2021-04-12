package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class ShopCategoryService extends AbstractService {
    public ShopCategoryService(HttpClient httpClient) {
        super(httpClient);
    }

    public ShopCategory create(String shopKey, ShopCategory model) throws ApiErrorException, ConnectionException {
        Class<ShopCategory> responseModel = (Class<ShopCategory>)(Class<?>)ShopCategory.class;

        return this.request("post", this.resolvePath("/shops/%s/categories", shopKey), null, responseModel, model);
    }

    public ShopCategory create(String shopKey, ShopCategory model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategory> responseModel = (Class<ShopCategory>)(Class<?>)ShopCategory.class;

        return this.request("post", this.resolvePath("/shops/%s/categories", shopKey), options, responseModel, model);
    }

    public ApiCollection<ShopCategory> all(String shopKey) throws ApiErrorException, ConnectionException {
        Class<ShopCategory> responseModel = (Class<ShopCategory>)(Class<?>)ShopCategory.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/categories", shopKey), null, responseModel);
    }

    public ApiCollection<ShopCategory> all(String shopKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategory> responseModel = (Class<ShopCategory>)(Class<?>)ShopCategory.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/categories", shopKey), options, responseModel);
    }

    public ShopCategory get(String shopKey, Integer shopCategoryId) throws ApiErrorException, ConnectionException {
        Class<ShopCategory> responseModel = (Class<ShopCategory>)(Class<?>)ShopCategory.class;

        return this.request("get", this.resolvePath("/shops/%s/categories/%s", shopKey, shopCategoryId), null, responseModel);
    }

    public ShopCategory get(String shopKey, Integer shopCategoryId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategory> responseModel = (Class<ShopCategory>)(Class<?>)ShopCategory.class;

        return this.request("get", this.resolvePath("/shops/%s/categories/%s", shopKey, shopCategoryId), options, responseModel);
    }

    public ShopCategory update(String shopKey, Integer shopCategoryId, ShopCategory model) throws ApiErrorException, ConnectionException {
        Class<ShopCategory> responseModel = (Class<ShopCategory>)(Class<?>)ShopCategory.class;

        return this.request("patch", this.resolvePath("/shops/%s/categories/%s", shopKey, shopCategoryId), null, responseModel, model);
    }

    public ShopCategory update(String shopKey, Integer shopCategoryId, ShopCategory model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategory> responseModel = (Class<ShopCategory>)(Class<?>)ShopCategory.class;

        return this.request("patch", this.resolvePath("/shops/%s/categories/%s", shopKey, shopCategoryId), options, responseModel, model);
    }

    public void delete(String shopKey, Integer shopCategoryId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/categories/%s", shopKey, shopCategoryId), null, null);
    }

    public void delete(String shopKey, Integer shopCategoryId, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/categories/%s", shopKey, shopCategoryId), options, null);
    }

    public ShopCategoryProperty updateOrCreateProperty(String shopKey, String countryCode, Integer shopCategoryId, ShopCategoryProperty model) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryProperty> responseModel = (Class<ShopCategoryProperty>)(Class<?>)ShopCategoryProperty.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/categories/%s/properties", shopKey, countryCode, shopCategoryId), null, responseModel, model);
    }

    public ShopCategoryProperty updateOrCreateProperty(String shopKey, String countryCode, Integer shopCategoryId, ShopCategoryProperty model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryProperty> responseModel = (Class<ShopCategoryProperty>)(Class<?>)ShopCategoryProperty.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/categories/%s/properties", shopKey, countryCode, shopCategoryId), options, responseModel, model);
    }

    public void deleteProperty(String shopKey, String countryCode, Integer shopCategoryId, String shopCategoryPropertyKey) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/categories/%s/properties/%s", shopKey, countryCode, shopCategoryId, shopCategoryPropertyKey), null, null);
    }

    public void deleteProperty(String shopKey, String countryCode, Integer shopCategoryId, String shopCategoryPropertyKey, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/categories/%s/properties/%s", shopKey, countryCode, shopCategoryId, shopCategoryPropertyKey), options, null);
    }

    public ShopCategoryProperty getProperty(String shopKey, String countryCode, Integer shopCategoryId, String shopCategoryPropertyKey) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryProperty> responseModel = (Class<ShopCategoryProperty>)(Class<?>)ShopCategoryProperty.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/categories/%s/properties/%s", shopKey, countryCode, shopCategoryId, shopCategoryPropertyKey), null, responseModel);
    }

    public ShopCategoryProperty getProperty(String shopKey, String countryCode, Integer shopCategoryId, String shopCategoryPropertyKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryProperty> responseModel = (Class<ShopCategoryProperty>)(Class<?>)ShopCategoryProperty.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/categories/%s/properties/%s", shopKey, countryCode, shopCategoryId, shopCategoryPropertyKey), options, responseModel);
    }

    public ApiCollection<ShopCategoryProperty> allProperties(String shopKey, String countryCode, Integer shopCategoryId) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryProperty> responseModel = (Class<ShopCategoryProperty>)(Class<?>)ShopCategoryProperty.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/categories/%s/properties", shopKey, countryCode, shopCategoryId), null, responseModel);
    }

    public ApiCollection<ShopCategoryProperty> allProperties(String shopKey, String countryCode, Integer shopCategoryId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryProperty> responseModel = (Class<ShopCategoryProperty>)(Class<?>)ShopCategoryProperty.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/categories/%s/properties", shopKey, countryCode, shopCategoryId), options, responseModel);
    }

    public Map<String, Object> createOrUpdateCustomData(String shopKey, Integer shopCategoryId, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/categories/%s/custom-data", shopKey, shopCategoryId), null, responseModel, model);
    }

    public Map<String, Object> createOrUpdateCustomData(String shopKey, Integer shopCategoryId, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/categories/%s/custom-data", shopKey, shopCategoryId), options, responseModel, model);
    }

    public void deleteCustomData(String shopKey, Integer shopCategoryId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/categories/%s/custom-data", shopKey, shopCategoryId), null, null);
    }

    public void deleteCustomData(String shopKey, Integer shopCategoryId, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/categories/%s/custom-data", shopKey, shopCategoryId), options, null);
    }

    public Map<String, Object> getCustomData(String shopKey, Integer shopCategoryId) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/categories/%s/custom-data", shopKey, shopCategoryId), null, responseModel);
    }

    public Map<String, Object> getCustomData(String shopKey, Integer shopCategoryId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/categories/%s/custom-data", shopKey, shopCategoryId), options, responseModel);
    }

    public Map<String, Object> createOrUpdateCustomDataForKey(String shopKey, Integer shopCategoryId, String key, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/categories/%s/custom-data/%s", shopKey, shopCategoryId, key), null, responseModel, model);
    }

    public Map<String, Object> createOrUpdateCustomDataForKey(String shopKey, Integer shopCategoryId, String key, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/categories/%s/custom-data/%s", shopKey, shopCategoryId, key), options, responseModel, model);
    }

    public void deleteCustomDataForKey(String shopKey, Integer shopCategoryId, String key) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/categories/%s/custom-data/%s", shopKey, shopCategoryId, key), null, null);
    }

    public void deleteCustomDataForKey(String shopKey, Integer shopCategoryId, String key, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/categories/%s/custom-data/%s", shopKey, shopCategoryId, key), options, null);
    }

    public Map<String, Object> getCustomDataForKey(String shopKey, Integer shopCategoryId, String key) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/categories/%s/custom-data/%s", shopKey, shopCategoryId, key), null, responseModel);
    }

    public Map<String, Object> getCustomDataForKey(String shopKey, Integer shopCategoryId, String key, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/categories/%s/custom-data/%s", shopKey, shopCategoryId, key), options, responseModel);
    }

    public Map<String, Object> createOrUpdateCustomDataForCountry(String shopKey, Integer shopCategoryId, String countryCode, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data", shopKey, shopCategoryId, countryCode), null, responseModel, model);
    }

    public Map<String, Object> createOrUpdateCustomDataForCountry(String shopKey, Integer shopCategoryId, String countryCode, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data", shopKey, shopCategoryId, countryCode), options, responseModel, model);
    }

    public void deleteCustomDataForCountry(String shopKey, Integer shopCategoryId, String countryCode) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data", shopKey, shopCategoryId, countryCode), null, null);
    }

    public void deleteCustomDataForCountry(String shopKey, Integer shopCategoryId, String countryCode, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data", shopKey, shopCategoryId, countryCode), options, null);
    }

    public Map<String, Object> getCustomDataForCountry(String shopKey, Integer shopCategoryId, String countryCode) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data", shopKey, shopCategoryId, countryCode), null, responseModel);
    }

    public Map<String, Object> getCustomDataForCountry(String shopKey, Integer shopCategoryId, String countryCode, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data", shopKey, shopCategoryId, countryCode), options, responseModel);
    }

    public Map<String, Object> createOrUpdateCustomDataKeyForCountry(String shopKey, Integer shopCategoryId, String countryCode, String key, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data/%s", shopKey, shopCategoryId, countryCode, key), null, responseModel, model);
    }

    public Map<String, Object> createOrUpdateCustomDataKeyForCountry(String shopKey, Integer shopCategoryId, String countryCode, String key, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data/%s", shopKey, shopCategoryId, countryCode, key), options, responseModel, model);
    }

    public void deleteCustomDataKeyForCountry(String shopKey, Integer shopCategoryId, String countryCode, String key) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data/%s", shopKey, shopCategoryId, countryCode, key), null, null);
    }

    public void deleteCustomDataKeyForCountry(String shopKey, Integer shopCategoryId, String countryCode, String key, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data/%s", shopKey, shopCategoryId, countryCode, key), options, null);
    }

    public Map<String, Object> getCustomDataKeyForCountry(String shopKey, Integer shopCategoryId, String countryCode, String key) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data/%s", shopKey, shopCategoryId, countryCode, key), null, responseModel);
    }

    public Map<String, Object> getCustomDataKeyForCountry(String shopKey, Integer shopCategoryId, String countryCode, String key, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/categories/%s/countries/%s/custom-data/%s", shopKey, shopCategoryId, countryCode, key), options, responseModel);
    }

    public ShopCategoryCountry getCountry(String shopKey, String countryCode, Integer shopCategoryId) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryCountry> responseModel = (Class<ShopCategoryCountry>)(Class<?>)ShopCategoryCountry.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/categories/%s", shopKey, countryCode, shopCategoryId), null, responseModel);
    }

    public ShopCategoryCountry getCountry(String shopKey, String countryCode, Integer shopCategoryId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryCountry> responseModel = (Class<ShopCategoryCountry>)(Class<?>)ShopCategoryCountry.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/categories/%s", shopKey, countryCode, shopCategoryId), options, responseModel);
    }

    public ShopCategoryCountry updateOrCreateCountry(String shopKey, String countryCode, Integer shopCategoryId) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryCountry> responseModel = (Class<ShopCategoryCountry>)(Class<?>)ShopCategoryCountry.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/categories/%s", shopKey, countryCode, shopCategoryId), null, responseModel);
    }

    public ShopCategoryCountry updateOrCreateCountry(String shopKey, String countryCode, Integer shopCategoryId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryCountry> responseModel = (Class<ShopCategoryCountry>)(Class<?>)ShopCategoryCountry.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/categories/%s", shopKey, countryCode, shopCategoryId), options, responseModel);
    }

}