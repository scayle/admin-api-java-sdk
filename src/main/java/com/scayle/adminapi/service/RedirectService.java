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
public class RedirectService extends AbstractService {
    public RedirectService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ApiCollection<Redirect> all(String shopKey) throws ApiErrorException, ConnectionException {
        Class<Redirect> responseModel = (Class<Redirect>)(Class<?>)Redirect.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/redirects", shopKey), null, null, responseModel);
    }

    
    public ApiCollection<Redirect> all(String shopKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Redirect> responseModel = (Class<Redirect>)(Class<?>)Redirect.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/shops/%s/redirects", shopKey), query, null, responseModel);
    }

    
    public ApiCollection<Redirect> createOrUpdateBulk(String shopKey, List<Redirect> model) throws ApiErrorException, ConnectionException {
        Class<Redirect> responseModel = (Class<Redirect>)(Class<?>)Redirect.class;

        return this.requestCollection("put", this.resolvePath("/shops/%s/redirects/bulk", shopKey), null, null, responseModel, model);
    }

    
    public ApiCollection<Redirect> createOrUpdateBulk(String shopKey, List<Redirect> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Redirect> responseModel = (Class<Redirect>)(Class<?>)Redirect.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("put", this.resolvePath("/shops/%s/redirects/bulk", shopKey), query, null, responseModel, model);
    }

    
    public void deleteBulk(String shopKey, List<Redirect> model) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/redirects/bulk", shopKey), null, null, null, model);
    }

    
    public void deleteBulk(String shopKey, List<Redirect> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/redirects/bulk", shopKey), query, null, null, model);
    }

    
    public void delete(String shopKey, Integer redirectId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/redirects/%s", shopKey, redirectId), null, null, null);
    }

    
    public void delete(String shopKey, Integer redirectId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/redirects/%s", shopKey, redirectId), query, null, null);
    }

    
    public Redirect create(String shopKey, Redirect model) throws ApiErrorException, ConnectionException {
        Class<Redirect> responseModel = (Class<Redirect>)(Class<?>)Redirect.class;

        return this.request("post", this.resolvePath("/shops/%s/redirects", shopKey), null, null, responseModel, model);
    }

    
    public Redirect create(String shopKey, Redirect model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Redirect> responseModel = (Class<Redirect>)(Class<?>)Redirect.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/shops/%s/redirects", shopKey), query, null, responseModel, model);
    }

    
    public Redirect update(String shopKey, Integer redirectId, Redirect model) throws ApiErrorException, ConnectionException {
        Class<Redirect> responseModel = (Class<Redirect>)(Class<?>)Redirect.class;

        return this.request("put", this.resolvePath("/shops/%s/redirects/%s", shopKey, redirectId), null, null, responseModel, model);
    }

    
    public Redirect update(String shopKey, Integer redirectId, Redirect model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Redirect> responseModel = (Class<Redirect>)(Class<?>)Redirect.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/shops/%s/redirects/%s", shopKey, redirectId), query, null, responseModel, model);
    }

}
