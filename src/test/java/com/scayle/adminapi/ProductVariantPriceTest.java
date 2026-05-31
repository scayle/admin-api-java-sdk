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
public class ProductVariantPriceTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductVariantPriceCreateRequest.json");
        ProductVariantPrice requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ProductVariantPrice.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ProductVariantPrice responseEntity = this.api.productVariantPrices().create(Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantPriceCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<ProductVariantPrice> responseEntity = this.api.productVariantPrices().all(Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantPriceAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ProductVariantPrice entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.productVariantPrices().delete(Identifier.fromId(1), "acme", options);

    }

    @Test
    public void testCreateOrUpdateCustomData() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductVariantPriceCreateOrUpdateCustomDataRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.productVariantPrices().createOrUpdateCustomData(Identifier.fromId(1), "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantPriceCreateOrUpdateCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomData() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.productVariantPrices().deleteCustomData(Identifier.fromId(1), "acme", options);

    }

    @Test
    public void testGetCustomData() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.productVariantPrices().getCustomData(Identifier.fromId(1), "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantPriceGetCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateOrUpdateCustomDataForKey() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductVariantPriceCreateOrUpdateCustomDataForKeyRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.productVariantPrices().createOrUpdateCustomDataForKey(Identifier.fromId(1), "acme", "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantPriceCreateOrUpdateCustomDataForKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomDataForKey() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.productVariantPrices().deleteCustomDataForKey(Identifier.fromId(1), "acme", "acme", options);

    }

    @Test
    public void testGetCustomDataForKey() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.productVariantPrices().getCustomDataForKey(Identifier.fromId(1), "acme", "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantPriceGetCustomDataForKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateBulkRequest() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductVariantPriceCreateBulkRequestRequest.json");
        CreateBulkRequest requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CreateBulkRequest.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        BulkRequest responseEntity = this.api.productVariantPrices().createBulkRequest(requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantPriceCreateBulkRequestResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}
