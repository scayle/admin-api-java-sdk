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
public class MerchantService extends AbstractService {
    public MerchantService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ApiCollection<Merchant> all() throws ApiErrorException, ConnectionException {
        Class<Merchant> responseModel = (Class<Merchant>)(Class<?>)Merchant.class;

        return this.requestCollection("get", this.resolvePath("/merchants"), null, null, responseModel);
    }

    
    public ApiCollection<Merchant> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Merchant> responseModel = (Class<Merchant>)(Class<?>)Merchant.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/merchants"), query, null, responseModel);
    }

    
    public Merchant get(Identifier merchantIdentifier) throws ApiErrorException, ConnectionException {
        Class<Merchant> responseModel = (Class<Merchant>)(Class<?>)Merchant.class;

        return this.request("get", this.resolvePath("/merchants/%s", merchantIdentifier), null, null, responseModel);
    }

    
    public Merchant get(Identifier merchantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Merchant> responseModel = (Class<Merchant>)(Class<?>)Merchant.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/merchants/%s", merchantIdentifier), query, null, responseModel);
    }

    
    public Merchant create(Merchant model) throws ApiErrorException, ConnectionException {
        Class<Merchant> responseModel = (Class<Merchant>)(Class<?>)Merchant.class;

        return this.request("post", this.resolvePath("/merchants"), null, null, responseModel, model);
    }

    
    public Merchant create(Merchant model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Merchant> responseModel = (Class<Merchant>)(Class<?>)Merchant.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/merchants"), query, null, responseModel, model);
    }

    
    public Merchant update(Identifier merchantIdentifier, Merchant model) throws ApiErrorException, ConnectionException {
        Class<Merchant> responseModel = (Class<Merchant>)(Class<?>)Merchant.class;

        return this.request("put", this.resolvePath("/merchants/%s", merchantIdentifier), null, null, responseModel, model);
    }

    
    public Merchant update(Identifier merchantIdentifier, Merchant model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Merchant> responseModel = (Class<Merchant>)(Class<?>)Merchant.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/merchants/%s", merchantIdentifier), query, null, responseModel, model);
    }

    
    public ApiCollection<MerchantContact> allContacts(Identifier merchantIdentifier) throws ApiErrorException, ConnectionException {
        Class<MerchantContact> responseModel = (Class<MerchantContact>)(Class<?>)MerchantContact.class;

        return this.requestCollection("get", this.resolvePath("/merchants/%s/contacts", merchantIdentifier), null, null, responseModel);
    }

    
    public ApiCollection<MerchantContact> allContacts(Identifier merchantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<MerchantContact> responseModel = (Class<MerchantContact>)(Class<?>)MerchantContact.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/merchants/%s/contacts", merchantIdentifier), query, null, responseModel);
    }

    
    public MerchantContact getContact(Identifier merchantIdentifier, Integer merchantContactId) throws ApiErrorException, ConnectionException {
        Class<MerchantContact> responseModel = (Class<MerchantContact>)(Class<?>)MerchantContact.class;

        return this.request("get", this.resolvePath("/merchants/%s/contacts/%s", merchantIdentifier, merchantContactId), null, null, responseModel);
    }

    
    public MerchantContact getContact(Identifier merchantIdentifier, Integer merchantContactId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<MerchantContact> responseModel = (Class<MerchantContact>)(Class<?>)MerchantContact.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/merchants/%s/contacts/%s", merchantIdentifier, merchantContactId), query, null, responseModel);
    }

    
    public MerchantContact createContact(Identifier merchantIdentifier, MerchantContact model) throws ApiErrorException, ConnectionException {
        Class<MerchantContact> responseModel = (Class<MerchantContact>)(Class<?>)MerchantContact.class;

        return this.request("post", this.resolvePath("/merchants/%s/contacts", merchantIdentifier), null, null, responseModel, model);
    }

    
    public MerchantContact createContact(Identifier merchantIdentifier, MerchantContact model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<MerchantContact> responseModel = (Class<MerchantContact>)(Class<?>)MerchantContact.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/merchants/%s/contacts", merchantIdentifier), query, null, responseModel, model);
    }

    
    public MerchantContact updateContact(Identifier merchantIdentifier, Integer merchantContactId, MerchantContact model) throws ApiErrorException, ConnectionException {
        Class<MerchantContact> responseModel = (Class<MerchantContact>)(Class<?>)MerchantContact.class;

        return this.request("put", this.resolvePath("/merchants/%s/contacts/%s", merchantIdentifier, merchantContactId), null, null, responseModel, model);
    }

    
    public MerchantContact updateContact(Identifier merchantIdentifier, Integer merchantContactId, MerchantContact model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<MerchantContact> responseModel = (Class<MerchantContact>)(Class<?>)MerchantContact.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/merchants/%s/contacts/%s", merchantIdentifier, merchantContactId), query, null, responseModel, model);
    }

    
    public void deleteContact(Identifier merchantIdentifier, Integer merchantContactId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/merchants/%s/contacts/%s", merchantIdentifier, merchantContactId), null, null, null);
    }

    
    public void deleteContact(Identifier merchantIdentifier, Integer merchantContactId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/merchants/%s/contacts/%s", merchantIdentifier, merchantContactId), query, null, null);
    }

    
    public ApiCollection<MerchantReturnAddress> allReturnAddresses(Identifier merchantIdentifier) throws ApiErrorException, ConnectionException {
        Class<MerchantReturnAddress> responseModel = (Class<MerchantReturnAddress>)(Class<?>)MerchantReturnAddress.class;

        return this.requestCollection("get", this.resolvePath("/merchants/%s/return-addresses", merchantIdentifier), null, null, responseModel);
    }

    
    public ApiCollection<MerchantReturnAddress> allReturnAddresses(Identifier merchantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<MerchantReturnAddress> responseModel = (Class<MerchantReturnAddress>)(Class<?>)MerchantReturnAddress.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/merchants/%s/return-addresses", merchantIdentifier), query, null, responseModel);
    }

    
    public MerchantReturnAddress getReturnAddress(Identifier merchantIdentifier, Integer merchantReturnAddressId) throws ApiErrorException, ConnectionException {
        Class<MerchantReturnAddress> responseModel = (Class<MerchantReturnAddress>)(Class<?>)MerchantReturnAddress.class;

        return this.request("get", this.resolvePath("/merchants/%s/return-addresses/%s", merchantIdentifier, merchantReturnAddressId), null, null, responseModel);
    }

    
    public MerchantReturnAddress getReturnAddress(Identifier merchantIdentifier, Integer merchantReturnAddressId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<MerchantReturnAddress> responseModel = (Class<MerchantReturnAddress>)(Class<?>)MerchantReturnAddress.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/merchants/%s/return-addresses/%s", merchantIdentifier, merchantReturnAddressId), query, null, responseModel);
    }

    
    public MerchantReturnAddress createReturnAddress(Identifier merchantIdentifier, MerchantReturnAddress model) throws ApiErrorException, ConnectionException {
        Class<MerchantReturnAddress> responseModel = (Class<MerchantReturnAddress>)(Class<?>)MerchantReturnAddress.class;

        return this.request("post", this.resolvePath("/merchants/%s/return-addresses", merchantIdentifier), null, null, responseModel, model);
    }

    
    public MerchantReturnAddress createReturnAddress(Identifier merchantIdentifier, MerchantReturnAddress model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<MerchantReturnAddress> responseModel = (Class<MerchantReturnAddress>)(Class<?>)MerchantReturnAddress.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/merchants/%s/return-addresses", merchantIdentifier), query, null, responseModel, model);
    }

    
    public MerchantReturnAddress updateReturnAddress(Identifier merchantIdentifier, Integer merchantReturnAddressId, MerchantReturnAddress model) throws ApiErrorException, ConnectionException {
        Class<MerchantReturnAddress> responseModel = (Class<MerchantReturnAddress>)(Class<?>)MerchantReturnAddress.class;

        return this.request("put", this.resolvePath("/merchants/%s/return-addresses/%s", merchantIdentifier, merchantReturnAddressId), null, null, responseModel, model);
    }

    
    public MerchantReturnAddress updateReturnAddress(Identifier merchantIdentifier, Integer merchantReturnAddressId, MerchantReturnAddress model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<MerchantReturnAddress> responseModel = (Class<MerchantReturnAddress>)(Class<?>)MerchantReturnAddress.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/merchants/%s/return-addresses/%s", merchantIdentifier, merchantReturnAddressId), query, null, responseModel, model);
    }

    
    public void deleteReturnAddress(Identifier merchantIdentifier, Integer merchantReturnAddressId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/merchants/%s/return-addresses/%s", merchantIdentifier, merchantReturnAddressId), null, null, null);
    }

    
    public void deleteReturnAddress(Identifier merchantIdentifier, Integer merchantReturnAddressId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/merchants/%s/return-addresses/%s", merchantIdentifier, merchantReturnAddressId), query, null, null);
    }

    
    public void attachCarrier(Identifier merchantIdentifier, Identifier carrierIdentifier, String countryCode) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/merchants/%s/carriers/%s/countries/%s", merchantIdentifier, carrierIdentifier, countryCode), null, null, null);
    }

    
    public void attachCarrier(Identifier merchantIdentifier, Identifier carrierIdentifier, String countryCode, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("post", this.resolvePath("/merchants/%s/carriers/%s/countries/%s", merchantIdentifier, carrierIdentifier, countryCode), query, null, null);
    }

    
    public void detachCarrier(Identifier merchantIdentifier, Identifier carrierIdentifier, String countryCode) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/merchants/%s/carriers/%s/countries/%s", merchantIdentifier, carrierIdentifier, countryCode), null, null, null);
    }

    
    public void detachCarrier(Identifier merchantIdentifier, Identifier carrierIdentifier, String countryCode, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/merchants/%s/carriers/%s/countries/%s", merchantIdentifier, carrierIdentifier, countryCode), query, null, null);
    }

    
    public ApiCollection<Warehouse> allWarehouses(Identifier merchantIdentifier) throws ApiErrorException, ConnectionException {
        Class<Warehouse> responseModel = (Class<Warehouse>)(Class<?>)Warehouse.class;

        return this.requestCollection("get", this.resolvePath("/merchants/%s/warehouses", merchantIdentifier), null, null, responseModel);
    }

    
    public ApiCollection<Warehouse> allWarehouses(Identifier merchantIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Warehouse> responseModel = (Class<Warehouse>)(Class<?>)Warehouse.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/merchants/%s/warehouses", merchantIdentifier), query, null, responseModel);
    }

    
    public void attachWarehouse(Identifier merchantIdentifier, Identifier warehouseIdentifier) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/merchants/%s/warehouses/%s", merchantIdentifier, warehouseIdentifier), null, null, null);
    }

    
    public void attachWarehouse(Identifier merchantIdentifier, Identifier warehouseIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("post", this.resolvePath("/merchants/%s/warehouses/%s", merchantIdentifier, warehouseIdentifier), query, null, null);
    }

    
    public void detachWarehouse(Identifier merchantIdentifier, Identifier warehouseIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/merchants/%s/warehouses/%s", merchantIdentifier, warehouseIdentifier), null, null, null);
    }

    
    public void detachWarehouse(Identifier merchantIdentifier, Identifier warehouseIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/merchants/%s/warehouses/%s", merchantIdentifier, warehouseIdentifier), query, null, null);
    }

}
