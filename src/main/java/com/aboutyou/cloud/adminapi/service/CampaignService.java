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
public class CampaignService extends AbstractService {
    public CampaignService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public Campaign create(String shopKey, Campaign model) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.request("post", this.resolvePath("/shops/%s/campaigns", shopKey), null, null, responseModel, model);
    }

    
    public Campaign create(String shopKey, Campaign model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/shops/%s/campaigns", shopKey), query, null, responseModel, model);
    }

    
    public ApiCollection<Campaign> all(String shopKey) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/campaigns", shopKey), null, null, responseModel);
    }

    
    public ApiCollection<Campaign> all(String shopKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/shops/%s/campaigns", shopKey), query, null, responseModel);
    }

    
    public Campaign get(String shopKey, Integer campaignId) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.request("get", this.resolvePath("/shops/%s/campaigns/%s", shopKey, campaignId), null, null, responseModel);
    }

    
    public Campaign get(String shopKey, Integer campaignId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/shops/%s/campaigns/%s", shopKey, campaignId), query, null, responseModel);
    }

    
    public Campaign update(String shopKey, Integer campaignId, Campaign model) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.request("put", this.resolvePath("/shops/%s/campaigns/%s", shopKey, campaignId), null, null, responseModel, model);
    }

    
    public Campaign update(String shopKey, Integer campaignId, Campaign model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/shops/%s/campaigns/%s", shopKey, campaignId), query, null, responseModel, model);
    }

    
    public void delete(String shopKey, Integer campaignId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/campaigns/%s", shopKey, campaignId), null, null, null);
    }

    
    public void delete(String shopKey, Integer campaignId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/campaigns/%s", shopKey, campaignId), query, null, null);
    }

    
    public void updateOrCreateVariantReductions(String shopKey, Integer campaignId, List<ProductVariantCampaignReduction> model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/shops/%s/campaigns/%s/reductions/variants", shopKey, campaignId), null, null, null, model);
    }

    
    public void updateOrCreateVariantReductions(String shopKey, Integer campaignId, List<ProductVariantCampaignReduction> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("post", this.resolvePath("/shops/%s/campaigns/%s/reductions/variants", shopKey, campaignId), query, null, null, model);
    }

    
    public void updateOrCreateProductReductions(String shopKey, Integer campaignId, List<ProductCampaignReduction> model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/shops/%s/campaigns/%s/reductions/products", shopKey, campaignId), null, null, null, model);
    }

    
    public void updateOrCreateProductReductions(String shopKey, Integer campaignId, List<ProductCampaignReduction> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("post", this.resolvePath("/shops/%s/campaigns/%s/reductions/products", shopKey, campaignId), query, null, null, model);
    }

    
    public ApiCollection<ProductVariantCampaignReduction> allReductions(String shopKey, Integer campaignId) throws ApiErrorException, ConnectionException {
        Class<ProductVariantCampaignReduction> responseModel = (Class<ProductVariantCampaignReduction>)(Class<?>)ProductVariantCampaignReduction.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/campaigns/%s/reductions/variants", shopKey, campaignId), null, null, responseModel);
    }

    
    public ApiCollection<ProductVariantCampaignReduction> allReductions(String shopKey, Integer campaignId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariantCampaignReduction> responseModel = (Class<ProductVariantCampaignReduction>)(Class<?>)ProductVariantCampaignReduction.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/shops/%s/campaigns/%s/reductions/variants", shopKey, campaignId), query, null, responseModel);
    }

    
    public void deleteReductions(String shopKey, Integer campaignId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/campaigns/%s/reductions", shopKey, campaignId), null, null, null);
    }

    
    public void deleteReductions(String shopKey, Integer campaignId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/shops/%s/campaigns/%s/reductions", shopKey, campaignId), query, null, null);
    }

    
    public Map<String, Object> createOrUpdateCustomData(Identifier campaignId, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/campaigns/%s/custom-data", campaignId), null, null, responseModel, model);
    }

    
    public Map<String, Object> createOrUpdateCustomData(Identifier campaignId, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/campaigns/%s/custom-data", campaignId), query, null, responseModel, model);
    }

    
    public void deleteCustomData(Identifier campaignId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/campaigns/%s/custom-data", campaignId), null, null, null);
    }

    
    public void deleteCustomData(Identifier campaignId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/campaigns/%s/custom-data", campaignId), query, null, null);
    }

    
    public Map<String, Object> getCustomData(Identifier campaignId) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/campaigns/%s/custom-data", campaignId), null, null, responseModel);
    }

    
    public Map<String, Object> getCustomData(Identifier campaignId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/campaigns/%s/custom-data", campaignId), query, null, responseModel);
    }

    
    public Map<String, Object> createOrUpdateCustomDataForKey(Identifier campaignId, String key, Map<String, Object> model) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("put", this.resolvePath("/campaigns/%s/custom-data/%s", campaignId, key), null, null, responseModel, model);
    }

    
    public Map<String, Object> createOrUpdateCustomDataForKey(Identifier campaignId, String key, Map<String, Object> model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/campaigns/%s/custom-data/%s", campaignId, key), query, null, responseModel, model);
    }

    
    public void deleteCustomDataForKey(Identifier campaignId, String key) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/campaigns/%s/custom-data/%s", campaignId, key), null, null, null);
    }

    
    public void deleteCustomDataForKey(Identifier campaignId, String key, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/campaigns/%s/custom-data/%s", campaignId, key), query, null, null);
    }

    
    public Map<String, Object> getCustomDataForKey(Identifier campaignId, String key) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        return this.request("get", this.resolvePath("/campaigns/%s/custom-data/%s", campaignId, key), null, null, responseModel);
    }

    
    public Map<String, Object> getCustomDataForKey(Identifier campaignId, String key, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Map<String, Object>> responseModel = (Class<Map<String, Object>>)(Class<?>)Map.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/campaigns/%s/custom-data/%s", campaignId, key), query, null, responseModel);
    }

}
