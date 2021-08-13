package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class ReturnItemTest extends BaseApiTest {

    @Test
    public void testSend() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ReturnItemSendRequest.json");
        List<ReturnItem> requestEntity = this.jsonSerializer.unserializeList(expectedRequestJson, ReturnItem.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    this.api.returnItems().send(requestEntity,  null);

    }

}