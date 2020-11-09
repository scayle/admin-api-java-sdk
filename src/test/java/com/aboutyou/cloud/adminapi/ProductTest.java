package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("unchecked")
public class ProductTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductCreateRequest.json");
        Product requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Product.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Product responseEntity = this.api.products().create(requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGet() throws Exception {

    Product responseEntity = this.api.products().get(Identifier.fromId(1),  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

    ApiCollection<Product> responseEntity = this.api.products().all( null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Product entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductUpdateRequest.json");
        Product requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Product.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Product responseEntity = this.api.products().update(Identifier.fromId(1), requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

    this.api.products().delete(Identifier.fromId(1),  null);

    }

}