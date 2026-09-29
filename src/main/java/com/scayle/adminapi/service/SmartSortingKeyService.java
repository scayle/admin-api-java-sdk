package com.scayle.adminapi.service;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import com.scayle.adminapi.exception.ApiErrorException;
import com.scayle.adminapi.exception.ConnectionException;
import com.scayle.adminapi.http.HttpClient;
import com.scayle.adminapi.model.*;

@SuppressWarnings("unchecked")
public class SmartSortingKeyService extends AbstractService {
    public SmartSortingKeyService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public SmartSortingKey create(SmartSortingKey model) throws ApiErrorException, ConnectionException {
        Class<SmartSortingKey> responseModel = (Class<SmartSortingKey>)(Class<?>)SmartSortingKey.class;

        return this.request("post", this.resolvePath("/smart-sorting-keys"), null, null, responseModel, model);
    }

    
    public SmartSortingKey create(SmartSortingKey model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<SmartSortingKey> responseModel = (Class<SmartSortingKey>)(Class<?>)SmartSortingKey.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/smart-sorting-keys"), query, null, responseModel, model);
    }

    
    public SmartSortingKey get(String sortingKeyIdentifier) throws ApiErrorException, ConnectionException {
        Class<SmartSortingKey> responseModel = (Class<SmartSortingKey>)(Class<?>)SmartSortingKey.class;

        return this.request("get", this.resolvePath("/smart-sorting-keys/%s", sortingKeyIdentifier), null, null, responseModel);
    }

    
    public SmartSortingKey get(String sortingKeyIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<SmartSortingKey> responseModel = (Class<SmartSortingKey>)(Class<?>)SmartSortingKey.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/smart-sorting-keys/%s", sortingKeyIdentifier), query, null, responseModel);
    }

    
    public ApiCollection<SmartSortingKey> all() throws ApiErrorException, ConnectionException {
        Class<SmartSortingKey> responseModel = (Class<SmartSortingKey>)(Class<?>)SmartSortingKey.class;

        return this.requestCollection("get", this.resolvePath("/smart-sorting-keys"), null, null, responseModel);
    }

    
    public ApiCollection<SmartSortingKey> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<SmartSortingKey> responseModel = (Class<SmartSortingKey>)(Class<?>)SmartSortingKey.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/smart-sorting-keys"), query, null, responseModel);
    }

    
    public SmartSortingKey update(String sortingKeyIdentifier, SmartSortingKey model) throws ApiErrorException, ConnectionException {
        Class<SmartSortingKey> responseModel = (Class<SmartSortingKey>)(Class<?>)SmartSortingKey.class;

        return this.request("put", this.resolvePath("/smart-sorting-keys/%s", sortingKeyIdentifier), null, null, responseModel, model);
    }

    
    public SmartSortingKey update(String sortingKeyIdentifier, SmartSortingKey model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<SmartSortingKey> responseModel = (Class<SmartSortingKey>)(Class<?>)SmartSortingKey.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/smart-sorting-keys/%s", sortingKeyIdentifier), query, null, responseModel, model);
    }

    
    public void delete(String sortingKeyIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/smart-sorting-keys/%s", sortingKeyIdentifier), null, null, null);
    }

    
    public void delete(String sortingKeyIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/smart-sorting-keys/%s", sortingKeyIdentifier), query, null, null);
    }

}
