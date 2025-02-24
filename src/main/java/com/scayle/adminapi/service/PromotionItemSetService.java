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
public class PromotionItemSetService extends AbstractService {
    public PromotionItemSetService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public PromotionItemSet create(PromotionItemSet model) throws ApiErrorException, ConnectionException {
        Class<PromotionItemSet> responseModel = (Class<PromotionItemSet>)(Class<?>)PromotionItemSet.class;

        return this.request("post", this.resolvePath("/promotions/item-sets"), null, null, responseModel, model);
    }

    
    public PromotionItemSet create(PromotionItemSet model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<PromotionItemSet> responseModel = (Class<PromotionItemSet>)(Class<?>)PromotionItemSet.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/promotions/item-sets"), query, null, responseModel, model);
    }

    
    public PromotionItemSet get(String id) throws ApiErrorException, ConnectionException {
        Class<PromotionItemSet> responseModel = (Class<PromotionItemSet>)(Class<?>)PromotionItemSet.class;

        return this.request("get", this.resolvePath("/promotions/item-sets/%s", id), null, null, responseModel);
    }

    
    public PromotionItemSet get(String id, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<PromotionItemSet> responseModel = (Class<PromotionItemSet>)(Class<?>)PromotionItemSet.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/promotions/item-sets/%s", id), query, null, responseModel);
    }

    
    public void delete(String promotionItemSetId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/promotions/item-sets/%s", promotionItemSetId), null, null, null);
    }

    
    public void delete(String promotionItemSetId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/promotions/item-sets/%s", promotionItemSetId), query, null, null);
    }

    
    public ApiCollection<PromotionItemSet> all() throws ApiErrorException, ConnectionException {
        Class<PromotionItemSet> responseModel = (Class<PromotionItemSet>)(Class<?>)PromotionItemSet.class;

        return this.requestCollection("get", this.resolvePath("/promotions/item-sets"), null, null, responseModel);
    }

    
    public ApiCollection<PromotionItemSet> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<PromotionItemSet> responseModel = (Class<PromotionItemSet>)(Class<?>)PromotionItemSet.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/promotions/item-sets"), query, null, responseModel);
    }

}
