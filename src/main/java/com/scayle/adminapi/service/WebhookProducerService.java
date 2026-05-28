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
public class WebhookProducerService extends AbstractService {
    public WebhookProducerService(HttpClient httpClient) {
        super(httpClient);
    }

    
    public ApiCollection<WebhookProducerEvent> allEvents(String producerIdentifier) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerEvent> responseModel = (Class<WebhookProducerEvent>)(Class<?>)WebhookProducerEvent.class;

        return this.requestCollection("get", this.resolvePath("/webhooks/producers/%s/events", producerIdentifier), null, null, responseModel);
    }

    
    public ApiCollection<WebhookProducerEvent> allEvents(String producerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerEvent> responseModel = (Class<WebhookProducerEvent>)(Class<?>)WebhookProducerEvent.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/webhooks/producers/%s/events", producerIdentifier), query, null, responseModel);
    }

    
    public ApiCollection<WebhookProducerSubscription> allSubscriptions(String producerIdentifier) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerSubscription> responseModel = (Class<WebhookProducerSubscription>)(Class<?>)WebhookProducerSubscription.class;

        return this.requestCollection("get", this.resolvePath("/webhooks/producers/%s/subscriptions", producerIdentifier), null, null, responseModel);
    }

    
    public ApiCollection<WebhookProducerSubscription> allSubscriptions(String producerIdentifier, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerSubscription> responseModel = (Class<WebhookProducerSubscription>)(Class<?>)WebhookProducerSubscription.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/webhooks/producers/%s/subscriptions", producerIdentifier), query, null, responseModel);
    }

    
    public WebhookProducerSubscription createSubscription(String producerIdentifier, WebhookProducerSubscription model) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerSubscription> responseModel = (Class<WebhookProducerSubscription>)(Class<?>)WebhookProducerSubscription.class;

        return this.request("post", this.resolvePath("/webhooks/producers/%s/subscriptions", producerIdentifier), null, null, responseModel, model);
    }

    
    public WebhookProducerSubscription createSubscription(String producerIdentifier, WebhookProducerSubscription model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerSubscription> responseModel = (Class<WebhookProducerSubscription>)(Class<?>)WebhookProducerSubscription.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/webhooks/producers/%s/subscriptions", producerIdentifier), query, null, responseModel, model);
    }

    
    public WebhookProducerSubscription getSubscription(String producerIdentifier, Integer subscriptionId) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerSubscription> responseModel = (Class<WebhookProducerSubscription>)(Class<?>)WebhookProducerSubscription.class;

        return this.request("get", this.resolvePath("/webhooks/producers/%s/subscriptions/%s", producerIdentifier, subscriptionId), null, null, responseModel);
    }

    
    public WebhookProducerSubscription getSubscription(String producerIdentifier, Integer subscriptionId, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerSubscription> responseModel = (Class<WebhookProducerSubscription>)(Class<?>)WebhookProducerSubscription.class;

        Map<String, Object> query = options.all();

        return this.request("get", this.resolvePath("/webhooks/producers/%s/subscriptions/%s", producerIdentifier, subscriptionId), query, null, responseModel);
    }

    
    public WebhookProducerSubscription updateSubscription(String producerIdentifier, Integer subscriptionId, WebhookProducerSubscription model) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerSubscription> responseModel = (Class<WebhookProducerSubscription>)(Class<?>)WebhookProducerSubscription.class;

        return this.request("put", this.resolvePath("/webhooks/producers/%s/subscriptions/%s", producerIdentifier, subscriptionId), null, null, responseModel, model);
    }

    
    public WebhookProducerSubscription updateSubscription(String producerIdentifier, Integer subscriptionId, WebhookProducerSubscription model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerSubscription> responseModel = (Class<WebhookProducerSubscription>)(Class<?>)WebhookProducerSubscription.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/webhooks/producers/%s/subscriptions/%s", producerIdentifier, subscriptionId), query, null, responseModel, model);
    }

    
    public void deleteSubscription(String producerIdentifier, Integer subscriptionId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/webhooks/producers/%s/subscriptions/%s", producerIdentifier, subscriptionId), null, null, null);
    }

    
    public void deleteSubscription(String producerIdentifier, Integer subscriptionId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/webhooks/producers/%s/subscriptions/%s", producerIdentifier, subscriptionId), query, null, null);
    }

}
