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

    public Campaign create(Campaign model) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.request("post", this.resolvePath("/campaigns"), null, responseModel, model);
    }

    public Campaign create(Campaign model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.request("post", this.resolvePath("/campaigns"), options, responseModel, model);
    }

    public ApiCollection<Campaign> all() throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.requestCollection("get", this.resolvePath("/campaigns"), null, responseModel);
    }

    public ApiCollection<Campaign> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.requestCollection("get", this.resolvePath("/campaigns"), options, responseModel);
    }

    public Campaign get(Integer campaignId) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.request("get", this.resolvePath("/campaigns/%s", campaignId), null, responseModel);
    }

    public Campaign get(Integer campaignId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.request("get", this.resolvePath("/campaigns/%s", campaignId), options, responseModel);
    }

    public Campaign update(Integer campaignId, Campaign model) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.request("put", this.resolvePath("/campaigns/%s", campaignId), null, responseModel, model);
    }

    public Campaign update(Integer campaignId, Campaign model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<Campaign> responseModel = (Class<Campaign>)(Class<?>)Campaign.class;

        return this.request("put", this.resolvePath("/campaigns/%s", campaignId), options, responseModel, model);
    }

    public void delete(Integer campaignId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/campaigns/%s", campaignId), null, null);
    }

    public void delete(Integer campaignId, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/campaigns/%s", campaignId), options, null);
    }

    public void updateOrCreateVariantReductions(Integer campaignId, List<ProductVariantCampaignReduction> model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/campaigns/%s/reductions/variants", campaignId), null, null, model);
    }

    public void updateOrCreateVariantReductions(Integer campaignId, List<ProductVariantCampaignReduction> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/campaigns/%s/reductions/variants", campaignId), options, null, model);
    }

    public void updateOrCreateProductReductions(Integer campaignId, List<ProductCampaignReduction> model) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/campaigns/%s/reductions/products", campaignId), null, null, model);
    }

    public void updateOrCreateProductReductions(Integer campaignId, List<ProductCampaignReduction> model, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("post", this.resolvePath("/campaigns/%s/reductions/products", campaignId), options, null, model);
    }

    public ApiCollection<ProductVariantCampaignReduction> allReductions(Integer campaignId) throws ApiErrorException, ConnectionException {
        Class<ProductVariantCampaignReduction> responseModel = (Class<ProductVariantCampaignReduction>)(Class<?>)ProductVariantCampaignReduction.class;

        return this.requestCollection("get", this.resolvePath("/campaigns/%s/reductions/variants", campaignId), null, responseModel);
    }

    public ApiCollection<ProductVariantCampaignReduction> allReductions(Integer campaignId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<ProductVariantCampaignReduction> responseModel = (Class<ProductVariantCampaignReduction>)(Class<?>)ProductVariantCampaignReduction.class;

        return this.requestCollection("get", this.resolvePath("/campaigns/%s/reductions/variants", campaignId), options, responseModel);
    }

    public void deleteReductions(Integer campaignId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/campaigns/%s/reductions", campaignId), null, null);
    }

    public void deleteReductions(Integer campaignId, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/campaigns/%s/reductions", campaignId), options, null);
    }

}