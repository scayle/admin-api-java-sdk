package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class ShopPropertyKeyService extends AbstractService {
    public ShopPropertyKeyService(HttpClient httpClient) {
        super(httpClient);
    }

    public ShopPropertyKey create(ShopPropertyKey model) throws ApiErrorException, ConnectionException {
        Class<ShopPropertyKey> responseModel = (Class<ShopPropertyKey>)(Class<?>)ShopPropertyKey.class;

        return this.request("post", this.resolvePath("/shop-property-keys"), null, responseModel, model);
    }

    public ShopPropertyKey create(ShopPropertyKey model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopPropertyKey> responseModel = (Class<ShopPropertyKey>)(Class<?>)ShopPropertyKey.class;

        return this.request("post", this.resolvePath("/shop-property-keys"), options, responseModel, model);
    }

    public ShopPropertyKey get(String shopPropertyKey) throws ApiErrorException, ConnectionException {
        Class<ShopPropertyKey> responseModel = (Class<ShopPropertyKey>)(Class<?>)ShopPropertyKey.class;

        return this.request("get", this.resolvePath("/shop-property-keys/%s", shopPropertyKey), null, responseModel);
    }

    public ShopPropertyKey get(String shopPropertyKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopPropertyKey> responseModel = (Class<ShopPropertyKey>)(Class<?>)ShopPropertyKey.class;

        return this.request("get", this.resolvePath("/shop-property-keys/%s", shopPropertyKey), options, responseModel);
    }

    public ApiCollection<ShopPropertyKey> all() throws ApiErrorException, ConnectionException {
        Class<ShopPropertyKey> responseModel = (Class<ShopPropertyKey>)(Class<?>)ShopPropertyKey.class;

        return this.requestCollection("get", this.resolvePath("/shop-property-keys"), null, responseModel);
    }

    public ApiCollection<ShopPropertyKey> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopPropertyKey> responseModel = (Class<ShopPropertyKey>)(Class<?>)ShopPropertyKey.class;

        return this.requestCollection("get", this.resolvePath("/shop-property-keys"), options, responseModel);
    }

    public ShopPropertyKey update(String shopPropertyKey, ShopPropertyKey model) throws ApiErrorException, ConnectionException {
        Class<ShopPropertyKey> responseModel = (Class<ShopPropertyKey>)(Class<?>)ShopPropertyKey.class;

        return this.request("put", this.resolvePath("/shop-property-keys/%s", shopPropertyKey), null, responseModel, model);
    }

    public ShopPropertyKey update(String shopPropertyKey, ShopPropertyKey model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopPropertyKey> responseModel = (Class<ShopPropertyKey>)(Class<?>)ShopPropertyKey.class;

        return this.request("put", this.resolvePath("/shop-property-keys/%s", shopPropertyKey), options, responseModel, model);
    }

    public void delete(String shopPropertyKey) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shop-property-keys/%s", shopPropertyKey), null, null);
    }

    public void delete(String shopPropertyKey, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shop-property-keys/%s", shopPropertyKey), options, null);
    }

}