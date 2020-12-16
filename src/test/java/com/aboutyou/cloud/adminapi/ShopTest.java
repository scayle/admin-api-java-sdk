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
    public void testUpdateAssortment() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopUpdateAssortmentRequest.json");
        Assortment requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Assortment.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Assortment responseEntity = this.api.shops().updateAssortment("1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopUpdateAssortmentResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateOrCreateProperty() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopUpdateOrCreatePropertyRequest.json");
        ShopProperty requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopProperty.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    ShopProperty responseEntity = this.api.shops().updateOrCreateProperty("1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopUpdateOrCreatePropertyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteProperty() throws Exception {

    this.api.shops().deleteProperty("1", "1",  null);

    }

    @Test
    public void testGetProperty() throws Exception {

    ShopProperty responseEntity = this.api.shops().getProperty("1", "1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopGetPropertyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAllProperties() throws Exception {

    ApiCollection<ShopProperty> responseEntity = this.api.shops().allProperties("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopAllPropertiesResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ShopProperty entity : responseEntity.getEntities()) {
        }
    }

}