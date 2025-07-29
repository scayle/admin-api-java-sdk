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

    @Test
    public void testCreateOrUpdateCustomData() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductVariantCreateOrUpdateCustomDataRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.productVariants().createOrUpdateCustomData(Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantCreateOrUpdateCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomData() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.productVariants().deleteCustomData(Identifier.fromId(1), options);

    }

    @Test
    public void testGetCustomData() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.productVariants().getCustomData(Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantGetCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateOrUpdateCustomDataForKey() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductVariantCreateOrUpdateCustomDataForKeyRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.productVariants().createOrUpdateCustomDataForKey(Identifier.fromId(1), "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantCreateOrUpdateCustomDataForKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomDataForKey() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.productVariants().deleteCustomDataForKey(Identifier.fromId(1), "acme", options);

    }

    @Test
    public void testGetCustomDataForKey() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.productVariants().getCustomDataForKey(Identifier.fromId(1), "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantGetCustomDataForKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateComposite() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductVariantCreateCompositeRequest.json");
        ProductVariant requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ProductVariant.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ProductVariant responseEntity = this.api.productVariants().createComposite(Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantCreateCompositeResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateComposite() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductVariantUpdateCompositeRequest.json");
        ProductVariant requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ProductVariant.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ProductVariant responseEntity = this.api.productVariants().updateComposite(Identifier.fromId(1), Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantUpdateCompositeResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteComposite() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.productVariants().deleteComposite(Identifier.fromId(1), Identifier.fromId(1), options);

    }

}
