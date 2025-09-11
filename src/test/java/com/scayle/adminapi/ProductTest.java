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
public class ProductTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductCreateRequest.json");
        Product requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Product.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Product responseEntity = this.api.products().create(requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGet() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Product responseEntity = this.api.products().get(Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<Product> responseEntity = this.api.products().all(options);

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

        ApiOptions options = ApiOptions.builder().build();
        Product responseEntity = this.api.products().update(Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.products().delete(Identifier.fromId(1), options);

    }

    @Test
    public void testUpdateOrCreateAttribute() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductUpdateOrCreateAttributeRequest.json");
        Attribute requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Attribute.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Attribute responseEntity = this.api.products().updateOrCreateAttribute(Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductUpdateOrCreateAttributeResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteAttribute() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.products().deleteAttribute(Identifier.fromId(1), "acme", options);

    }

    @Test
    public void testGetAttribute() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Attribute responseEntity = this.api.products().getAttribute(Identifier.fromId(1), "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductGetAttributeResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAllAttributes() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<Attribute> responseEntity = this.api.products().allAttributes(Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductAllAttributesResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Attribute entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testUpdateMasterCategories() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductUpdateMasterCategoriesRequest.json");
        ProductMasterCategories requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ProductMasterCategories.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ProductMasterCategories responseEntity = this.api.products().updateMasterCategories(Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductUpdateMasterCategoriesResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateOrUpdateCustomData() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductCreateOrUpdateCustomDataRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.products().createOrUpdateCustomData(Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductCreateOrUpdateCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomData() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.products().deleteCustomData(Identifier.fromId(1), options);

    }

    @Test
    public void testGetCustomData() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.products().getCustomData(Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductGetCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateOrUpdateCustomDataForKey() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductCreateOrUpdateCustomDataForKeyRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.products().createOrUpdateCustomDataForKey(Identifier.fromId(1), "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductCreateOrUpdateCustomDataForKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomDataForKey() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.products().deleteCustomDataForKey(Identifier.fromId(1), "acme", options);

    }

    @Test
    public void testGetCustomDataForKey() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.products().getCustomDataForKey(Identifier.fromId(1), "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductGetCustomDataForKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateComposite() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductCreateCompositeRequest.json");
        Product requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Product.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Product responseEntity = this.api.products().createComposite(requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductCreateCompositeResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateComposite() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductUpdateCompositeRequest.json");
        Product requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Product.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Product responseEntity = this.api.products().updateComposite(Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductUpdateCompositeResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteComposite() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.products().deleteComposite(Identifier.fromId(1), options);

    }

    @Test
    public void testUpdateState() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductUpdateStateRequest.json");
        ProductState requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ProductState.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ProductState responseEntity = this.api.products().updateState(Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductUpdateStateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testPatchSimilarProducts() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductPatchSimilarProductsRequest.json");
        List<SimilarProducts> requestEntity = this.jsonSerializer.unserializeList(expectedRequestJson, SimilarProducts.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        this.api.products().patchSimilarProducts(Identifier.fromId(1), requestEntity, options);

    }

    @Test
    public void testCreateBulkRequest() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductCreateBulkRequestRequest.json");
        CreateBulkRequest requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CreateBulkRequest.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        BulkRequest responseEntity = this.api.products().createBulkRequest(requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductCreateBulkRequestResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateCompositeProductBulkRequest() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductCreateCompositeProductBulkRequestRequest.json");
        CreateBulkRequest requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CreateBulkRequest.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        BulkRequest responseEntity = this.api.products().createCompositeProductBulkRequest(requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductCreateCompositeProductBulkRequestResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUnlockAttributeGroup() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.products().unlockAttributeGroup(Identifier.fromId(1), "acme", options);

    }

}
