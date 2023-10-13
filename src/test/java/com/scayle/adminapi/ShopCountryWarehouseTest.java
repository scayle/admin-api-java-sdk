package com.scayle.adminapi;

import com.scayle.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class ShopCountryWarehouseTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCountryWarehouseCreateRequest.json");
        ShopCountryWarehouse requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopCountryWarehouse.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ShopCountryWarehouse responseEntity = this.api.shopCountryWarehouses().create("acme", "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryWarehouseCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCountryWarehouseUpdateRequest.json");
        ShopCountryWarehouse requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopCountryWarehouse.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ShopCountryWarehouse responseEntity = this.api.shopCountryWarehouses().update("acme", "acme", Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryWarehouseUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.shopCountryWarehouses().delete("acme", "acme", Identifier.fromId(1), options);

    }

}
