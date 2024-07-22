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
public class SellableWithoutStockService extends AbstractService {
    public SellableWithoutStockService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public SellableWithoutStock setSellableWithoutStock(Identifier variantIdentifier, SellableWithoutStock model) throws ApiErrorException, ConnectionException {
        Class<SellableWithoutStock> responseModel = (Class<SellableWithoutStock>)(Class<?>)SellableWithoutStock.class;

        return this.request("put", this.resolvePath("/variants/%s/stocks/sellableWithoutStock", variantIdentifier), null, null, responseModel, model);
    }

    
    public SellableWithoutStock setSellableWithoutStock(Identifier variantIdentifier, SellableWithoutStock model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<SellableWithoutStock> responseModel = (Class<SellableWithoutStock>)(Class<?>)SellableWithoutStock.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/variants/%s/stocks/sellableWithoutStock", variantIdentifier), query, null, responseModel, model);
    }

}
