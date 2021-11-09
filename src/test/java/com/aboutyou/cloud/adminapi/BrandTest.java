package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class BrandTest extends BaseApiTest {

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<Brand> responseEntity = this.api.brands().all(options);

        String expectedResponseJson = this.loadFixture("/fixtures/BrandAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Brand entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGet() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Brand responseEntity = this.api.brands().get(1, options);

        String expectedResponseJson = this.loadFixture("/fixtures/BrandGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/BrandCreateRequest.json");
        Brand requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Brand.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Brand responseEntity = this.api.brands().create(requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/BrandCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/BrandUpdateRequest.json");
        Brand requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Brand.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Brand responseEntity = this.api.brands().update(1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/BrandUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.brands().delete(1, options);

    }

    @Test
    public void testCreateOrUpdateCustomData() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/BrandCreateOrUpdateCustomDataRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.brands().createOrUpdateCustomData(1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/BrandCreateOrUpdateCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomData() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.brands().deleteCustomData(1, options);

    }

    @Test
    public void testGetCustomData() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.brands().getCustomData(1, options);

        String expectedResponseJson = this.loadFixture("/fixtures/BrandGetCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateOrUpdateCustomDataForKey() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/BrandCreateOrUpdateCustomDataForKeyRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.brands().createOrUpdateCustomDataForKey(1, "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/BrandCreateOrUpdateCustomDataForKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomDataForKey() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.brands().deleteCustomDataForKey(1, "acme", options);

    }

    @Test
    public void testGetCustomDataForKey() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.brands().getCustomDataForKey(1, "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/BrandGetCustomDataForKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}
