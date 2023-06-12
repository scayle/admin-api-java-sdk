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
public class MasterCategoryService extends AbstractService {
    public MasterCategoryService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ApiCollection<MasterCategory> all() throws ApiErrorException, ConnectionException {
        Class<MasterCategory> responseModel = (Class<MasterCategory>)(Class<?>)MasterCategory.class;

        return this.requestCollection("get", this.resolvePath("/master-categories"), null, null, responseModel);
    }

    
    public ApiCollection<MasterCategory> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<MasterCategory> responseModel = (Class<MasterCategory>)(Class<?>)MasterCategory.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/master-categories"), query, null, responseModel);
    }

    
    public MasterCategory get(Integer masterCategoryId) throws ApiErrorException, ConnectionException {
        Class<MasterCategory> responseModel = (Class<MasterCategory>)(Class<?>)MasterCategory.class;

        return this.request("get", this.resolvePath("/master-categories/%s", masterCategoryId), null, null, responseModel);
    }

    
    public MasterCategory get(Integer masterCategoryId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<MasterCategory> responseModel = (Class<MasterCategory>)(Class<?>)MasterCategory.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/master-categories/%s", masterCategoryId), query, null, responseModel);
    }

    
    public MasterCategory create(MasterCategory model) throws ApiErrorException, ConnectionException {
        Class<MasterCategory> responseModel = (Class<MasterCategory>)(Class<?>)MasterCategory.class;

        return this.request("post", this.resolvePath("/master-categories"), null, null, responseModel, model);
    }

    
    public MasterCategory create(MasterCategory model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<MasterCategory> responseModel = (Class<MasterCategory>)(Class<?>)MasterCategory.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/master-categories"), query, null, responseModel, model);
    }

    
    public MasterCategory update(Integer masterCategoryId, MasterCategory model) throws ApiErrorException, ConnectionException {
        Class<MasterCategory> responseModel = (Class<MasterCategory>)(Class<?>)MasterCategory.class;

        return this.request("put", this.resolvePath("/master-categories/%s", masterCategoryId), null, null, responseModel, model);
    }

    
    public MasterCategory update(Integer masterCategoryId, MasterCategory model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<MasterCategory> responseModel = (Class<MasterCategory>)(Class<?>)MasterCategory.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/master-categories/%s", masterCategoryId), query, null, responseModel, model);
    }

    
    public void delete(Integer masterCategoryId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/master-categories/%s", masterCategoryId), null, null, null);
    }

    
    public void delete(Integer masterCategoryId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/master-categories/%s", masterCategoryId), query, null, null);
    }

}
