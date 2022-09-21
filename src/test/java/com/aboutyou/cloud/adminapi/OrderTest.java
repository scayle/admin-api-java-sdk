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

        ApiOptions options = ApiOptions.builder().build();
        Order responseEntity = this.api.orders().get("acme", "acme", Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/OrderGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<Order> responseEntity = this.api.orders().all("acme", "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/OrderAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Order entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testUpdateReferenceKey() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/OrderUpdateReferenceKeyRequest.json");
        OrderReferenceKey requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, OrderReferenceKey.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Order responseEntity = this.api.orders().updateReferenceKey("acme", "acme", 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/OrderUpdateReferenceKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGetStatus() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        OrderStatus responseEntity = this.api.orders().getStatus("acme", "acme", Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/OrderGetStatusResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}
