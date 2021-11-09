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
public class ProductImageService extends AbstractService {
    public ProductImageService(HttpClient httpClient) {
        super(httpClient);
    }

    public ProductImage create(Identifier productIdentifier, ProductImage model) throws ApiErrorException, ConnectionException {
        Class<ProductImage> responseModel = (Class<ProductImage>)(Class<?>)ProductImage.class;

        return this.request("post", this.resolvePath("/products/%s/images", productIdentifier), null, null, responseModel, model);
    }

    public ProductImage create(Identifier productIdentifier, ProductImage model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductImage> responseModel = (Class<ProductImage>)(Class<?>)ProductImage.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/products/%s/images", productIdentifier), query, null, responseModel, model);
    }

    public ApiCollection<ProductImage> all(Identifier productIdentifier) throws ApiErrorException, ConnectionException {
        Class<ProductImage> responseModel = (Class<ProductImage>)(Class<?>)ProductImage.class;

        return this.requestCollection("get", this.resolvePath("/products/%s/images", productIdentifier), null, null, responseModel);
    }

    public ApiCollection<ProductImage> all(Identifier productIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductImage> responseModel = (Class<ProductImage>)(Class<?>)ProductImage.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/products/%s/images", productIdentifier), query, null, responseModel);
    }

    public ProductImage updatePosition(Identifier productIdentifier, Identifier imageIdentifier, ProductImagePosition model) throws ApiErrorException, ConnectionException {
        Class<ProductImage> responseModel = (Class<ProductImage>)(Class<?>)ProductImage.class;

        return this.request("patch", this.resolvePath("/products/%s/images/%s", productIdentifier, imageIdentifier), null, null, responseModel, model);
    }

    public ProductImage updatePosition(Identifier productIdentifier, Identifier imageIdentifier, ProductImagePosition model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductImage> responseModel = (Class<ProductImage>)(Class<?>)ProductImage.class;

        Map<String, Object> query = options.all();

        return this.request("patch", this.resolvePath("/products/%s/images/%s", productIdentifier, imageIdentifier), query, null, responseModel, model);
    }

    public void delete(Identifier productIdentifier, Identifier imageIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s/images/%s", productIdentifier, imageIdentifier), null, null, null);
    }

    public void delete(Identifier productIdentifier, Identifier imageIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/products/%s/images/%s", productIdentifier, imageIdentifier), query, null, null);
    }

    public Attribute updateOrCreateAttribute(Identifier productIdentifier, Identifier imageIdentifier, Attribute model) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.request("post", this.resolvePath("/products/%s/images/%s/attributes", productIdentifier, imageIdentifier), null, null, responseModel, model);
    }

    public Attribute updateOrCreateAttribute(Identifier productIdentifier, Identifier imageIdentifier, Attribute model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/products/%s/images/%s/attributes", productIdentifier, imageIdentifier), query, null, responseModel, model);
    }

    public void deleteAttribute(Identifier productIdentifier, Identifier imageIdentifier, String attributeGroupName) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s/images/%s/attributes/%s", productIdentifier, imageIdentifier, attributeGroupName), null, null, null);
    }

    public void deleteAttribute(Identifier productIdentifier, Identifier imageIdentifier, String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/products/%s/images/%s/attributes/%s", productIdentifier, imageIdentifier, attributeGroupName), query, null, null);
    }

    public Attribute getAttribute(Identifier productIdentifier, Identifier imageIdentifier, String attributeGroupName) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.request("get", this.resolvePath("/products/%s/images/%s/attributes/%s", productIdentifier, imageIdentifier, attributeGroupName), null, null, responseModel);
    }

    public Attribute getAttribute(Identifier productIdentifier, Identifier imageIdentifier, String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/products/%s/images/%s/attributes/%s", productIdentifier, imageIdentifier, attributeGroupName), query, null, responseModel);
    }

    public ApiCollection<Attribute> allAttributes(Identifier productIdentifier, Identifier imageIdentifier) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.requestCollection("get", this.resolvePath("/products/%s/images/%s/attributes", productIdentifier, imageIdentifier), null, null, responseModel);
    }

    public ApiCollection<Attribute> allAttributes(Identifier productIdentifier, Identifier imageIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/products/%s/images/%s/attributes", productIdentifier, imageIdentifier), query, null, responseModel);
    }

}
