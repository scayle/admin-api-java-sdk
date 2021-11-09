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
public class ShopWarehouseService extends AbstractService {
    public ShopWarehouseService(HttpClient httpClient) {
        super(httpClient);
    }

    public ShopWarehouse create(String shopKey, String countryCode, ShopWarehouse model) throws ApiErrorException, ConnectionException {
        Class<ShopWarehouse> responseModel = (Class<ShopWarehouse>)(Class<?>)ShopWarehouse.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/warehouses", shopKey, countryCode), null, null, responseModel, model);
    }

    public ShopWarehouse create(String shopKey, String countryCode, ShopWarehouse model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopWarehouse> responseModel = (Class<ShopWarehouse>)(Class<?>)ShopWarehouse.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/warehouses", shopKey, countryCode), query, null, responseModel, model);
    }

    public ShopWarehouse update(String shopKey, String countryCode, Identifier shopWarehouseIdentifier, ShopWarehouse model) throws ApiErrorException, ConnectionException {
        Class<ShopWarehouse> responseModel = (Class<ShopWarehouse>)(Class<?>)ShopWarehouse.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/warehouses/%s", shopKey, countryCode, shopWarehouseIdentifier), null, null, responseModel, model);
    }

    public ShopWarehouse update(String shopKey, String countryCode, Identifier shopWarehouseIdentifier, ShopWarehouse model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopWarehouse> responseModel = (Class<ShopWarehouse>)(Class<?>)ShopWarehouse.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/warehouses/%s", shopKey, countryCode, shopWarehouseIdentifier), query, null, responseModel, model);
    }

    public void delete(String shopKey, String countryCode, Identifier shopWarehouseIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/warehouses/%s", shopKey, countryCode, shopWarehouseIdentifier), null, null, null);
    }

    public void delete(String shopKey, String countryCode, Identifier shopWarehouseIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/warehouses/%s", shopKey, countryCode, shopWarehouseIdentifier), query, null, null);
    }

}
