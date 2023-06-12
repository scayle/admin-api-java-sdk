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
public class CustomDataConfigService extends AbstractService {
    public CustomDataConfigService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public CustomDataConfig get(String entity) throws ApiErrorException, ConnectionException {
        Class<CustomDataConfig> responseModel = (Class<CustomDataConfig>)(Class<?>)CustomDataConfig.class;

        return this.request("get", this.resolvePath("/custom-data-configs/%s", entity), null, null, responseModel);
    }

    
    public CustomDataConfig get(String entity, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomDataConfig> responseModel = (Class<CustomDataConfig>)(Class<?>)CustomDataConfig.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/custom-data-configs/%s", entity), query, null, responseModel);
    }

    
    public CustomDataConfig create(String entity, CustomDataConfig model) throws ApiErrorException, ConnectionException {
        Class<CustomDataConfig> responseModel = (Class<CustomDataConfig>)(Class<?>)CustomDataConfig.class;

        return this.request("post", this.resolvePath("/custom-data-configs/%s", entity), null, null, responseModel, model);
    }

    
    public CustomDataConfig create(String entity, CustomDataConfig model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomDataConfig> responseModel = (Class<CustomDataConfig>)(Class<?>)CustomDataConfig.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/custom-data-configs/%s", entity), query, null, responseModel, model);
    }

    
    public CustomDataConfig update(String entity, CustomDataConfig model) throws ApiErrorException, ConnectionException {
        Class<CustomDataConfig> responseModel = (Class<CustomDataConfig>)(Class<?>)CustomDataConfig.class;

        return this.request("put", this.resolvePath("/custom-data-configs/%s", entity), null, null, responseModel, model);
    }

    
    public CustomDataConfig update(String entity, CustomDataConfig model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomDataConfig> responseModel = (Class<CustomDataConfig>)(Class<?>)CustomDataConfig.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/custom-data-configs/%s", entity), query, null, responseModel, model);
    }

    
    public void delete(String entity) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/custom-data-configs/%s", entity), null, null, null);
    }

    
    public void delete(String entity, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/custom-data-configs/%s", entity), query, null, null);
    }

}
