package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class ProductVariantTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductVariantCreateRequest.json");
        ProductVariant requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ProductVariant.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ProductVariant responseEntity = this.api.productVariants().create(Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGet() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ProductVariant responseEntity = this.api.productVariants().get(Identifier.fromId(1), Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<ProductVariant> responseEntity = this.api.productVariants().all(Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ProductVariant entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductVariantUpdateRequest.json");
        ProductVariant requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ProductVariant.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ProductVariant responseEntity = this.api.productVariants().update(Identifier.fromId(1), Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.productVariants().delete(Identifier.fromId(1), Identifier.fromId(1), options);

    }

    @Test
    public void testUpdateOrCreateAttribute() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductVariantUpdateOrCreateAttributeRequest.json");
        Attribute requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Attribute.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Attribute responseEntity = this.api.productVariants().updateOrCreateAttribute(Identifier.fromId(1), Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantUpdateOrCreateAttributeResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteAttribute() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.productVariants().deleteAttribute(Identifier.fromId(1), Identifier.fromId(1), "acme", options);

    }

    @Test
    public void testGetAttribute() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Attribute responseEntity = this.api.productVariants().getAttribute(Identifier.fromId(1), Identifier.fromId(1), "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantGetAttributeResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAllAttributes() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<Attribute> responseEntity = this.api.productVariants().allAttributes(Identifier.fromId(1), Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantAllAttributesResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Attribute entity : responseEntity.getEntities()) {
        }
    }

}
