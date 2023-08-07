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
public class MasterService extends AbstractService {
    public MasterService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ProductMasterCategories updateProductMasterMasterCategories(Identifier productMasterIdentifier, ProductMasterCategories model) throws ApiErrorException, ConnectionException {
        Class<ProductMasterCategories> responseModel = (Class<ProductMasterCategories>)(Class<?>)ProductMasterCategories.class;

        return this.request("put", this.resolvePath("/product-masters/%s/master-categories", productMasterIdentifier), null, null, responseModel, model);
    }

    
    public ProductMasterCategories updateProductMasterMasterCategories(Identifier productMasterIdentifier, ProductMasterCategories model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductMasterCategories> responseModel = (Class<ProductMasterCategories>)(Class<?>)ProductMasterCategories.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/product-masters/%s/master-categories", productMasterIdentifier), query, null, responseModel, model);
    }

    
    public ApiCollection<Attribute> allAttributes(Identifier productMasterIdentifier) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.requestCollection("get", this.resolvePath("/product-masters/%s/attributes", productMasterIdentifier), null, null, responseModel);
    }

    
    public ApiCollection<Attribute> allAttributes(Identifier productMasterIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/product-masters/%s/attributes", productMasterIdentifier), query, null, responseModel);
    }

    
    public Attribute updateOrCreateAttribute(Identifier productMasterIdentifier, Attribute model) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.request("post", this.resolvePath("/product-masters/%s/attributes", productMasterIdentifier), null, null, responseModel, model);
    }

    
    public Attribute updateOrCreateAttribute(Identifier productMasterIdentifier, Attribute model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/product-masters/%s/attributes", productMasterIdentifier), query, null, responseModel, model);
    }

    
    public Attribute getAttribute(Identifier productMasterIdentifier, String attributeGroupName) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.request("get", this.resolvePath("/product-masters/%s/attributes/%s", productMasterIdentifier, attributeGroupName), null, null, responseModel);
    }

    
    public Attribute getAttribute(Identifier productMasterIdentifier, String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/product-masters/%s/attributes/%s", productMasterIdentifier, attributeGroupName), query, null, responseModel);
    }

}
