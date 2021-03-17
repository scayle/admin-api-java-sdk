package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

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

    ShopCategory responseEntity = this.api.shopCategories().create("1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

    ApiCollection<ShopCategory> responseEntity = this.api.shopCategories().all("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ShopCategory entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGet() throws Exception {

    ShopCategory responseEntity = this.api.shopCategories().get("1", 1,  null);

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

    ShopCategory responseEntity = this.api.shopCategories().update("1", 1, requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

    this.api.shopCategories().delete("1", 1,  null);

    }

    @Test
    public void testUpdateOrCreateProperty() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCategoryUpdateOrCreatePropertyRequest.json");
        ShopCategoryProperty requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopCategoryProperty.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    ShopCategoryProperty responseEntity = this.api.shopCategories().updateOrCreateProperty("1", 1, requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryUpdateOrCreatePropertyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteProperty() throws Exception {

    this.api.shopCategories().deleteProperty("1", 1, "1",  null);

    }

    @Test
    public void testGetProperty() throws Exception {

    ShopCategoryProperty responseEntity = this.api.shopCategories().getProperty("1", 1, "1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryGetPropertyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAllProperties() throws Exception {

    ApiCollection<ShopCategoryProperty> responseEntity = this.api.shopCategories().allProperties("1", 1,  null);

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

    Map<String, Object> responseEntity = this.api.shopCategories().createOrUpdateCustomData("1", 1, requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryCreateOrUpdateCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomData() throws Exception {

    this.api.shopCategories().deleteCustomData("1", 1,  null);

    }

    @Test
    public void testGetCustomData() throws Exception {

    Map<String, Object> responseEntity = this.api.shopCategories().getCustomData("1", 1,  null);

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

    Map<String, Object> responseEntity = this.api.shopCategories().createOrUpdateCustomDataForKey("1", 1, "1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryCreateOrUpdateCustomDataForKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomDataForKey() throws Exception {

    this.api.shopCategories().deleteCustomDataForKey("1", 1, "1",  null);

    }

    @Test
    public void testGetCustomDataForKey() throws Exception {

    Map<String, Object> responseEntity = this.api.shopCategories().getCustomDataForKey("1", 1, "1",  null);

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

    Map<String, Object> responseEntity = this.api.shopCategories().createOrUpdateCustomDataForCountry("1", 1, "1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryCreateOrUpdateCustomDataForCountryResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomDataForCountry() throws Exception {

    this.api.shopCategories().deleteCustomDataForCountry("1", 1, "1",  null);

    }

    @Test
    public void testGetCustomDataForCountry() throws Exception {

    Map<String, Object> responseEntity = this.api.shopCategories().getCustomDataForCountry("1", 1, "1",  null);

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

    Map<String, Object> responseEntity = this.api.shopCategories().createOrUpdateCustomDataKeyForCountry("1", 1, "1", "1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryCreateOrUpdateCustomDataKeyForCountryResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomDataKeyForCountry() throws Exception {

    this.api.shopCategories().deleteCustomDataKeyForCountry("1", 1, "1", "1",  null);

    }

    @Test
    public void testGetCustomDataKeyForCountry() throws Exception {

    Map<String, Object> responseEntity = this.api.shopCategories().getCustomDataKeyForCountry("1", 1, "1", "1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCategoryGetCustomDataKeyForCountryResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}