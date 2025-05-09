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
public class AttributeTranslationTest extends BaseApiTest {

    @Test
    public void testUpdateOrCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/AttributeTranslationUpdateOrCreateRequest.json");
        Map<String, String> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        this.api.attributeTranslations().updateOrCreate("acme", requestEntity, options);

    }

    @Test
    public void testPartialUpdateOrCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/AttributeTranslationPartialUpdateOrCreateRequest.json");
        Map<String, String> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        this.api.attributeTranslations().partialUpdateOrCreate("acme", requestEntity, options);

    }

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<Map<String, String>> responseEntity = this.api.attributeTranslations().all("acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/AttributeTranslationAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Map<String, String> entity : responseEntity.getEntities()) {
        }
    }

}
