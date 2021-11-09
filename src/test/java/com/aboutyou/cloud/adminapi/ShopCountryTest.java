package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class ShopCountryTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCountryCreateRequest.json");
        ShopCountry requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopCountry.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ShopCountry responseEntity = this.api.shopCountries().create("acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<ShopCountry> responseEntity = this.api.shopCountries().all("acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ShopCountry entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGet() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ShopCountry responseEntity = this.api.shopCountries().get("acme", "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCountryUpdateRequest.json");
        ShopCountry requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopCountry.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ShopCountry responseEntity = this.api.shopCountries().update("acme", "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateAssortment() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCountryUpdateAssortmentRequest.json");
        Assortment requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Assortment.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Assortment responseEntity = this.api.shopCountries().updateAssortment("acme", "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryUpdateAssortmentResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateOrUpdateCustomData() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCountryCreateOrUpdateCustomDataRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.shopCountries().createOrUpdateCustomData("acme", "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryCreateOrUpdateCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomData() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.shopCountries().deleteCustomData("acme", "acme", options);

    }

    @Test
    public void testGetCustomData() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.shopCountries().getCustomData("acme", "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryGetCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateOrUpdateCustomDataForKey() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCountryCreateOrUpdateCustomDataForKeyRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.shopCountries().createOrUpdateCustomDataForKey("acme", "acme", "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryCreateOrUpdateCustomDataForKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomDataForKey() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.shopCountries().deleteCustomDataForKey("acme", "acme", "acme", options);

    }

    @Test
    public void testGetCustomDataForKey() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.shopCountries().getCustomDataForKey("acme", "acme", "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryGetCustomDataForKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}
