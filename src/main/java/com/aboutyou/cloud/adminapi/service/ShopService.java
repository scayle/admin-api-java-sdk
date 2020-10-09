package com.aboutyou.cloud.adminapi.service;

import java.util.Map;

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

}