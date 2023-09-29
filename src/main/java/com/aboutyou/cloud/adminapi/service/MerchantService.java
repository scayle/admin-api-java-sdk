package com.aboutyou.cloud.adminapi.service;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class MerchantService extends AbstractService {
    public MerchantService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ApiCollection<Merchant> all() throws ApiErrorException, ConnectionException {
        Class<Merchant> responseModel = (Class<Merchant>)(Class<?>)Merchant.class;

        return this.requestCollection("get", this.resolvePath("/merchants"), null, null, responseModel);
    }

    
    public ApiCollection<Merchant> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Merchant> responseModel = (Class<Merchant>)(Class<?>)Merchant.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/merchants"), query, null, responseModel);
    }

    
    public Merchant get(Identifier merchantIdentifier) throws ApiErrorException, ConnectionException {
        Class<Merchant> responseModel = (Class<Merchant>)(Class<?>)Merchant.class;

        return this.request("get", this.resolvePath("/merchants/%s", merchantIdentifier), null, null, responseModel);
    }

    
    public Merchant get(Identifier merchantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Merchant> responseModel = (Class<Merchant>)(Class<?>)Merchant.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/merchants/%s", merchantIdentifier), query, null, responseModel);
    }

    
    public Merchant create(Merchant model) throws ApiErrorException, ConnectionException {
        Class<Merchant> responseModel = (Class<Merchant>)(Class<?>)Merchant.class;

        return this.request("post", this.resolvePath("/merchants"), null, null, responseModel, model);
    }

    
    public Merchant create(Merchant model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Merchant> responseModel = (Class<Merchant>)(Class<?>)Merchant.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/merchants"), query, null, responseModel, model);
    }

    
    public Merchant update(Identifier merchantIdentifier, Merchant model) throws ApiErrorException, ConnectionException {
        Class<Merchant> responseModel = (Class<Merchant>)(Class<?>)Merchant.class;

        return this.request("put", this.resolvePath("/merchants/%s", merchantIdentifier), null, null, responseModel, model);
    }

    
    public Merchant update(Identifier merchantIdentifier, Merchant model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Merchant> responseModel = (Class<Merchant>)(Class<?>)Merchant.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/merchants/%s", merchantIdentifier), query, null, responseModel, model);
    }

}
