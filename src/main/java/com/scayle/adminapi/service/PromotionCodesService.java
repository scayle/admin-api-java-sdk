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

}
