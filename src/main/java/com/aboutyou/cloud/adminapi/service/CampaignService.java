package com.aboutyou.cloud.adminapi.service;

import java.util.Map;

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

}