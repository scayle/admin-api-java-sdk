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
public class EmailKeyTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/EmailKeyCreateRequest.json");
        EmailKey requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, EmailKey.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        EmailKey responseEntity = this.api.emailKeys().create("acme", "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/EmailKeyCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/EmailKeyUpdateRequest.json");
        EmailKey requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, EmailKey.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        EmailKey responseEntity = this.api.emailKeys().update("acme", "acme", 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/EmailKeyUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.emailKeys().delete("acme", "acme", 1, options);

    }

    @Test
    public void testGet() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        EmailKey responseEntity = this.api.emailKeys().get("acme", "acme", 1, options);

        String expectedResponseJson = this.loadFixture("/fixtures/EmailKeyGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<EmailKey> responseEntity = this.api.emailKeys().all("acme", "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/EmailKeyAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (EmailKey entity : responseEntity.getEntities()) {
        }
    }

}
