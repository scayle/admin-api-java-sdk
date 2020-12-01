package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class ShopCategoryTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCategoryCreateRequest.json");
        ShopCategory requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopCategory.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    ShopCategory responseEntity = this.api.shopCategories().create("1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

    ApiCollection<ShopCategory> responseEntity = this.api.shopCategories().all("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ShopCategory entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGet() throws Exception {

    ShopCategory responseEntity = this.api.shopCategories().get("1", 1,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCategoryUpdateRequest.json");
        ShopCategory requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopCategory.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    ShopCategory responseEntity = this.api.shopCategories().update("1", 1, requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

    this.api.shopCategories().delete("1", 1,  null);

    }

}