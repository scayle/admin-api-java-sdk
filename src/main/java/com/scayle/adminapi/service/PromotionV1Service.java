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
public class PromotionV1Service extends AbstractService {
    public PromotionV1Service(HttpClient httpClient) {
        super(httpClient);
    }

    
    public PromotionV1 create(PromotionV1 model) throws ApiErrorException, ConnectionException {
        Class<PromotionV1> responseModel = (Class<PromotionV1>)(Class<?>)PromotionV1.class;

        return this.request("post", this.resolvePath("/create-promotion"), null, null, responseModel, model);
    }

    
    public PromotionV1 create(PromotionV1 model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<PromotionV1> responseModel = (Class<PromotionV1>)(Class<?>)PromotionV1.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/create-promotion"), query, null, responseModel, model);
    }

    
    public PromotionV1 update(String promotionId, PromotionV1 model) throws ApiErrorException, ConnectionException {
        Class<PromotionV1> responseModel = (Class<PromotionV1>)(Class<?>)PromotionV1.class;

        return this.request("put", this.resolvePath("/update-promotion/%s", promotionId), null, null, responseModel, model);
    }

    
    public PromotionV1 update(String promotionId, PromotionV1 model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<PromotionV1> responseModel = (Class<PromotionV1>)(Class<?>)PromotionV1.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/update-promotion/%s", promotionId), query, null, responseModel, model);
    }

}
