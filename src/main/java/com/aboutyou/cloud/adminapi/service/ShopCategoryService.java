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

}