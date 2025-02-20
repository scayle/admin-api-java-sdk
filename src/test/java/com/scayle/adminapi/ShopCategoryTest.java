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
public class ShopCategoryTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCategoryCreateRequest.json");
        ShopCategory requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopCategory.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ShopCategory responseEntity = this.api.shopCategories().create("acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<ShopCategory> responseEntity = this.api.shopCategories().all("acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ShopCategory entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGet() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ShopCategory responseEntity = this.api.shopCategories().get("acme", 1, options);

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

        ApiOptions options = ApiOptions.builder().build();
        ShopCategory responseEntity = this.api.shopCategories().update("acme", 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.shopCategories().delete("acme", 1, options);

    }

    @Test
    public void testUpdateOrCreateProperty() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCategoryUpdateOrCreatePropertyRequest.json");
        ShopCategoryProperty requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopCategoryProperty.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ShopCategoryProperty responseEntity = this.api.shopCategories().updateOrCreateProperty("acme", "acme", 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryUpdateOrCreatePropertyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteProperty() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.shopCategories().deleteProperty("acme", "acme", 1, "acme", options);

    }

    @Test
    public void testGetProperty() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ShopCategoryProperty responseEntity = this.api.shopCategories().getProperty("acme", "acme", 1, "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryGetPropertyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAllProperties() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<ShopCategoryProperty> responseEntity = this.api.shopCategories().allProperties("acme", "acme", 1, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryAllPropertiesResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ShopCategoryProperty entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testCreateOrUpdateCustomData() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCategoryCreateOrUpdateCustomDataRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.shopCategories().createOrUpdateCustomData("acme", 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryCreateOrUpdateCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomData() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.shopCategories().deleteCustomData("acme", 1, options);

    }

    @Test
    public void testGetCustomData() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.shopCategories().getCustomData("acme", 1, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryGetCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateOrUpdateCustomDataForKey() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCategoryCreateOrUpdateCustomDataForKeyRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.shopCategories().createOrUpdateCustomDataForKey("acme", 1, "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryCreateOrUpdateCustomDataForKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomDataForKey() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.shopCategories().deleteCustomDataForKey("acme", 1, "acme", options);

    }

    @Test
    public void testGetCustomDataForKey() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.shopCategories().getCustomDataForKey("acme", 1, "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryGetCustomDataForKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateOrUpdateCustomDataForCountry() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCategoryCreateOrUpdateCustomDataForCountryRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.shopCategories().createOrUpdateCustomDataForCountry("acme", 1, "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryCreateOrUpdateCustomDataForCountryResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomDataForCountry() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.shopCategories().deleteCustomDataForCountry("acme", 1, "acme", options);

    }

    @Test
    public void testGetCustomDataForCountry() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.shopCategories().getCustomDataForCountry("acme", 1, "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryGetCustomDataForCountryResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateOrUpdateCustomDataKeyForCountry() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCategoryCreateOrUpdateCustomDataKeyForCountryRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.shopCategories().createOrUpdateCustomDataKeyForCountry("acme", 1, "acme", "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryCreateOrUpdateCustomDataKeyForCountryResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomDataKeyForCountry() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.shopCategories().deleteCustomDataKeyForCountry("acme", 1, "acme", "acme", options);

    }

    @Test
    public void testGetCustomDataKeyForCountry() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.shopCategories().getCustomDataKeyForCountry("acme", 1, "acme", "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryGetCustomDataKeyForCountryResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGetCountry() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ShopCategoryCountry responseEntity = this.api.shopCategories().getCountry("acme", "acme", 1, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryGetCountryResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateOrCreateCountry() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCategoryUpdateOrCreateCountryRequest.json");
        ShopCategoryCountry requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopCategoryCountry.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ShopCategoryCountry responseEntity = this.api.shopCategories().updateOrCreateCountry("acme", "acme", 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryUpdateOrCreateCountryResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}
