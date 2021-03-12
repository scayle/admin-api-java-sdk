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

    ShopCountry responseEntity = this.api.shopCountries().create("1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

    ApiCollection<ShopCountry> responseEntity = this.api.shopCountries().all("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ShopCountry entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGet() throws Exception {

    ShopCountry responseEntity = this.api.shopCountries().get("1", "1",  null);

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

    ShopCountry responseEntity = this.api.shopCountries().update("1", "1", requestEntity,  null);

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

    Assortment responseEntity = this.api.shopCountries().updateAssortment("1", "1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryUpdateAssortmentResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateOrCreateProperty() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCountryUpdateOrCreatePropertyRequest.json");
        ShopProperty requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopProperty.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    ShopProperty responseEntity = this.api.shopCountries().updateOrCreateProperty("1", "1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryUpdateOrCreatePropertyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteProperty() throws Exception {

    this.api.shopCountries().deleteProperty("1", "1", "1",  null);

    }

    @Test
    public void testGetProperty() throws Exception {

    ShopProperty responseEntity = this.api.shopCountries().getProperty("1", "1", "1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryGetPropertyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAllProperties() throws Exception {

    ApiCollection<ShopProperty> responseEntity = this.api.shopCountries().allProperties("1", "1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryAllPropertiesResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ShopProperty entity : responseEntity.getEntities()) {
        }
    }

}