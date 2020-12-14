package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class BrandService extends AbstractService {
    public BrandService(HttpClient httpClient) {
        super(httpClient);
    }

    public ApiCollection<Brand> all() throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.requestCollection("get", this.resolvePath("/brands"), null, responseModel);
    }

    public ApiCollection<Brand> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.requestCollection("get", this.resolvePath("/brands"), options, responseModel);
    }

    public Brand get(Integer brandId) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.request("get", this.resolvePath("/brands/%s", brandId), null, responseModel);
    }

    public Brand get(Integer brandId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.request("get", this.resolvePath("/brands/%s", brandId), options, responseModel);
    }

    public Brand create(Brand model) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.request("post", this.resolvePath("/brands"), null, responseModel, model);
    }

    public Brand create(Brand model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.request("post", this.resolvePath("/brands"), options, responseModel, model);
    }

    public Brand update(Integer brandId, Brand model) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.request("put", this.resolvePath("/brands/%s", brandId), null, responseModel, model);
    }

    public Brand update(Integer brandId, Brand model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Brand> responseModel = (Class<Brand>)(Class<?>)Brand.class;

        return this.request("put", this.resolvePath("/brands/%s", brandId), options, responseModel, model);
    }

    public void delete(Integer brandId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/brands/%s", brandId), null, null);
    }

    public void delete(Integer brandId, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/brands/%s", brandId), options, null);
    }

}