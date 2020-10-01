package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("unchecked")
public class ProductVariantPriceTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductVariantPriceCreateRequest.json");
        ProductVariantPrice requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ProductVariantPrice.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    ProductVariantPrice responseEntity = this.api.productVariantPrices().create(Identifier.fromId(1), Identifier.fromId(1), requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantPriceCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

    ApiCollection<ProductVariantPrice> responseEntity = this.api.productVariantPrices().all(Identifier.fromId(1), Identifier.fromId(1),  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantPriceAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ProductVariantPrice entity : responseEntity.getEntities()) {
        }
    }

}