package com.aboutyou.cloud.adminapi.service;

import java.util.Map;
import java.util.List;

import com.aboutyou.cloud.adminapi.exception.ApiErrorException;
import com.aboutyou.cloud.adminapi.exception.ConnectionException;
import com.aboutyou.cloud.adminapi.http.HttpClient;
import com.aboutyou.cloud.adminapi.model.*;

@SuppressWarnings("unchecked")
public class WebhookSubscriptionService extends AbstractService {
    public WebhookSubscriptionService(HttpClient httpClient) {
        super(httpClient);
    }

    public WebhookSubscription create(WebhookSubscription model) throws ApiErrorException, ConnectionException {
        Class<WebhookSubscription> responseModel = (Class<WebhookSubscription>)(Class<?>)WebhookSubscription.class;

        return this.request("post", this.resolvePath("/webhooks/subscriptions"), null, responseModel, model);
    }

    public WebhookSubscription create(WebhookSubscription model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookSubscription> responseModel = (Class<WebhookSubscription>)(Class<?>)WebhookSubscription.class;

        return this.request("post", this.resolvePath("/webhooks/subscriptions"), options, responseModel, model);
    }

    public WebhookSubscription get(Integer subscriptionId) throws ApiErrorException, ConnectionException {
        Class<WebhookSubscription> responseModel = (Class<WebhookSubscription>)(Class<?>)WebhookSubscription.class;

        return this.request("get", this.resolvePath("/webhooks/subscriptions/%s", subscriptionId), null, responseModel);
    }

    public WebhookSubscription get(Integer subscriptionId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookSubscription> responseModel = (Class<WebhookSubscription>)(Class<?>)WebhookSubscription.class;

        return this.request("get", this.resolvePath("/webhooks/subscriptions/%s", subscriptionId), options, responseModel);
    }

    public ApiCollection<WebhookSubscription> all() throws ApiErrorException, ConnectionException {
        Class<WebhookSubscription> responseModel = (Class<WebhookSubscription>)(Class<?>)WebhookSubscription.class;

        return this.requestCollection("get", this.resolvePath("/webhooks/subscriptions"), null, responseModel);
    }

    public ApiCollection<WebhookSubscription> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookSubscription> responseModel = (Class<WebhookSubscription>)(Class<?>)WebhookSubscription.class;

        return this.requestCollection("get", this.resolvePath("/webhooks/subscriptions"), options, responseModel);
    }

    public void delete(Integer subscriptionId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/webhooks/subscriptions/%s", subscriptionId), null, null);
    }

    public void delete(Integer subscriptionId, ApiOptions options) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/webhooks/subscriptions/%s", subscriptionId), options, null);
    }

}