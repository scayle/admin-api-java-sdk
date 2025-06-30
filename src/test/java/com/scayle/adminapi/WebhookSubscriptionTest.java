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
public class WebhookSubscriptionTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/WebhookSubscriptionCreateRequest.json");
        WebhookSubscription requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, WebhookSubscription.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        WebhookSubscription responseEntity = this.api.webhookSubscriptions().create(requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookSubscriptionCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/WebhookSubscriptionUpdateRequest.json");
        WebhookSubscriptionPatch requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, WebhookSubscriptionPatch.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        WebhookSubscription responseEntity = this.api.webhookSubscriptions().update(1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookSubscriptionUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGet() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        WebhookSubscription responseEntity = this.api.webhookSubscriptions().get(1, options);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookSubscriptionGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<WebhookSubscription> responseEntity = this.api.webhookSubscriptions().all(options);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookSubscriptionAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (WebhookSubscription entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.webhookSubscriptions().delete(1, options);

    }

}
