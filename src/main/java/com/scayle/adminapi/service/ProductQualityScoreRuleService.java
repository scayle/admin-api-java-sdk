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
public class ProductQualityScoreRuleService extends AbstractService {
    public ProductQualityScoreRuleService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ApiCollection<ProductQualityScoreRule> all() throws ApiErrorException, ConnectionException {
        Class<ProductQualityScoreRule> responseModel = (Class<ProductQualityScoreRule>)(Class<?>)ProductQualityScoreRule.class;

        return this.requestCollection("get", this.resolvePath("/product-quality-scores/rules"), null, null, responseModel);
    }

    
    public ApiCollection<ProductQualityScoreRule> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductQualityScoreRule> responseModel = (Class<ProductQualityScoreRule>)(Class<?>)ProductQualityScoreRule.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/product-quality-scores/rules"), query, null, responseModel);
    }

    
    public ProductQualityScoreRule create(ProductQualityScoreRuleUpdateOrCreateRequest model) throws ApiErrorException, ConnectionException {
        Class<ProductQualityScoreRule> responseModel = (Class<ProductQualityScoreRule>)(Class<?>)ProductQualityScoreRule.class;

        return this.request("post", this.resolvePath("/product-quality-scores/rules"), null, null, responseModel, model);
    }

    
    public ProductQualityScoreRule create(ProductQualityScoreRuleUpdateOrCreateRequest model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductQualityScoreRule> responseModel = (Class<ProductQualityScoreRule>)(Class<?>)ProductQualityScoreRule.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/product-quality-scores/rules"), query, null, responseModel, model);
    }

    
    public ProductQualityScoreRule get(Integer ruleId) throws ApiErrorException, ConnectionException {
        Class<ProductQualityScoreRule> responseModel = (Class<ProductQualityScoreRule>)(Class<?>)ProductQualityScoreRule.class;

        return this.request("get", this.resolvePath("/product-quality-scores/rules/%s", ruleId), null, null, responseModel);
    }

    
    public ProductQualityScoreRule get(Integer ruleId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductQualityScoreRule> responseModel = (Class<ProductQualityScoreRule>)(Class<?>)ProductQualityScoreRule.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/product-quality-scores/rules/%s", ruleId), query, null, responseModel);
    }

    
    public ProductQualityScoreRule update(Integer ruleId, ProductQualityScoreRuleUpdateOrCreateRequest model) throws ApiErrorException, ConnectionException {
        Class<ProductQualityScoreRule> responseModel = (Class<ProductQualityScoreRule>)(Class<?>)ProductQualityScoreRule.class;

        return this.request("put", this.resolvePath("/product-quality-scores/rules/%s", ruleId), null, null, responseModel, model);
    }

    
    public ProductQualityScoreRule update(Integer ruleId, ProductQualityScoreRuleUpdateOrCreateRequest model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductQualityScoreRule> responseModel = (Class<ProductQualityScoreRule>)(Class<?>)ProductQualityScoreRule.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/product-quality-scores/rules/%s", ruleId), query, null, responseModel, model);
    }

    
    public void delete(Integer ruleId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/product-quality-scores/rules/%s", ruleId), null, null, null);
    }

    
    public void delete(Integer ruleId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/product-quality-scores/rules/%s", ruleId), query, null, null);
    }

    
    public ProductQualityScoreRule attach(Integer ruleId, Integer categoryId) throws ApiErrorException, ConnectionException {
        Class<ProductQualityScoreRule> responseModel = (Class<ProductQualityScoreRule>)(Class<?>)ProductQualityScoreRule.class;

        return this.request("put", this.resolvePath("/product-quality-scores/rules/%s/categories/%s", ruleId, categoryId), null, null, responseModel);
    }

    
    public ProductQualityScoreRule attach(Integer ruleId, Integer categoryId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductQualityScoreRule> responseModel = (Class<ProductQualityScoreRule>)(Class<?>)ProductQualityScoreRule.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/product-quality-scores/rules/%s/categories/%s", ruleId, categoryId), query, null, responseModel);
    }

    
    public void detach(Integer ruleId, Integer categoryId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/product-quality-scores/rules/%s/categories/%s", ruleId, categoryId), null, null, null);
    }

    
    public void detach(Integer ruleId, Integer categoryId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/product-quality-scores/rules/%s/categories/%s", ruleId, categoryId), query, null, null);
    }

    
    public ProductQualityScoreCategory getCategory(Integer categoryId) throws ApiErrorException, ConnectionException {
        Class<ProductQualityScoreCategory> responseModel = (Class<ProductQualityScoreCategory>)(Class<?>)ProductQualityScoreCategory.class;

        return this.request("get", this.resolvePath("/product-quality-scores/categories/%s", categoryId), null, null, responseModel);
    }

    
    public ProductQualityScoreCategory getCategory(Integer categoryId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductQualityScoreCategory> responseModel = (Class<ProductQualityScoreCategory>)(Class<?>)ProductQualityScoreCategory.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/product-quality-scores/categories/%s", categoryId), query, null, responseModel);
    }

}
