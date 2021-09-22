package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class ShopCountryService extends AbstractService {
    public ShopCountryService(HttpClient httpClient) {
        super(httpClient);
    }

    public ShopCountry create(String shopKey, ShopCountry model) throws ApiErrorException, ConnectionException {
        Class<ShopCountry> responseModel = (Class<ShopCountry>)(Class<?>)ShopCountry.class;

        return this.request("post", this.resolvePath("/shops/%s/countries", shopKey), null, responseModel, model);
    }

    public ShopCountry create(String shopKey, ShopCountry model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCountry> responseModel = (Class<ShopCountry>)(Class<?>)ShopCountry.class;

        return this.request("post", this.resolvePath("/shops/%s/countries", shopKey), options, responseModel, model);
    }

    public ApiCollection<ShopCountry> all(String shopKey) throws ApiErrorException, ConnectionException {
        Class<ShopCountry> responseModel = (Class<ShopCountry>)(Class<?>)ShopCountry.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries", shopKey), null, responseModel);
    }

    public ApiCollection<ShopCountry> all(String shopKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCountry> responseModel = (Class<ShopCountry>)(Class<?>)ShopCountry.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries", shopKey), options, responseModel);
    }

    public ShopCountry get(String shopKey, String countryCode) throws ApiErrorException, ConnectionException {
        Class<ShopCountry> responseModel = (Class<ShopCountry>)(Class<?>)ShopCountry.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s", shopKey, countryCode), null, responseModel);
    }

    public ShopCountry get(String shopKey, String countryCode, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCountry> responseModel = (Class<ShopCountry>)(Class<?>)ShopCountry.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s", shopKey, countryCode), options, responseModel);
    }

    public ShopCountry update(String shopKey, String countryCode, ShopCountry model) throws ApiErrorException, ConnectionException {
        Class<ShopCountry> responseModel = (Class<ShopCountry>)(Class<?>)ShopCountry.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s", shopKey, countryCode), null, responseModel, model);
    }

    public ShopCountry update(String shopKey, String countryCode, ShopCountry model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCountry> responseModel = (Class<ShopCountry>)(Class<?>)ShopCountry.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s", shopKey, countryCode), options, responseModel, model);
    }

    public Assortment updateAssortment(String shopKey, String countryCode, Assortment model) throws ApiErrorException, ConnectionException {
        Class<Assortment> responseModel = (Class<Assortment>)(Class<?>)Assortment.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/assortment", shopKey, countryCode), null, responseModel, model);
    }

    public Assortment updateAssortment(String shopKey, String countryCode, Assortment model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Assortment> responseModel = (Class<Assortment>)(Class<?>)Assortment.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/assortment", shopKey, countryCode), options, responseModel, model);
    }

    public Map<String, Object> createOrUpdateCustomData(String shopKey, String countryCode, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/custom-data", shopKey, countryCode), null, responseModel, model);
    }

    public Map<String, Object> createOrUpdateCustomData(String shopKey, String countryCode, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/custom-data", shopKey, countryCode), options, responseModel, model);
    }

    public void deleteCustomData(String shopKey, String countryCode) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/custom-data", shopKey, countryCode), null, null);
    }

    public void deleteCustomData(String shopKey, String countryCode, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/custom-data", shopKey, countryCode), options, null);
    }

    public Map<String, Object> getCustomData(String shopKey, String countryCode) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/custom-data", shopKey, countryCode), null, responseModel);
    }

    public Map<String, Object> getCustomData(String shopKey, String countryCode, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/custom-data", shopKey, countryCode), options, responseModel);
    }

    public Map<String, Object> createOrUpdateCustomDataForKey(String shopKey, String countryCode, String key, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/custom-data/%s", shopKey, countryCode, key), null, responseModel, model);
    }

    public Map<String, Object> createOrUpdateCustomDataForKey(String shopKey, String countryCode, String key, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/custom-data/%s", shopKey, countryCode, key), options, responseModel, model);
    }

    public void deleteCustomDataForKey(String shopKey, String countryCode, String key) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/custom-data/%s", shopKey, countryCode, key), null, null);
    }

    public void deleteCustomDataForKey(String shopKey, String countryCode, String key, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/custom-data/%s", shopKey, countryCode, key), options, null);
    }

    public Map<String, Object> getCustomDataForKey(String shopKey, String countryCode, String key) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/custom-data/%s", shopKey, countryCode, key), null, responseModel);
    }

    public Map<String, Object> getCustomDataForKey(String shopKey, String countryCode, String key, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/custom-data/%s", shopKey, countryCode, key), options, responseModel);
    }

}