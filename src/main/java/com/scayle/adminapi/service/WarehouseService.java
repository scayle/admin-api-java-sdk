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
public class WarehouseService extends AbstractService {
    public WarehouseService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ApiCollection<Warehouse> all() throws ApiErrorException, ConnectionException {
        Class<Warehouse> responseModel = (Class<Warehouse>)(Class<?>)Warehouse.class;

        return this.requestCollection("get", this.resolvePath("/warehouses"), null, null, responseModel);
    }

    
    public ApiCollection<Warehouse> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Warehouse> responseModel = (Class<Warehouse>)(Class<?>)Warehouse.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/warehouses"), query, null, responseModel);
    }

    
    public Warehouse create(Warehouse model) throws ApiErrorException, ConnectionException {
        Class<Warehouse> responseModel = (Class<Warehouse>)(Class<?>)Warehouse.class;

        return this.request("post", this.resolvePath("/warehouses"), null, null, responseModel, model);
    }

    
    public Warehouse create(Warehouse model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Warehouse> responseModel = (Class<Warehouse>)(Class<?>)Warehouse.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/warehouses"), query, null, responseModel, model);
    }

    
    public void delete(Identifier warehouseIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/warehouses/%s", warehouseIdentifier), null, null, null);
    }

    
    public void delete(Identifier warehouseIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/warehouses/%s", warehouseIdentifier), query, null, null);
    }

}
