package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("unchecked")
public class CampaignTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CampaignCreateRequest.json");
        Campaign requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Campaign.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Campaign responseEntity = this.api.campaigns().create(requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CampaignCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

    ApiCollection<Campaign> responseEntity = this.api.campaigns().all( null);

        String expectedResponseJson = this.loadFixture("/fixtures/CampaignAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Campaign entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGet() throws Exception {

    Campaign responseEntity = this.api.campaigns().get(1,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CampaignGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CampaignUpdateRequest.json");
        Campaign requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Campaign.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Campaign responseEntity = this.api.campaigns().update(1, requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CampaignUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

    this.api.campaigns().delete(1,  null);

    }

}