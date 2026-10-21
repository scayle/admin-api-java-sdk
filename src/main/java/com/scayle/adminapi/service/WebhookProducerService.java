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

    
    public ApiCollection<WebhookProducer> all() throws ApiErrorException, ConnectionException {
        Class<WebhookProducer> responseModel = (Class<WebhookProducer>)(Class<?>)WebhookProducer.class;

        return this.requestCollection("get", this.resolvePath("/webhooks/producers"), null, null, responseModel);
    }

    
    public ApiCollection<WebhookProducer> all(ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookProducer> responseModel = (Class<WebhookProducer>)(Class<?>)WebhookProducer.class;

        Map<String, Object> query = options.all();

        return this.requestCollection("get", this.resolvePath("/webhooks/producers"), query, null, responseModel);
    }

    
    public WebhookProducerRegistration create(WebhookProducerRegistration model) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerRegistration> responseModel = (Class<WebhookProducerRegistration>)(Class<?>)WebhookProducerRegistration.class;

        return this.request("post", this.resolvePath("/webhooks/producers"), null, null, responseModel, model);
    }

    
    public WebhookProducerRegistration create(WebhookProducerRegistration model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerRegistration> responseModel = (Class<WebhookProducerRegistration>)(Class<?>)WebhookProducerRegistration.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/webhooks/producers"), query, null, responseModel, model);
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

    
    public WebhookProducerEvent createEvent(String producerIdentifier, WebhookProducerEvent model) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerEvent> responseModel = (Class<WebhookProducerEvent>)(Class<?>)WebhookProducerEvent.class;

        return this.request("post", this.resolvePath("/webhooks/producers/%s/events", producerIdentifier), null, null, responseModel, model);
    }

    
    public WebhookProducerEvent createEvent(String producerIdentifier, WebhookProducerEvent model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerEvent> responseModel = (Class<WebhookProducerEvent>)(Class<?>)WebhookProducerEvent.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/webhooks/producers/%s/events", producerIdentifier), query, null, responseModel, model);
    }

    
    public WebhookProducerEvent updateEvent(String producerIdentifier, Integer eventId, WebhookProducerEvent model) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerEvent> responseModel = (Class<WebhookProducerEvent>)(Class<?>)WebhookProducerEvent.class;

        return this.request("put", this.resolvePath("/webhooks/producers/%s/events/%s", producerIdentifier, eventId), null, null, responseModel, model);
    }

    
    public WebhookProducerEvent updateEvent(String producerIdentifier, Integer eventId, WebhookProducerEvent model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerEvent> responseModel = (Class<WebhookProducerEvent>)(Class<?>)WebhookProducerEvent.class;

        Map<String, Object> query = options.all();

        return this.request("put", this.resolvePath("/webhooks/producers/%s/events/%s", producerIdentifier, eventId), query, null, responseModel, model);
    }

    
    public void deleteEvent(String producerIdentifier, Integer eventId) throws ApiErrorException, ConnectionException {

        this.request("delete", this.resolvePath("/webhooks/producers/%s/events/%s", producerIdentifier, eventId), null, null, null);
    }

    
    public void deleteEvent(String producerIdentifier, Integer eventId, ApiOptions options) throws ApiErrorException, ConnectionException {

        Map<String, Object> query = options.all();

        this.request("delete", this.resolvePath("/webhooks/producers/%s/events/%s", producerIdentifier, eventId), query, null, null);
    }

    
    public WebhookProducerWebhookIdentity createWebhook(String producerIdentifier, WebhookProducerWebhook model) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerWebhookIdentity> responseModel = (Class<WebhookProducerWebhookIdentity>)(Class<?>)WebhookProducerWebhookIdentity.class;

        return this.request("post", this.resolvePath("/webhooks/producers/%s/webhooks", producerIdentifier), null, null, responseModel, model);
    }

    
    public WebhookProducerWebhookIdentity createWebhook(String producerIdentifier, WebhookProducerWebhook model, ApiOptions options) throws ApiErrorException, ConnectionException {
        Class<WebhookProducerWebhookIdentity> responseModel = (Class<WebhookProducerWebhookIdentity>)(Class<?>)WebhookProducerWebhookIdentity.class;

        Map<String, Object> query = options.all();

        return this.request("post", this.resolvePath("/webhooks/producers/%s/webhooks", producerIdentifier), query, null, responseModel, model);
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
