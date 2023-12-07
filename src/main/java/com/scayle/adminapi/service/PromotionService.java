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

    
    public Promotion create(Promotion model) throws ApiErrorException, ConnectionException {
        Class<Promotion> responseModel = (Class<Promotion>)(Class<?>)Promotion.class;

        return this.request("post", this.resolvePath("/promotions"), null, null, responseModel, model);
    }

    
    public Promotion create(Promotion model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Promotion> responseModel = (Class<Promotion>)(Class<?>)Promotion.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/promotions"), query, null, responseModel, model);
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
