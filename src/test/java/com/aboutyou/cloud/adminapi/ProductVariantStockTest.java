package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("unchecked")
public class ProductVariantStockTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductVariantStockCreateRequest.json");
        ProductVariantStock requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ProductVariantStock.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    ProductVariantStock responseEntity = this.api.productVariantStocks().create("1", "1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantStockCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

    ApiCollection<ProductVariantStock> responseEntity = this.api.productVariantStocks().all("1", "1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantStockAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ProductVariantStock entity : responseEntity.getEntities()) {
        }
    }

}