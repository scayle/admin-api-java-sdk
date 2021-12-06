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
public class CompanyService extends AbstractService {
    public CompanyService(HttpClient httpClient) {
        super(httpClient);
    }

    public Company create(Company model) throws ApiErrorException, ConnectionException {
        Class<Company> responseModel = (Class<Company>)(Class<?>)Company.class;

        return this.request("post", this.resolvePath("/companies"), null, null, responseModel, model);
    }

    public Company create(Company model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Company> responseModel = (Class<Company>)(Class<?>)Company.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/companies"), query, null, responseModel, model);
    }

    public ApiCollection<Company> all() throws ApiErrorException, ConnectionException {
        Class<Company> responseModel = (Class<Company>)(Class<?>)Company.class;

        return this.requestCollection("get", this.resolvePath("/companies"), null, null, responseModel);
    }

    public ApiCollection<Company> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Company> responseModel = (Class<Company>)(Class<?>)Company.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/companies"), query, null, responseModel);
    }

    public Company get(Integer companyId) throws ApiErrorException, ConnectionException {
        Class<Company> responseModel = (Class<Company>)(Class<?>)Company.class;

        return this.request("get", this.resolvePath("/companies/%s", companyId), null, null, responseModel);
    }

    public Company get(Integer companyId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Company> responseModel = (Class<Company>)(Class<?>)Company.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/companies/%s", companyId), query, null, responseModel);
    }

    public Company update(Integer companyId, Company model) throws ApiErrorException, ConnectionException {
        Class<Company> responseModel = (Class<Company>)(Class<?>)Company.class;

        return this.request("put", this.resolvePath("/companies/%s", companyId), null, null, responseModel, model);
    }

    public Company update(Integer companyId, Company model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Company> responseModel = (Class<Company>)(Class<?>)Company.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/companies/%s", companyId), query, null, responseModel, model);
    }

}
