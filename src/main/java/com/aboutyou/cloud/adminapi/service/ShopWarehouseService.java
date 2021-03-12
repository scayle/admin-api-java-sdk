package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
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

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/warehouses", shopKey, countryCode), null, responseModel, model);
    }

    public ShopWarehouse create(String shopKey, String countryCode, ShopWarehouse model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopWarehouse> responseModel = (Class<ShopWarehouse>)(Class<?>)ShopWarehouse.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/warehouses", shopKey, countryCode), options, responseModel, model);
    }

    public ShopWarehouse update(String shopKey, String countryCode, Identifier shopWarehouseIdentifier, ShopWarehouse model) throws ApiErrorException, ConnectionException {
        Class<ShopWarehouse> responseModel = (Class<ShopWarehouse>)(Class<?>)ShopWarehouse.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/warehouses/%s", shopKey, countryCode, shopWarehouseIdentifier), null, responseModel, model);
    }

    public ShopWarehouse update(String shopKey, String countryCode, Identifier shopWarehouseIdentifier, ShopWarehouse model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ShopWarehouse> responseModel = (Class<ShopWarehouse>)(Class<?>)ShopWarehouse.class;

        return this.request("put", this.resolvePath("/shops/%s/countries/%s/warehouses/%s", shopKey, countryCode, shopWarehouseIdentifier), options, responseModel, model);
    }

    public void delete(String shopKey, String countryCode, Identifier shopWarehouseIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/warehouses/%s", shopKey, countryCode, shopWarehouseIdentifier), null, null);
    }

    public void delete(String shopKey, String countryCode, Identifier shopWarehouseIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/warehouses/%s", shopKey, countryCode, shopWarehouseIdentifier), options, null);
    }

}