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
public class PromotionService extends AbstractService {
    public PromotionService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ApiCollection<Promotion> all() throws ApiErrorException, ConnectionException {
        Class<Promotion> responseModel = (Class<Promotion>)(Class<?>)Promotion.class;

        return this.requestCollection("get", this.resolvePath("/promotions"), null, null, responseModel);
    }

    
    public ApiCollection<Promotion> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Promotion> responseModel = (Class<Promotion>)(Class<?>)Promotion.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/promotions"), query, null, responseModel);
    }

    
    public Promotion create(Promotion model) throws ApiErrorException, ConnectionException {
        Class<Promotion> responseModel = (Class<Promotion>)(Class<?>)Promotion.class;

        return this.request("post", this.resolvePath("/promotions"), null, null, responseModel, model);
    }

    
    public Promotion create(Promotion model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Promotion> responseModel = (Class<Promotion>)(Class<?>)Promotion.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/promotions"), query, null, responseModel, model);
    }

    
    public Promotion get(String promotionId) throws ApiErrorException, ConnectionException {
        Class<Promotion> responseModel = (Class<Promotion>)(Class<?>)Promotion.class;

        return this.request("get", this.resolvePath("/promotions/%s", promotionId), null, null, responseModel);
    }

    
    public Promotion get(String promotionId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Promotion> responseModel = (Class<Promotion>)(Class<?>)Promotion.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/promotions/%s", promotionId), query, null, responseModel);
    }

    
    public void delete(String promotionId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/promotions/%s", promotionId), null, null, null);
    }

    
    public void delete(String promotionId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/promotions/%s", promotionId), query, null, null);
    }

    
    public Promotion update(String promotionId, Promotion model) throws ApiErrorException, ConnectionException {
        Class<Promotion> responseModel = (Class<Promotion>)(Class<?>)Promotion.class;

        return this.request("put", this.resolvePath("/promotions/%s", promotionId), null, null, responseModel, model);
    }

    
    public Promotion update(String promotionId, Promotion model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Promotion> responseModel = (Class<Promotion>)(Class<?>)Promotion.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/promotions/%s", promotionId), query, null, responseModel, model);
    }

}
