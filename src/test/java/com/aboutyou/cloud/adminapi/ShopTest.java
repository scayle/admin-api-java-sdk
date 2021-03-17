package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class ShopTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCreateRequest.json");
        Shop requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Shop.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Shop responseEntity = this.api.shops().create(requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

    ApiCollection<Shop> responseEntity = this.api.shops().all( null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Shop entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGet() throws Exception {

    Shop responseEntity = this.api.shops().get("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopUpdateRequest.json");
        Shop requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Shop.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Shop responseEntity = this.api.shops().update("1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateOrUpdateCustomData() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCreateOrUpdateCustomDataRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Map<String, Object> responseEntity = this.api.shops().createOrUpdateCustomData("1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCreateOrUpdateCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomData() throws Exception {

    this.api.shops().deleteCustomData("1",  null);

    }

    @Test
    public void testGetCustomData() throws Exception {

    Map<String, Object> responseEntity = this.api.shops().getCustomData("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopGetCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateOrUpdateCustomDataForKey() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCreateOrUpdateCustomDataForKeyRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Map<String, Object> responseEntity = this.api.shops().createOrUpdateCustomDataForKey("1", "1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCreateOrUpdateCustomDataForKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomDataForKey() throws Exception {

    this.api.shops().deleteCustomDataForKey("1", "1",  null);

    }

    @Test
    public void testGetCustomDataForKey() throws Exception {

    Map<String, Object> responseEntity = this.api.shops().getCustomDataForKey("1", "1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopGetCustomDataForKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}