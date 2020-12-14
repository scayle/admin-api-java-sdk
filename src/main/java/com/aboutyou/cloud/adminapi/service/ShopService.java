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

    public Assortment updateAssortment(String shopKey, Assortment model) throws ApiErrorException, ConnectionException {
        Class<Assortment> responseModel = (Class<Assortment>)(Class<?>)Assortment.class;

        return this.request("put", this.resolvePath("/shops/%s/assortment", shopKey), null, responseModel, model);
    }

    public Assortment updateAssortment(String shopKey, Assortment model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Assortment> responseModel = (Class<Assortment>)(Class<?>)Assortment.class;

        return this.request("put", this.resolvePath("/shops/%s/assortment", shopKey), options, responseModel, model);
    }

    public ShopProperty updateOrCreateProperty(String shopKey, ShopProperty model) throws ApiErrorException, ConnectionException {
        Class<ShopProperty> responseModel = (Class<ShopProperty>)(Class<?>)ShopProperty.class;

        return this.request("post", this.resolvePath("/shops/%s/properties", shopKey), null, responseModel, model);
    }

    public ShopProperty updateOrCreateProperty(String shopKey, ShopProperty model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopProperty> responseModel = (Class<ShopProperty>)(Class<?>)ShopProperty.class;

        return this.request("post", this.resolvePath("/shops/%s/properties", shopKey), options, responseModel, model);
    }

    public void deleteProperty(String shopKey, String shopPropertyKey) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/properties/%s", shopKey, shopPropertyKey), null, null);
    }

    public void deleteProperty(String shopKey, String shopPropertyKey, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/properties/%s", shopKey, shopPropertyKey), options, null);
    }

    public ApiCollection<ShopProperty> allProperties(String shopKey) throws ApiErrorException, ConnectionException {
        Class<ShopProperty> responseModel = (Class<ShopProperty>)(Class<?>)ShopProperty.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/properties", shopKey), null, responseModel);
    }

    public ApiCollection<ShopProperty> allProperties(String shopKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopProperty> responseModel = (Class<ShopProperty>)(Class<?>)ShopProperty.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/properties", shopKey), options, responseModel);
    }

}