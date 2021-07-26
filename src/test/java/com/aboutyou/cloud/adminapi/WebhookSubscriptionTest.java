package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

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

    WebhookSubscription responseEntity = this.api.webhookSubscriptions().create(requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookSubscriptionCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGet() throws Exception {

    WebhookSubscription responseEntity = this.api.webhookSubscriptions().get(1,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookSubscriptionGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

    ApiCollection<WebhookSubscription> responseEntity = this.api.webhookSubscriptions().all( null);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookSubscriptionAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (WebhookSubscription entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testDelete() throws Exception {

    this.api.webhookSubscriptions().delete(1,  null);

    }

}