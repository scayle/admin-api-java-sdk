package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class WebhookEventTest extends BaseApiTest {

    @Test
    public void testAll() throws Exception {

    ApiCollection<WebhookEvent> responseEntity = this.api.webhookEvents().all( null);

        String expectedResponseJson = this.loadFixture("/fixtures/WebhookEventAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (WebhookEvent entity : responseEntity.getEntities()) {
        }
    }

}