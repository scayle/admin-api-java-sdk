package com.aboutyou.cloud.adminapi.service;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class ShopCountryWarehouseService extends AbstractService {
    public ShopCountryWarehouseService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ShopCountryWarehouse create(String shopKey, String countryCode, ShopCountryWarehouse model) throws ApiErrorException, ConnectionException {
        Class<ShopCountryWarehouse> responseModel = (Class<ShopCountryWarehouse>)(Class<?>)ShopCountryWarehouse.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/warehouses", shopKey, countryCode), null, null, responseModel, model);
    }

    
    public ShopCountryWarehouse create(String shopKey, String countryCode, ShopCountryWarehouse model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCountryWarehouse> responseModel = (Class<ShopCountryWarehouse>)(Class<?>)ShopCountryWarehouse.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/warehouses", shopKey, countryCode), query, null, responseModel, model);
    }

    
    public ShopCountryWarehouse update(String shopKey, String countryCode, Identifier warehouseIdentifier, ShopCountryWarehouse model) throws ApiErrorException, ConnectionException {
        Class<ShopCountryWarehouse> responseModel = (Class<ShopCountryWarehouse>)(Class<?>)ShopCountryWarehouse.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/warehouses/%s", shopKey, countryCode, warehouseIdentifier), null, null, responseModel, model);
    }

    
    public ShopCountryWarehouse update(String shopKey, String countryCode, Identifier warehouseIdentifier, ShopCountryWarehouse model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopCountryWarehouse> responseModel = (Class<ShopCountryWarehouse>)(Class<?>)ShopCountryWarehouse.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/warehouses/%s", shopKey, countryCode, warehouseIdentifier), query, null, responseModel, model);
    }

    
    public void delete(String shopKey, String countryCode, Identifier warehouseIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/warehouses/%s", shopKey, countryCode, warehouseIdentifier), null, null, null);
    }

    
    public void delete(String shopKey, String countryCode, Identifier warehouseIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/warehouses/%s", shopKey, countryCode, warehouseIdentifier), query, null, null);
    }

}
