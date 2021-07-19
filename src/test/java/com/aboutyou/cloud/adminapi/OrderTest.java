package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class OrderTest extends BaseApiTest {

    @Test
    public void testGet() throws Exception {

    Order responseEntity = this.api.orders().get("1", "1", Identifier.fromId(1),  null);

        String expectedResponseJson = this.loadFixture("/fixtures/OrderGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateReferenceKey() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/OrderUpdateReferenceKeyRequest.json");
        OrderReferenceKey requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, OrderReferenceKey.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Order responseEntity = this.api.orders().updateReferenceKey("1", "1", 1, requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/OrderUpdateReferenceKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGetStatus() throws Exception {

    OrderStatus responseEntity = this.api.orders().getStatus("1", "1", Identifier.fromId(1),  null);

        String expectedResponseJson = this.loadFixture("/fixtures/OrderGetStatusResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}