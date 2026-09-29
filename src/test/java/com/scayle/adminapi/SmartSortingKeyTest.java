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
public class SmartSortingKeyTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/SmartSortingKeyCreateRequest.json");
        SmartSortingKey requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, SmartSortingKey.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        SmartSortingKey responseEntity = this.api.smartSortingKeys().create(requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/SmartSortingKeyCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGet() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        SmartSortingKey responseEntity = this.api.smartSortingKeys().get("key=summer-priority", options);

        String expectedResponseJson = this.loadFixture("/fixtures/SmartSortingKeyGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<SmartSortingKey> responseEntity = this.api.smartSortingKeys().all(options);

        String expectedResponseJson = this.loadFixture("/fixtures/SmartSortingKeyAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (SmartSortingKey entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/SmartSortingKeyUpdateRequest.json");
        SmartSortingKey requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, SmartSortingKey.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        SmartSortingKey responseEntity = this.api.smartSortingKeys().update("key=summer-priority", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/SmartSortingKeyUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.smartSortingKeys().delete("key=summer-priority", options);

    }

}
