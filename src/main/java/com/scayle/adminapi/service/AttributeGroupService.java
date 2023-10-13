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
public class AttributeGroupService extends AbstractService {
    public AttributeGroupService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public AttributeGroup create(AttributeGroup model) throws ApiErrorException, ConnectionException {
        Class<AttributeGroup> responseModel = (Class<AttributeGroup>)(Class<?>)AttributeGroup.class;

        return this.request("post", this.resolvePath("/attribute-groups"), null, null, responseModel, model);
    }

    
    public AttributeGroup create(AttributeGroup model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<AttributeGroup> responseModel = (Class<AttributeGroup>)(Class<?>)AttributeGroup.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/attribute-groups"), query, null, responseModel, model);
    }

    
    public AttributeGroup get(String attributeGroupName) throws ApiErrorException, ConnectionException {
        Class<AttributeGroup> responseModel = (Class<AttributeGroup>)(Class<?>)AttributeGroup.class;

        return this.request("get", this.resolvePath("/attribute-groups/%s", attributeGroupName), null, null, responseModel);
    }

    
    public AttributeGroup get(String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<AttributeGroup> responseModel = (Class<AttributeGroup>)(Class<?>)AttributeGroup.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/attribute-groups/%s", attributeGroupName), query, null, responseModel);
    }

    
    public ApiCollection<AttributeGroup> all() throws ApiErrorException, ConnectionException {
        Class<AttributeGroup> responseModel = (Class<AttributeGroup>)(Class<?>)AttributeGroup.class;

        return this.requestCollection("get", this.resolvePath("/attribute-groups"), null, null, responseModel);
    }

    
    public ApiCollection<AttributeGroup> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<AttributeGroup> responseModel = (Class<AttributeGroup>)(Class<?>)AttributeGroup.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/attribute-groups"), query, null, responseModel);
    }

    
    public AttributeGroup update(String attributeGroupName, AttributeGroup model) throws ApiErrorException, ConnectionException {
        Class<AttributeGroup> responseModel = (Class<AttributeGroup>)(Class<?>)AttributeGroup.class;

        return this.request("put", this.resolvePath("/attribute-groups/%s", attributeGroupName), null, null, responseModel, model);
    }

    
    public AttributeGroup update(String attributeGroupName, AttributeGroup model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<AttributeGroup> responseModel = (Class<AttributeGroup>)(Class<?>)AttributeGroup.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/attribute-groups/%s", attributeGroupName), query, null, responseModel, model);
    }

    
    public void delete(String attributeGroupName) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/attribute-groups/%s", attributeGroupName), null, null, null);
    }

    
    public void delete(String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/attribute-groups/%s", attributeGroupName), query, null, null);
    }

    
    public void updateFrontendName(String attributeGroupName, Map<String, String> model) throws ApiErrorException, ConnectionException {

        this.request("put", this.resolvePath("/attribute-groups/%s/frontend-name", attributeGroupName), null, null, null, model);
    }

    
    public void updateFrontendName(String attributeGroupName, Map<String, String> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("put", this.resolvePath("/attribute-groups/%s/frontend-name", attributeGroupName), query, null, null, model);
    }

    
    public ApiCollection<Object> getAttributes(String attributeGroupName) throws ApiErrorException, ConnectionException {
        Class<Object> responseModel = (Class<Object>)(Class<?>)Object.class;

        return this.requestCollection("get", this.resolvePath("/attribute-groups/%s/attributes", attributeGroupName), null, null, responseModel);
    }

    
    public ApiCollection<Object> getAttributes(String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Object> responseModel = (Class<Object>)(Class<?>)Object.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/attribute-groups/%s/attributes", attributeGroupName), query, null, responseModel);
    }

}
