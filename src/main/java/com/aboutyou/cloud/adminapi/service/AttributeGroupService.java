package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class AttributeGroupService extends AbstractService {
    public AttributeGroupService(HttpClient httpClient) {
        super(httpClient);
    }

    public AttributeGroup create(AttributeGroup model) throws ApiErrorException, ConnectionException {
        Class<AttributeGroup> responseModel = (Class<AttributeGroup>)(Class<?>)AttributeGroup.class;

        return this.request("post", this.resolvePath("/attribute-groups"), null, responseModel, model);
    }

    public AttributeGroup create(AttributeGroup model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<AttributeGroup> responseModel = (Class<AttributeGroup>)(Class<?>)AttributeGroup.class;

        return this.request("post", this.resolvePath("/attribute-groups"), options, responseModel, model);
    }

    public AttributeGroup get(String attributeGroupName) throws ApiErrorException, ConnectionException {
        Class<AttributeGroup> responseModel = (Class<AttributeGroup>)(Class<?>)AttributeGroup.class;

        return this.request("get", this.resolvePath("/attribute-groups/%s", attributeGroupName), null, responseModel);
    }

    public AttributeGroup get(String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<AttributeGroup> responseModel = (Class<AttributeGroup>)(Class<?>)AttributeGroup.class;

        return this.request("get", this.resolvePath("/attribute-groups/%s", attributeGroupName), options, responseModel);
    }

    public ApiCollection<AttributeGroup> all() throws ApiErrorException, ConnectionException {
        Class<AttributeGroup> responseModel = (Class<AttributeGroup>)(Class<?>)AttributeGroup.class;

        return this.requestCollection("get", this.resolvePath("/attribute-groups"), null, responseModel);
    }

    public ApiCollection<AttributeGroup> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<AttributeGroup> responseModel = (Class<AttributeGroup>)(Class<?>)AttributeGroup.class;

        return this.requestCollection("get", this.resolvePath("/attribute-groups"), options, responseModel);
    }

    public AttributeGroup update(String attributeGroupName, AttributeGroup model) throws ApiErrorException, ConnectionException {
        Class<AttributeGroup> responseModel = (Class<AttributeGroup>)(Class<?>)AttributeGroup.class;

        return this.request("put", this.resolvePath("/attribute-groups/%s", attributeGroupName), null, responseModel, model);
    }

    public AttributeGroup update(String attributeGroupName, AttributeGroup model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<AttributeGroup> responseModel = (Class<AttributeGroup>)(Class<?>)AttributeGroup.class;

        return this.request("put", this.resolvePath("/attribute-groups/%s", attributeGroupName), options, responseModel, model);
    }

    public void delete(String attributeGroupName) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/attribute-groups/%s", attributeGroupName), null, null);
    }

    public void delete(String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/attribute-groups/%s", attributeGroupName), options, null);
    }

    public void updateFrontendName(String attributeGroupName, Map<String, String> model) throws ApiErrorException, ConnectionException {

        this.request("put", this.resolvePath("/attribute-groups/%s/frontend-name", attributeGroupName), null, null, model);
    }

    public void updateFrontendName(String attributeGroupName, Map<String, String> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("put", this.resolvePath("/attribute-groups/%s/frontend-name", attributeGroupName), options, null, model);
    }

}