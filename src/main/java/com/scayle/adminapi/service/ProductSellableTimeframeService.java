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
public class ProductSellableTimeframeService extends AbstractService {
    public ProductSellableTimeframeService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public void batchProcess(List<ProductSellableTimeframe> model) throws ApiErrorException, ConnectionException {

        this.request("put", this.resolvePath("/products/sellable-timeframes"), null, null, null, model);
    }

    
    public void batchProcess(List<ProductSellableTimeframe> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("put", this.resolvePath("/products/sellable-timeframes"), query, null, null, model);
    }

}
