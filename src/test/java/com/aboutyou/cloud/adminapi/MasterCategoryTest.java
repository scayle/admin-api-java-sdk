package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class MasterCategoryTest extends BaseApiTest {

    @Test
    public void testAll() throws Exception {

    ApiCollection<MasterCategory> responseEntity = this.api.masterCategories().all( null);

        String expectedResponseJson = this.loadFixture("/fixtures/MasterCategoryAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (MasterCategory entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGet() throws Exception {

    MasterCategory responseEntity = this.api.masterCategories().get(1,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/MasterCategoryGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/MasterCategoryCreateRequest.json");
        MasterCategory requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, MasterCategory.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    MasterCategory responseEntity = this.api.masterCategories().create(requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/MasterCategoryCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}