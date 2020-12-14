package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class ShopPropertyKeyTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopPropertyKeyCreateRequest.json");
        ShopPropertyKey requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopPropertyKey.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    ShopPropertyKey responseEntity = this.api.shopPropertyKeys().create(requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopPropertyKeyCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGet() throws Exception {

    ShopPropertyKey responseEntity = this.api.shopPropertyKeys().get("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopPropertyKeyGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

    ApiCollection<ShopPropertyKey> responseEntity = this.api.shopPropertyKeys().all( null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopPropertyKeyAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ShopPropertyKey entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopPropertyKeyUpdateRequest.json");
        ShopPropertyKey requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopPropertyKey.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    ShopPropertyKey responseEntity = this.api.shopPropertyKeys().update("1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopPropertyKeyUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

    this.api.shopPropertyKeys().delete("1",  null);

    }

}