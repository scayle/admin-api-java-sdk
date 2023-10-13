package com.scayle.adminapi;

import com.scayle.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class CustomDataConfigTest extends BaseApiTest {

    @Test
    public void testGet() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        CustomDataConfig responseEntity = this.api.customDataConfigs().get("acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomDataConfigGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CustomDataConfigCreateRequest.json");
        CustomDataConfig requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CustomDataConfig.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        CustomDataConfig responseEntity = this.api.customDataConfigs().create("acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomDataConfigCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CustomDataConfigUpdateRequest.json");
        CustomDataConfig requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CustomDataConfig.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        CustomDataConfig responseEntity = this.api.customDataConfigs().update("acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomDataConfigUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.customDataConfigs().delete("acme", options);

    }

}
