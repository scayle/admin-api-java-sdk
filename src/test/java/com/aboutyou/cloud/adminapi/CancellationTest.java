package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class CancellationTest extends BaseApiTest {

    @Test
    public void testSend() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CancellationSendRequest.json");
        Cancellation requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Cancellation.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        this.api.cancellations().send(requestEntity, options);

    }

}
