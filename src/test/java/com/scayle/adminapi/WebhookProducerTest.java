package com.scayle.adminapi;

import com.scayle.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class WebhookProducerTest extends BaseApiTest {

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<WebhookProducer> responseEntity = this.api.webhookProducers().all(options);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookProducerAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (WebhookProducer entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/WebhookProducerCreateRequest.json");
        WebhookProducerRegistration requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, WebhookProducerRegistration.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        WebhookProducerRegistration responseEntity = this.api.webhookProducers().create(requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookProducerCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAllEvents() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<WebhookProducerEvent> responseEntity = this.api.webhookProducers().allEvents("acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookProducerAllEventsResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (WebhookProducerEvent entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testCreateEvent() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/WebhookProducerCreateEventRequest.json");
        WebhookProducerEvent requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, WebhookProducerEvent.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        WebhookProducerEvent responseEntity = this.api.webhookProducers().createEvent("acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookProducerCreateEventResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateEvent() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/WebhookProducerUpdateEventRequest.json");
        WebhookProducerEvent requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, WebhookProducerEvent.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        WebhookProducerEvent responseEntity = this.api.webhookProducers().updateEvent("acme", 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookProducerUpdateEventResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteEvent() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.webhookProducers().deleteEvent("acme", 1, options);

    }

    @Test
    public void testCreateWebhook() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/WebhookProducerCreateWebhookRequest.json");
        WebhookProducerWebhook requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, WebhookProducerWebhook.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        WebhookProducerWebhookIdentity responseEntity = this.api.webhookProducers().createWebhook("acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookProducerCreateWebhookResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAllSubscriptions() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<WebhookProducerSubscription> responseEntity = this.api.webhookProducers().allSubscriptions("acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookProducerAllSubscriptionsResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (WebhookProducerSubscription entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testCreateSubscription() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/WebhookProducerCreateSubscriptionRequest.json");
        WebhookProducerSubscription requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, WebhookProducerSubscription.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        WebhookProducerSubscription responseEntity = this.api.webhookProducers().createSubscription("acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookProducerCreateSubscriptionResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGetSubscription() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        WebhookProducerSubscription responseEntity = this.api.webhookProducers().getSubscription("acme", 1, options);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookProducerGetSubscriptionResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateSubscription() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/WebhookProducerUpdateSubscriptionRequest.json");
        WebhookProducerSubscription requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, WebhookProducerSubscription.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        WebhookProducerSubscription responseEntity = this.api.webhookProducers().updateSubscription("acme", 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookProducerUpdateSubscriptionResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteSubscription() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.webhookProducers().deleteSubscription("acme", 1, options);

    }

}
