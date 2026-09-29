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
public class ProductVideoService extends AbstractService {
    public ProductVideoService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ProductVideo create(Identifier productIdentifier, ProductVideo model) throws ApiErrorException, ConnectionException {
        Class<ProductVideo> responseModel = (Class<ProductVideo>)(Class<?>)ProductVideo.class;

        return this.request("post", this.resolvePath("/products/%s/videos", productIdentifier), null, null, responseModel, model);
    }

    
    public ProductVideo create(Identifier productIdentifier, ProductVideo model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVideo> responseModel = (Class<ProductVideo>)(Class<?>)ProductVideo.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/products/%s/videos", productIdentifier), query, null, responseModel, model);
    }

    
    public ApiCollection<ProductVideo> all(Identifier productIdentifier) throws ApiErrorException, ConnectionException {
        Class<ProductVideo> responseModel = (Class<ProductVideo>)(Class<?>)ProductVideo.class;

        return this.requestCollection("get", this.resolvePath("/products/%s/videos", productIdentifier), null, null, responseModel);
    }

    
    public ApiCollection<ProductVideo> all(Identifier productIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVideo> responseModel = (Class<ProductVideo>)(Class<?>)ProductVideo.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/products/%s/videos", productIdentifier), query, null, responseModel);
    }

    
    public ProductVideo updatePosition(Identifier productIdentifier, Identifier productVideoIdentifier, ProductVideoPosition model) throws ApiErrorException, ConnectionException {
        Class<ProductVideo> responseModel = (Class<ProductVideo>)(Class<?>)ProductVideo.class;

        return this.request("patch", this.resolvePath("/products/%s/videos/%s", productIdentifier, productVideoIdentifier), null, null, responseModel, model);
    }

    
    public ProductVideo updatePosition(Identifier productIdentifier, Identifier productVideoIdentifier, ProductVideoPosition model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVideo> responseModel = (Class<ProductVideo>)(Class<?>)ProductVideo.class;

        Map<String, Object> query = options.all();

        return this.request("patch", this.resolvePath("/products/%s/videos/%s", productIdentifier, productVideoIdentifier), query, null, responseModel, model);
    }

    
    public void delete(Identifier productIdentifier, Identifier productVideoIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s/videos/%s", productIdentifier, productVideoIdentifier), null, null, null);
    }

    
    public void delete(Identifier productIdentifier, Identifier productVideoIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/products/%s/videos/%s", productIdentifier, productVideoIdentifier), query, null, null);
    }

    
    public Attribute updateOrCreateAttribute(Identifier productIdentifier, Identifier productVideoIdentifier, Attribute model) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.request("post", this.resolvePath("/products/%s/videos/%s/attributes", productIdentifier, productVideoIdentifier), null, null, responseModel, model);
    }

    
    public Attribute updateOrCreateAttribute(Identifier productIdentifier, Identifier productVideoIdentifier, Attribute model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/products/%s/videos/%s/attributes", productIdentifier, productVideoIdentifier), query, null, responseModel, model);
    }

    
    public void deleteAttribute(Identifier productIdentifier, Identifier productVideoIdentifier, String attributeGroupName) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s/videos/%s/attributes/%s", productIdentifier, productVideoIdentifier, attributeGroupName), null, null, null);
    }

    
    public void deleteAttribute(Identifier productIdentifier, Identifier productVideoIdentifier, String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/products/%s/videos/%s/attributes/%s", productIdentifier, productVideoIdentifier, attributeGroupName), query, null, null);
    }

    
    public Attribute getAttribute(Identifier productIdentifier, Identifier productVideoIdentifier, String attributeGroupName) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.request("get", this.resolvePath("/products/%s/videos/%s/attributes/%s", productIdentifier, productVideoIdentifier, attributeGroupName), null, null, responseModel);
    }

    
    public Attribute getAttribute(Identifier productIdentifier, Identifier productVideoIdentifier, String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/products/%s/videos/%s/attributes/%s", productIdentifier, productVideoIdentifier, attributeGroupName), query, null, responseModel);
    }

    
    public ApiCollection<Attribute> allAttributes(Identifier productIdentifier, Identifier productVideoIdentifier) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.requestCollection("get", this.resolvePath("/products/%s/videos/%s/attributes", productIdentifier, productVideoIdentifier), null, null, responseModel);
    }

    
    public ApiCollection<Attribute> allAttributes(Identifier productIdentifier, Identifier productVideoIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/products/%s/videos/%s/attributes", productIdentifier, productVideoIdentifier), query, null, responseModel);
    }

    
    public void unlockAttributeGroup(Identifier productIdentifier, Identifier productVideoIdentifier, String attributeGroupName) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/products/%s/videos/%s/attributes/%s/unlock", productIdentifier, productVideoIdentifier, attributeGroupName), null, null, null);
    }

    
    public void unlockAttributeGroup(Identifier productIdentifier, Identifier productVideoIdentifier, String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("post", this.resolvePath("/products/%s/videos/%s/attributes/%s/unlock", productIdentifier, productVideoIdentifier, attributeGroupName), query, null, null);
    }

}
