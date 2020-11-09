package com.aboutyou.cloud.adminapi.service;

import java.util.Map;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class ProductService extends AbstractService {
    public ProductService(HttpClient httpClient) {
        super(httpClient);
    }

    public Product create(Product model) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        return this.request("post", this.resolvePath("/products"), null, responseModel, model);
    }

    public Product create(Product model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        return this.request("post", this.resolvePath("/products"), options, responseModel, model);
    }

    public Product get(Identifier productIdentifier) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        return this.request("get", this.resolvePath("/products/%s", productIdentifier), null, responseModel);
    }

    public Product get(Identifier productIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        return this.request("get", this.resolvePath("/products/%s", productIdentifier), options, responseModel);
    }

    public ApiCollection<Product> all() throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        return this.requestCollection("get", this.resolvePath("/products"), null, responseModel);
    }

    public ApiCollection<Product> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        return this.requestCollection("get", this.resolvePath("/products"), options, responseModel);
    }

    public Product update(Identifier productIdentifier, Product model) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        return this.request("put", this.resolvePath("/products/%s", productIdentifier), null, responseModel, model);
    }

    public Product update(Identifier productIdentifier, Product model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        return this.request("put", this.resolvePath("/products/%s", productIdentifier), options, responseModel, model);
    }

    public void delete(Identifier productIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s", productIdentifier), null, null);
    }

    public void delete(Identifier productIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s", productIdentifier), options, null);
    }

    public Attribute updateOrCreateAttribute(Identifier productIdentifier, Attribute model) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.request("post", this.resolvePath("/products/%s/attributes", productIdentifier), null, responseModel, model);
    }

    public Attribute updateOrCreateAttribute(Identifier productIdentifier, Attribute model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.request("post", this.resolvePath("/products/%s/attributes", productIdentifier), options, responseModel, model);
    }

    public void deleteAttribute(Identifier productIdentifier, String attributeGroupName) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s/attributes/%s", productIdentifier, attributeGroupName), null, null);
    }

    public void deleteAttribute(Identifier productIdentifier, String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s/attributes/%s", productIdentifier, attributeGroupName), options, null);
    }

    public Attribute getAttribute(Identifier productIdentifier, String attributeGroupName) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.request("get", this.resolvePath("/products/%s/attributes/%s", productIdentifier, attributeGroupName), null, responseModel);
    }

    public Attribute getAttribute(Identifier productIdentifier, String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.request("get", this.resolvePath("/products/%s/attributes/%s", productIdentifier, attributeGroupName), options, responseModel);
    }

    public ApiCollection<Attribute> allAttributes(Identifier productIdentifier) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.requestCollection("get", this.resolvePath("/products/%s/attributes", productIdentifier), null, responseModel);
    }

    public ApiCollection<Attribute> allAttributes(Identifier productIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.requestCollection("get", this.resolvePath("/products/%s/attributes", productIdentifier), options, responseModel);
    }

}