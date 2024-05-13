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
public class AudienceService extends AbstractService {
    public AudienceService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ApiCollection<Audience> getAudiences() throws ApiErrorException, ConnectionException {
        Class<Audience> responseModel = (Class<Audience>)(Class<?>)Audience.class;

        return this.requestCollection("get", this.resolvePath("/promotions/audiences"), null, null, responseModel);
    }

    
    public ApiCollection<Audience> getAudiences(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Audience> responseModel = (Class<Audience>)(Class<?>)Audience.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/promotions/audiences"), query, null, responseModel);
    }

    
    public Audience createAudience(Audience model) throws ApiErrorException, ConnectionException {
        Class<Audience> responseModel = (Class<Audience>)(Class<?>)Audience.class;

        return this.request("post", this.resolvePath("/promotions/audiences"), null, null, responseModel, model);
    }

    
    public Audience createAudience(Audience model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Audience> responseModel = (Class<Audience>)(Class<?>)Audience.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/promotions/audiences"), query, null, responseModel, model);
    }

    
    public Audience getAudience(String audienceId) throws ApiErrorException, ConnectionException {
        Class<Audience> responseModel = (Class<Audience>)(Class<?>)Audience.class;

        return this.request("get", this.resolvePath("/promotions/audiences/%s", audienceId), null, null, responseModel);
    }

    
    public Audience getAudience(String audienceId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Audience> responseModel = (Class<Audience>)(Class<?>)Audience.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/promotions/audiences/%s", audienceId), query, null, responseModel);
    }

    
    public void deleteAudience(String audienceId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/promotions/audiences/%s", audienceId), null, null, null);
    }

    
    public void deleteAudience(String audienceId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/promotions/audiences/%s", audienceId), query, null, null);
    }

    
    public Audience updateAudience(String audienceId, AudienceUpdateRequest model) throws ApiErrorException, ConnectionException {
        Class<Audience> responseModel = (Class<Audience>)(Class<?>)Audience.class;

        return this.request("put", this.resolvePath("/promotions/audiences/%s", audienceId), null, null, responseModel, model);
    }

    
    public Audience updateAudience(String audienceId, AudienceUpdateRequest model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Audience> responseModel = (Class<Audience>)(Class<?>)Audience.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/promotions/audiences/%s", audienceId), query, null, responseModel, model);
    }

}
