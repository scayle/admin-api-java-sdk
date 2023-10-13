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
public class ProductSortingService extends AbstractService {
    public ProductSortingService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public void updateOrCreate(List<ProductSorting> model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/product-sortings"), null, null, null, model);
    }

    
    public void updateOrCreate(List<ProductSorting> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("post", this.resolvePath("/product-sortings"), query, null, null, model);
    }

    
    public void delete(List<ProductSorting> model) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/product-sortings"), null, null, null, model);
    }

    
    public void delete(List<ProductSorting> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/product-sortings"), query, null, null, model);
    }

}
