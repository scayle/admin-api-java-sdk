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

    public ShopProperty updateOrCreateProperty(String shopKey, String countryCode, ShopProperty model) throws ApiErrorException, ConnectionException {
        Class<ShopProperty> responseModel = (Class<ShopProperty>)(Class<?>)ShopProperty.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/properties", shopKey, countryCode), null, responseModel, model);
    }

    public ShopProperty updateOrCreateProperty(String shopKey, String countryCode, ShopProperty model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopProperty> responseModel = (Class<ShopProperty>)(Class<?>)ShopProperty.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/properties", shopKey, countryCode), options, responseModel, model);
    }

    public void deleteProperty(String shopKey, String countryCode, String shopPropertyKey) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/properties/%s", shopKey, countryCode, shopPropertyKey), null, null);
    }

    public void deleteProperty(String shopKey, String countryCode, String shopPropertyKey, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/properties/%s", shopKey, countryCode, shopPropertyKey), options, null);
    }

    public ShopProperty getProperty(String shopKey, String countryCode, String shopPropertyKey) throws ApiErrorException, ConnectionException {
        Class<ShopProperty> responseModel = (Class<ShopProperty>)(Class<?>)ShopProperty.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/properties/%s", shopKey, countryCode, shopPropertyKey), null, responseModel);
    }

    public ShopProperty getProperty(String shopKey, String countryCode, String shopPropertyKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopProperty> responseModel = (Class<ShopProperty>)(Class<?>)ShopProperty.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/properties/%s", shopKey, countryCode, shopPropertyKey), options, responseModel);
    }

    public ApiCollection<ShopProperty> allProperties(String shopKey, String countryCode) throws ApiErrorException, ConnectionException {
        Class<ShopProperty> responseModel = (Class<ShopProperty>)(Class<?>)ShopProperty.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/properties", shopKey, countryCode), null, responseModel);
    }

    public ApiCollection<ShopProperty> allProperties(String shopKey, String countryCode, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopProperty> responseModel = (Class<ShopProperty>)(Class<?>)ShopProperty.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/properties", shopKey, countryCode), options, responseModel);
    }

}