package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class ShopCategoryPropertyKeyService extends AbstractService {
    public ShopCategoryPropertyKeyService(HttpClient httpClient) {
        super(httpClient);
    }

    public ShopCategoryPropertyKey create(ShopCategoryPropertyKey model) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryPropertyKey> responseModel = (Class<ShopCategoryPropertyKey>)(Class<?>)ShopCategoryPropertyKey.class;

        return this.request("post", this.resolvePath("/shop-category-property-keys"), null, responseModel, model);
    }

    public ShopCategoryPropertyKey create(ShopCategoryPropertyKey model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryPropertyKey> responseModel = (Class<ShopCategoryPropertyKey>)(Class<?>)ShopCategoryPropertyKey.class;

        return this.request("post", this.resolvePath("/shop-category-property-keys"), options, responseModel, model);
    }

    public ShopCategoryPropertyKey get(String shopCategoryPropertyKey) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryPropertyKey> responseModel = (Class<ShopCategoryPropertyKey>)(Class<?>)ShopCategoryPropertyKey.class;

        return this.request("get", this.resolvePath("/shop-category-property-keys/%s", shopCategoryPropertyKey), null, responseModel);
    }

    public ShopCategoryPropertyKey get(String shopCategoryPropertyKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryPropertyKey> responseModel = (Class<ShopCategoryPropertyKey>)(Class<?>)ShopCategoryPropertyKey.class;

        return this.request("get", this.resolvePath("/shop-category-property-keys/%s", shopCategoryPropertyKey), options, responseModel);
    }

    public ApiCollection<ShopCategoryPropertyKey> all() throws ApiErrorException, ConnectionException {
        Class<ShopCategoryPropertyKey> responseModel = (Class<ShopCategoryPropertyKey>)(Class<?>)ShopCategoryPropertyKey.class;

        return this.requestCollection("get", this.resolvePath("/shop-category-property-keys"), null, responseModel);
    }

    public ApiCollection<ShopCategoryPropertyKey> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryPropertyKey> responseModel = (Class<ShopCategoryPropertyKey>)(Class<?>)ShopCategoryPropertyKey.class;

        return this.requestCollection("get", this.resolvePath("/shop-category-property-keys"), options, responseModel);
    }

    public ShopCategoryPropertyKey update(String shopCategoryPropertyKey, ShopCategoryPropertyKey model) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryPropertyKey> responseModel = (Class<ShopCategoryPropertyKey>)(Class<?>)ShopCategoryPropertyKey.class;

        return this.request("put", this.resolvePath("/shop-category-property-keys/%s", shopCategoryPropertyKey), null, responseModel, model);
    }

    public ShopCategoryPropertyKey update(String shopCategoryPropertyKey, ShopCategoryPropertyKey model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCategoryPropertyKey> responseModel = (Class<ShopCategoryPropertyKey>)(Class<?>)ShopCategoryPropertyKey.class;

        return this.request("put", this.resolvePath("/shop-category-property-keys/%s", shopCategoryPropertyKey), options, responseModel, model);
    }

    public void delete(String shopCategoryPropertyKey) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shop-category-property-keys/%s", shopCategoryPropertyKey), null, null);
    }

    public void delete(String shopCategoryPropertyKey, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shop-category-property-keys/%s", shopCategoryPropertyKey), options, null);
    }

}