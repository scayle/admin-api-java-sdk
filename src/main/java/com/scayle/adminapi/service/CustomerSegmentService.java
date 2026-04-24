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
public class CustomerSegmentService extends AbstractService {
    public CustomerSegmentService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ApiCollection<CustomerSegment> getCustomerSegments(String shopKey, String countryCode) throws ApiErrorException, ConnectionException {
        Class<CustomerSegment> responseModel = (Class<CustomerSegment>)(Class<?>)CustomerSegment.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/customer-segments", shopKey, countryCode), null, null, responseModel);
    }

    
    public ApiCollection<CustomerSegment> getCustomerSegments(String shopKey, String countryCode, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerSegment> responseModel = (Class<CustomerSegment>)(Class<?>)CustomerSegment.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/shops/%s/countries/%s/customer-segments", shopKey, countryCode), query, null, responseModel);
    }

    
    public CustomerSegment createCustomerSegment(String shopKey, String countryCode, CustomerSegment model) throws ApiErrorException, ConnectionException {
        Class<CustomerSegment> responseModel = (Class<CustomerSegment>)(Class<?>)CustomerSegment.class;

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/customer-segments", shopKey, countryCode), null, null, responseModel, model);
    }

    
    public CustomerSegment createCustomerSegment(String shopKey, String countryCode, CustomerSegment model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerSegment> responseModel = (Class<CustomerSegment>)(Class<?>)CustomerSegment.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/shops/%s/countries/%s/customer-segments", shopKey, countryCode), query, null, responseModel, model);
    }

    
    public CustomerSegment getCustomerSegment(String shopKey, String countryCode, String segmentGuid) throws ApiErrorException, ConnectionException {
        Class<CustomerSegment> responseModel = (Class<CustomerSegment>)(Class<?>)CustomerSegment.class;

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/customer-segments/%s", shopKey, countryCode, segmentGuid), null, null, responseModel);
    }

    
    public CustomerSegment getCustomerSegment(String shopKey, String countryCode, String segmentGuid, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerSegment> responseModel = (Class<CustomerSegment>)(Class<?>)CustomerSegment.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/shops/%s/countries/%s/customer-segments/%s", shopKey, countryCode, segmentGuid), query, null, responseModel);
    }

    
    public CustomerSegment updateCustomerSegment(String shopKey, String countryCode, String segmentGuid, CustomerSegment model) throws ApiErrorException, ConnectionException {
        Class<CustomerSegment> responseModel = (Class<CustomerSegment>)(Class<?>)CustomerSegment.class;

        return this.request("patch", this.resolvePath("/shops/%s/countries/%s/customer-segments/%s", shopKey, countryCode, segmentGuid), null, null, responseModel, model);
    }

    
    public CustomerSegment updateCustomerSegment(String shopKey, String countryCode, String segmentGuid, CustomerSegment model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<CustomerSegment> responseModel = (Class<CustomerSegment>)(Class<?>)CustomerSegment.class;

        Map<String, Object> query = options.all();

        return this.request("patch", this.resolvePath("/shops/%s/countries/%s/customer-segments/%s", shopKey, countryCode, segmentGuid), query, null, responseModel, model);
    }

    
    public void deleteCustomerSegment(String shopKey, String countryCode, String segmentGuid) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/customer-segments/%s", shopKey, countryCode, segmentGuid), null, null, null);
    }

    
    public void deleteCustomerSegment(String shopKey, String countryCode, String segmentGuid, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/countries/%s/customer-segments/%s", shopKey, countryCode, segmentGuid), query, null, null);
    }

}
