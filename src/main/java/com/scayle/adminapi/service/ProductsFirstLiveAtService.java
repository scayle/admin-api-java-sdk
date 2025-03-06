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
public class ProductsFirstLiveAtService extends AbstractService {
    public ProductsFirstLiveAtService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public void updateProductsFirstLiveAt(ProductsFirstLiveAt model) throws ApiErrorException, ConnectionException {

        this.request("put", this.resolvePath("/products/first-live-at"), null, null, null, model);
    }

    
    public void updateProductsFirstLiveAt(ProductsFirstLiveAt model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("put", this.resolvePath("/products/first-live-at"), query, null, null, model);
    }

}
