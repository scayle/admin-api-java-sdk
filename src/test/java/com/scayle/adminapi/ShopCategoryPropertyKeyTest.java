package com.scayle.adminapi;

import com.scayle.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class ShopCategoryPropertyKeyTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCategoryPropertyKeyCreateRequest.json");
        ShopCategoryPropertyKey requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopCategoryPropertyKey.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ShopCategoryPropertyKey responseEntity = this.api.shopCategoryPropertyKeys().create(requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryPropertyKeyCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGet() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ShopCategoryPropertyKey responseEntity = this.api.shopCategoryPropertyKeys().get("acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryPropertyKeyGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<ShopCategoryPropertyKey> responseEntity = this.api.shopCategoryPropertyKeys().all(options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryPropertyKeyAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ShopCategoryPropertyKey entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCategoryPropertyKeyUpdateRequest.json");
        ShopCategoryPropertyKey requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopCategoryPropertyKey.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ShopCategoryPropertyKey responseEntity = this.api.shopCategoryPropertyKeys().update("acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryPropertyKeyUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.shopCategoryPropertyKeys().delete("acme", options);

    }

}
