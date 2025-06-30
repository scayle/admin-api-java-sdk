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
public class WebhookSubscriptionService extends AbstractService {
    public WebhookSubscriptionService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public WebhookSubscription create(WebhookSubscription model) throws ApiErrorException, ConnectionException {
        Class<WebhookSubscription> responseModel = (Class<WebhookSubscription>)(Class<?>)WebhookSubscription.class;

        return this.request("post", this.resolvePath("/webhooks/subscriptions"), null, null, responseModel, model);
    }

    
    public WebhookSubscription create(WebhookSubscription model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookSubscription> responseModel = (Class<WebhookSubscription>)(Class<?>)WebhookSubscription.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/webhooks/subscriptions"), query, null, responseModel, model);
    }

    
    public WebhookSubscription update(Integer subscriptionId, WebhookSubscriptionPatch model) throws ApiErrorException, ConnectionException {
        Class<WebhookSubscription> responseModel = (Class<WebhookSubscription>)(Class<?>)WebhookSubscription.class;

        return this.request("patch", this.resolvePath("/webhooks/subscriptions/%s", subscriptionId), null, null, responseModel, model);
    }

    
    public WebhookSubscription update(Integer subscriptionId, WebhookSubscriptionPatch model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookSubscription> responseModel = (Class<WebhookSubscription>)(Class<?>)WebhookSubscription.class;

        Map<String, Object> query = options.all();

        return this.request("patch", this.resolvePath("/webhooks/subscriptions/%s", subscriptionId), query, null, responseModel, model);
    }

    
    public WebhookSubscription get(Integer subscriptionId) throws ApiErrorException, ConnectionException {
        Class<WebhookSubscription> responseModel = (Class<WebhookSubscription>)(Class<?>)WebhookSubscription.class;

        return this.request("get", this.resolvePath("/webhooks/subscriptions/%s", subscriptionId), null, null, responseModel);
    }

    
    public WebhookSubscription get(Integer subscriptionId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookSubscription> responseModel = (Class<WebhookSubscription>)(Class<?>)WebhookSubscription.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/webhooks/subscriptions/%s", subscriptionId), query, null, responseModel);
    }

    
    public ApiCollection<WebhookSubscription> all() throws ApiErrorException, ConnectionException {
        Class<WebhookSubscription> responseModel = (Class<WebhookSubscription>)(Class<?>)WebhookSubscription.class;

        return this.requestCollection("get", this.resolvePath("/webhooks/subscriptions"), null, null, responseModel);
    }

    
    public ApiCollection<WebhookSubscription> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookSubscription> responseModel = (Class<WebhookSubscription>)(Class<?>)WebhookSubscription.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/webhooks/subscriptions"), query, null, responseModel);
    }

    
    public void delete(Integer subscriptionId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/webhooks/subscriptions/%s", subscriptionId), null, null, null);
    }

    
    public void delete(Integer subscriptionId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/webhooks/subscriptions/%s", subscriptionId), query, null, null);
    }

}
