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
public class PromotionCodesService extends AbstractService {
    public PromotionCodesService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public PromotionCodes create(String promotionId, PromotionCodes model) throws ApiErrorException, ConnectionException {
        Class<PromotionCodes> responseModel = (Class<PromotionCodes>)(Class<?>)PromotionCodes.class;

        return this.request("post", this.resolvePath("/promotions/%s/codes", promotionId), null, null, responseModel, model);
    }

    
    public PromotionCodes create(String promotionId, PromotionCodes model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<PromotionCodes> responseModel = (Class<PromotionCodes>)(Class<?>)PromotionCodes.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/promotions/%s/codes", promotionId), query, null, responseModel, model);
    }

    
    public ApiCollection<PromotionCode> all(String promotionId) throws ApiErrorException, ConnectionException {
        Class<PromotionCode> responseModel = (Class<PromotionCode>)(Class<?>)PromotionCode.class;

        return this.requestCollection("get", this.resolvePath("/promotions/%s/codes", promotionId), null, null, responseModel);
    }

    
    public ApiCollection<PromotionCode> all(String promotionId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<PromotionCode> responseModel = (Class<PromotionCode>)(Class<?>)PromotionCode.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/promotions/%s/codes", promotionId), query, null, responseModel);
    }

    
    public void delete(String promotionId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/promotions/%s/codes", promotionId), null, null, null);
    }

    
    public void delete(String promotionId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/promotions/%s/codes", promotionId), query, null, null);
    }

}
