package com.scayle.adminapi;

import com.scayle.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class ProductSortingTest extends BaseApiTest {

    @Test
    public void testUpdateOrCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductSortingUpdateOrCreateRequest.json");
        List<ProductSorting> requestEntity = this.jsonSerializer.unserializeList(expectedRequestJson, ProductSorting.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        this.api.productSortings().updateOrCreate(requestEntity, options);

    }

    @Test
    public void testDelete() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductSortingDeleteRequest.json");
        List<ProductSorting> requestEntity = this.jsonSerializer.unserializeList(expectedRequestJson, ProductSorting.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        this.api.productSortings().delete(requestEntity, options);

    }

}
