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
public class ProductService extends AbstractService {
    public ProductService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public Product create(Product model) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        return this.request("post", this.resolvePath("/products"), null, null, responseModel, model);
    }

    
    public Product create(Product model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/products"), query, null, responseModel, model);
    }

    
    public Product get(Identifier productIdentifier) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        return this.request("get", this.resolvePath("/products/%s", productIdentifier), null, null, responseModel);
    }

    
    public Product get(Identifier productIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/products/%s", productIdentifier), query, null, responseModel);
    }

    
    public ApiCollection<Product> all() throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        return this.requestCollection("get", this.resolvePath("/products"), null, null, responseModel);
    }

    
    public ApiCollection<Product> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/products"), query, null, responseModel);
    }

    
    public Product update(Identifier productIdentifier, Product model) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        return this.request("put", this.resolvePath("/products/%s", productIdentifier), null, null, responseModel, model);
    }

    
    public Product update(Identifier productIdentifier, Product model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/products/%s", productIdentifier), query, null, responseModel, model);
    }

    
    public void delete(Identifier productIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s", productIdentifier), null, null, null);
    }

    
    public void delete(Identifier productIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/products/%s", productIdentifier), query, null, null);
    }

    
    public Attribute updateOrCreateAttribute(Identifier productIdentifier, Attribute model) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.request("post", this.resolvePath("/products/%s/attributes", productIdentifier), null, null, responseModel, model);
    }

    
    public Attribute updateOrCreateAttribute(Identifier productIdentifier, Attribute model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/products/%s/attributes", productIdentifier), query, null, responseModel, model);
    }

    
    public void deleteAttribute(Identifier productIdentifier, String attributeGroupName) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s/attributes/%s", productIdentifier, attributeGroupName), null, null, null);
    }

    
    public void deleteAttribute(Identifier productIdentifier, String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/products/%s/attributes/%s", productIdentifier, attributeGroupName), query, null, null);
    }

    
    public Attribute getAttribute(Identifier productIdentifier, String attributeGroupName) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.request("get", this.resolvePath("/products/%s/attributes/%s", productIdentifier, attributeGroupName), null, null, responseModel);
    }

    
    public Attribute getAttribute(Identifier productIdentifier, String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/products/%s/attributes/%s", productIdentifier, attributeGroupName), query, null, responseModel);
    }

    
    public ApiCollection<Attribute> allAttributes(Identifier productIdentifier) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        return this.requestCollection("get", this.resolvePath("/products/%s/attributes", productIdentifier), null, null, responseModel);
    }

    
    public ApiCollection<Attribute> allAttributes(Identifier productIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Attribute> responseModel = (Class<Attribute>)(Class<?>)Attribute.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/products/%s/attributes", productIdentifier), query, null, responseModel);
    }

    
    public ProductMasterCategories updateMasterCategories(Identifier productIdentifier, ProductMasterCategories model) throws ApiErrorException, ConnectionException {
        Class<ProductMasterCategories> responseModel = (Class<ProductMasterCategories>)(Class<?>)ProductMasterCategories.class;

        return this.request("put", this.resolvePath("/products/%s/master-categories", productIdentifier), null, null, responseModel, model);
    }

    
    public ProductMasterCategories updateMasterCategories(Identifier productIdentifier, ProductMasterCategories model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductMasterCategories> responseModel = (Class<ProductMasterCategories>)(Class<?>)ProductMasterCategories.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/products/%s/master-categories", productIdentifier), query, null, responseModel, model);
    }

    
    public Map<String, Object> createOrUpdateCustomData(Identifier productIdentifier, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/products/%s/custom-data", productIdentifier), null, null, responseModel, model);
    }

    
    public Map<String, Object> createOrUpdateCustomData(Identifier productIdentifier, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/products/%s/custom-data", productIdentifier), query, null, responseModel, model);
    }

    
    public void deleteCustomData(Identifier productIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s/custom-data", productIdentifier), null, null, null);
    }

    
    public void deleteCustomData(Identifier productIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/products/%s/custom-data", productIdentifier), query, null, null);
    }

    
    public Map<String, Object> getCustomData(Identifier productIdentifier) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/products/%s/custom-data", productIdentifier), null, null, responseModel);
    }

    
    public Map<String, Object> getCustomData(Identifier productIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/products/%s/custom-data", productIdentifier), query, null, responseModel);
    }

    
    public Map<String, Object> createOrUpdateCustomDataForKey(Identifier productIdentifier, String key, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/products/%s/custom-data/%s", productIdentifier, key), null, null, responseModel, model);
    }

    
    public Map<String, Object> createOrUpdateCustomDataForKey(Identifier productIdentifier, String key, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/products/%s/custom-data/%s", productIdentifier, key), query, null, responseModel, model);
    }

    
    public void deleteCustomDataForKey(Identifier productIdentifier, String key) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/%s/custom-data/%s", productIdentifier, key), null, null, null);
    }

    
    public void deleteCustomDataForKey(Identifier productIdentifier, String key, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/products/%s/custom-data/%s", productIdentifier, key), query, null, null);
    }

    
    public Map<String, Object> getCustomDataForKey(Identifier productIdentifier, String key) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/products/%s/custom-data/%s", productIdentifier, key), null, null, responseModel);
    }

    
    public Map<String, Object> getCustomDataForKey(Identifier productIdentifier, String key, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/products/%s/custom-data/%s", productIdentifier, key), query, null, responseModel);
    }

    
    public Product createComposite(Product model) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        return this.request("post", this.resolvePath("/products/composite"), null, null, responseModel, model);
    }

    
    public Product createComposite(Product model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/products/composite"), query, null, responseModel, model);
    }

    
    public Product updateComposite(Identifier productIdentifier, Product model) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        return this.request("put", this.resolvePath("/products/composite/%s", productIdentifier), null, null, responseModel, model);
    }

    
    public Product updateComposite(Identifier productIdentifier, Product model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Product> responseModel = (Class<Product>)(Class<?>)Product.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/products/composite/%s", productIdentifier), query, null, responseModel, model);
    }

    
    public void deleteComposite(Identifier productIdentifier) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/products/composite/%s", productIdentifier), null, null, null);
    }

    
    public void deleteComposite(Identifier productIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/products/composite/%s", productIdentifier), query, null, null);
    }

    
    public ProductState updateState(Identifier productIdentifier, ProductState model) throws ApiErrorException, ConnectionException {
        Class<ProductState> responseModel = (Class<ProductState>)(Class<?>)ProductState.class;

        return this.request("put", this.resolvePath("/products/%s/state", productIdentifier), null, null, responseModel, model);
    }

    
    public ProductState updateState(Identifier productIdentifier, ProductState model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductState> responseModel = (Class<ProductState>)(Class<?>)ProductState.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/products/%s/state", productIdentifier), query, null, responseModel, model);
    }

    
    public void patchSimilarProducts(Identifier productIdentifier, List<SimilarProducts> model) throws ApiErrorException, ConnectionException {

        this.request("patch", this.resolvePath("/products/%s/similar-products", productIdentifier), null, null, null, model);
    }

    
    public void patchSimilarProducts(Identifier productIdentifier, List<SimilarProducts> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("patch", this.resolvePath("/products/%s/similar-products", productIdentifier), query, null, null, model);
    }

    
    public BulkRequest createBulkRequest(CreateBulkRequest model) throws ApiErrorException, ConnectionException {
        Class<BulkRequest> responseModel = (Class<BulkRequest>)(Class<?>)BulkRequest.class;

        return this.request("post", this.resolvePath("/products/bulk-requests"), null, null, responseModel, model);
    }

    
    public BulkRequest createBulkRequest(CreateBulkRequest model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<BulkRequest> responseModel = (Class<BulkRequest>)(Class<?>)BulkRequest.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/products/bulk-requests"), query, null, responseModel, model);
    }

    
    public BulkRequest createCompositeProductBulkRequest(CreateBulkRequest model) throws ApiErrorException, ConnectionException {
        Class<BulkRequest> responseModel = (Class<BulkRequest>)(Class<?>)BulkRequest.class;

        return this.request("post", this.resolvePath("/products/composite/bulk-requests"), null, null, responseModel, model);
    }

    
    public BulkRequest createCompositeProductBulkRequest(CreateBulkRequest model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<BulkRequest> responseModel = (Class<BulkRequest>)(Class<?>)BulkRequest.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/products/composite/bulk-requests"), query, null, responseModel, model);
    }

    
    public void unlockAttributeGroup(Identifier productIdentifier, String attributeGroupName) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/products/%s/attributes/%s/unlock", productIdentifier, attributeGroupName), null, null, null);
    }

    
    public void unlockAttributeGroup(Identifier productIdentifier, String attributeGroupName, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("post", this.resolvePath("/products/%s/attributes/%s/unlock", productIdentifier, attributeGroupName), query, null, null);
    }

}
