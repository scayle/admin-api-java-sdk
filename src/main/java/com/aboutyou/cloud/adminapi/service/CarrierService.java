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
public class CarrierService extends AbstractService {
    public CarrierService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ApiCollection<Carrier> all() throws ApiErrorException, ConnectionException {
        Class<Carrier> responseModel = (Class<Carrier>)(Class<?>)Carrier.class;

        return this.requestCollection("get", this.resolvePath("/carriers"), null, null, responseModel);
    }

    
    public ApiCollection<Carrier> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Carrier> responseModel = (Class<Carrier>)(Class<?>)Carrier.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/carriers"), query, null, responseModel);
    }

    
    public Carrier get(Identifier carrierIdentifier) throws ApiErrorException, ConnectionException {
        Class<Carrier> responseModel = (Class<Carrier>)(Class<?>)Carrier.class;

        return this.request("get", this.resolvePath("/carriers/%s", carrierIdentifier), null, null, responseModel);
    }

    
    public Carrier get(Identifier carrierIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Carrier> responseModel = (Class<Carrier>)(Class<?>)Carrier.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/carriers/%s", carrierIdentifier), query, null, responseModel);
    }

    
    public Carrier create(Carrier model) throws ApiErrorException, ConnectionException {
        Class<Carrier> responseModel = (Class<Carrier>)(Class<?>)Carrier.class;

        return this.request("post", this.resolvePath("/carriers"), null, null, responseModel, model);
    }

    
    public Carrier create(Carrier model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Carrier> responseModel = (Class<Carrier>)(Class<?>)Carrier.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/carriers"), query, null, responseModel, model);
    }

    
    public Carrier update(Identifier carrierIdentifier, Carrier model) throws ApiErrorException, ConnectionException {
        Class<Carrier> responseModel = (Class<Carrier>)(Class<?>)Carrier.class;

        return this.request("put", this.resolvePath("/carriers/%s", carrierIdentifier), null, null, responseModel, model);
    }

    
    public Carrier update(Identifier carrierIdentifier, Carrier model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Carrier> responseModel = (Class<Carrier>)(Class<?>)Carrier.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/carriers/%s", carrierIdentifier), query, null, responseModel, model);
    }

}
