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

    ApiCollection<Brand> responseEntity = this.api.brands().all( null);

        String expectedResponseJson = this.loadFixture("/fixtures/BrandAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Brand entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGet() throws Exception {

    Brand responseEntity = this.api.brands().get(1,  null);

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

    Brand responseEntity = this.api.brands().create(requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/BrandCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}