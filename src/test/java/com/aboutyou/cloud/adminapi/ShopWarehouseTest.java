package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class ShopWarehouseTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopWarehouseCreateRequest.json");
        ShopWarehouse requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopWarehouse.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    ShopWarehouse responseEntity = this.api.shopWarehouses().create("1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopWarehouseCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopWarehouseUpdateRequest.json");
        ShopWarehouse requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopWarehouse.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    ShopWarehouse responseEntity = this.api.shopWarehouses().update("1", Identifier.fromId(1), requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopWarehouseUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

    this.api.shopWarehouses().delete("1", Identifier.fromId(1),  null);

    }

}