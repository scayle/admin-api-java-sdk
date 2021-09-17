package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class AttributeGroupTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/AttributeGroupCreateRequest.json");
        AttributeGroup requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, AttributeGroup.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    AttributeGroup responseEntity = this.api.attributeGroups().create(requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/AttributeGroupCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGet() throws Exception {

    AttributeGroup responseEntity = this.api.attributeGroups().get("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/AttributeGroupGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

    ApiCollection<AttributeGroup> responseEntity = this.api.attributeGroups().all( null);

        String expectedResponseJson = this.loadFixture("/fixtures/AttributeGroupAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (AttributeGroup entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/AttributeGroupUpdateRequest.json");
        AttributeGroup requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, AttributeGroup.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    AttributeGroup responseEntity = this.api.attributeGroups().update("1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/AttributeGroupUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

    this.api.attributeGroups().delete("1",  null);

    }

    @Test
    public void testUpdateFrontendName() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/AttributeGroupUpdateFrontendNameRequest.json");
        Map<String, String> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    this.api.attributeGroups().updateFrontendName("1", requestEntity,  null);

    }

    @Test
    public void testGetAttributes() throws Exception {

    ApiCollection<Object> responseEntity = this.api.attributeGroups().getAttributes("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/AttributeGroupGetAttributesResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Object entity : responseEntity.getEntities()) {
        }
    }

}