package com.scayle.adminapi;

import com.scayle.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class RedirectTest extends BaseApiTest {

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<Redirect> responseEntity = this.api.redirects().all("acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/RedirectAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Redirect entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testCreateOrUpdateBulk() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/RedirectCreateOrUpdateBulkRequest.json");
        List<Redirect> requestEntity = this.jsonSerializer.unserializeList(expectedRequestJson, Redirect.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<Redirect> responseEntity = this.api.redirects().createOrUpdateBulk("acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/RedirectCreateOrUpdateBulkResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Redirect entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testDeleteBulk() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/RedirectDeleteBulkRequest.json");
        List<Redirect> requestEntity = this.jsonSerializer.unserializeList(expectedRequestJson, Redirect.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        this.api.redirects().deleteBulk("acme", requestEntity, options);

    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.redirects().delete("acme", 1, options);

    }

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/RedirectCreateRequest.json");
        Redirect requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Redirect.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Redirect responseEntity = this.api.redirects().create("acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/RedirectCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/RedirectUpdateRequest.json");
        Redirect requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Redirect.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Redirect responseEntity = this.api.redirects().update("acme", 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/RedirectUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}
