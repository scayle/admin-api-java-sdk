package com.scayle.adminapi;

import com.scayle.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class AudienceTest extends BaseApiTest {

    @Test
    public void testGetAudiences() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<Audience> responseEntity = this.api.audiences().getAudiences(options);

        String expectedResponseJson = this.loadFixture("/fixtures/AudienceGetAudiencesResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Audience entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testCreateAudience() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/AudienceCreateAudienceRequest.json");
        Audience requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Audience.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Audience responseEntity = this.api.audiences().createAudience(requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/AudienceCreateAudienceResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGetAudience() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Audience responseEntity = this.api.audiences().getAudience("645e0c241a93369ff53f26e0", options);

        String expectedResponseJson = this.loadFixture("/fixtures/AudienceGetAudienceResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteAudience() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.audiences().deleteAudience("645e0c241a93369ff53f26e0", options);

    }

    @Test
    public void testUpdateAudience() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/AudienceUpdateAudienceRequest.json");
        AudienceUpdateRequest requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, AudienceUpdateRequest.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Audience responseEntity = this.api.audiences().updateAudience("645e0c241a93369ff53f26e0", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/AudienceUpdateAudienceResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}
