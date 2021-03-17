package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
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

        return this.request("post", this.resolvePath("/shops/%s/campaigns", shopKey), null, responseModel, model);
    }

    public Campaign create(String shopKey, Campaign model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.request("post", this.resolvePath("/shops/%s/campaigns", shopKey), options, responseModel, model);
    }

    public ApiCollection<Campaign> all(String shopKey) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/campaigns", shopKey), null, responseModel);
    }

    public ApiCollection<Campaign> all(String shopKey, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/campaigns", shopKey), options, responseModel);
    }

    public Campaign get(String shopKey, Integer campaignId) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.request("get", this.resolvePath("/shops/%s/campaigns/%s", shopKey, campaignId), null, responseModel);
    }

    public Campaign get(String shopKey, Integer campaignId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.request("get", this.resolvePath("/shops/%s/campaigns/%s", shopKey, campaignId), options, responseModel);
    }

    public Campaign update(String shopKey, Integer campaignId, Campaign model) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.request("put", this.resolvePath("/shops/%s/campaigns/%s", shopKey, campaignId), null, responseModel, model);
    }

    public Campaign update(String shopKey, Integer campaignId, Campaign model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.request("put", this.resolvePath("/shops/%s/campaigns/%s", shopKey, campaignId), options, responseModel, model);
    }

    public void delete(String shopKey, Integer campaignId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/campaigns/%s", shopKey, campaignId), null, null);
    }

    public void delete(String shopKey, Integer campaignId, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/campaigns/%s", shopKey, campaignId), options, null);
    }

    public void updateOrCreateVariantReductions(String shopKey, Integer campaignId, List<ProductVariantCampaignReduction> model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/shops/%s/campaigns/%s/reductions/variants", shopKey, campaignId), null, null, model);
    }

    public void updateOrCreateVariantReductions(String shopKey, Integer campaignId, List<ProductVariantCampaignReduction> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/shops/%s/campaigns/%s/reductions/variants", shopKey, campaignId), options, null, model);
    }

    public void updateOrCreateProductReductions(String shopKey, Integer campaignId, List<ProductCampaignReduction> model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/shops/%s/campaigns/%s/reductions/products", shopKey, campaignId), null, null, model);
    }

    public void updateOrCreateProductReductions(String shopKey, Integer campaignId, List<ProductCampaignReduction> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/shops/%s/campaigns/%s/reductions/products", shopKey, campaignId), options, null, model);
    }

    public ApiCollection<ProductVariantCampaignReduction> allReductions(String shopKey, Integer campaignId) throws ApiErrorException, ConnectionException {
        Class<ProductVariantCampaignReduction> responseModel = (Class<ProductVariantCampaignReduction>)(Class<?>)ProductVariantCampaignReduction.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/campaigns/%s/reductions/variants", shopKey, campaignId), null, responseModel);
    }

    public ApiCollection<ProductVariantCampaignReduction> allReductions(String shopKey, Integer campaignId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariantCampaignReduction> responseModel = (Class<ProductVariantCampaignReduction>)(Class<?>)ProductVariantCampaignReduction.class;

        return this.requestCollection("get", this.resolvePath("/shops/%s/campaigns/%s/reductions/variants", shopKey, campaignId), options, responseModel);
    }

    public void deleteReductions(String shopKey, Integer campaignId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/campaigns/%s/reductions", shopKey, campaignId), null, null);
    }

    public void deleteReductions(String shopKey, Integer campaignId, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/shops/%s/campaigns/%s/reductions", shopKey, campaignId), options, null);
    }

}