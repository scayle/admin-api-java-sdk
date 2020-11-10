package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class ProductImageTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductImageCreateRequest.json");
        ProductImage requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ProductImage.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    ProductImage responseEntity = this.api.productImages().create(Identifier.fromId(1), requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductImageCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

    ApiCollection<ProductImage> responseEntity = this.api.productImages().all(Identifier.fromId(1),  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductImageAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ProductImage entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testUpdatePosition() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductImageUpdatePositionRequest.json");
        ProductImagePosition requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ProductImagePosition.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    ProductImage responseEntity = this.api.productImages().updatePosition(Identifier.fromId(1), Identifier.fromId(1), requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductImageUpdatePositionResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

    this.api.productImages().delete(Identifier.fromId(1), Identifier.fromId(1),  null);

    }

}