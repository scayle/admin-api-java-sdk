package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("unchecked")
public class AttributeTranslationTest extends BaseApiTest {

    @Test
    public void testUpdateOrCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/AttributeTranslationUpdateOrCreateRequest.json");
        Map<String, String> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    this.api.attributeTranslations().updateOrCreate("1", requestEntity,  null);

    }

    @Test
    public void testAll() throws Exception {

    ApiCollection<Map<String, String>> responseEntity = this.api.attributeTranslations().all("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/AttributeTranslationAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Map<String, String> entity : responseEntity.getEntities()) {
        }
    }

}