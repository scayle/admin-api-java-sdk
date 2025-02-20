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
public class CampaignTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CampaignCreateRequest.json");
        Campaign requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Campaign.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Campaign responseEntity = this.api.campaigns().create("acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/CampaignCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<Campaign> responseEntity = this.api.campaigns().all("acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/CampaignAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Campaign entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGet() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Campaign responseEntity = this.api.campaigns().get("acme", 1, options);

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

        ApiOptions options = ApiOptions.builder().build();
        Campaign responseEntity = this.api.campaigns().update("acme", 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/CampaignUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.campaigns().delete("acme", 1, options);

    }

    @Test
    public void testUpdateOrCreateVariantReductions() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CampaignUpdateOrCreateVariantReductionsRequest.json");
        List<ProductVariantCampaignReduction> requestEntity = this.jsonSerializer.unserializeList(expectedRequestJson, ProductVariantCampaignReduction.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        this.api.campaigns().updateOrCreateVariantReductions("acme", 1, requestEntity, options);

    }

    @Test
    public void testUpdateOrCreateProductReductions() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CampaignUpdateOrCreateProductReductionsRequest.json");
        List<ProductCampaignReduction> requestEntity = this.jsonSerializer.unserializeList(expectedRequestJson, ProductCampaignReduction.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        this.api.campaigns().updateOrCreateProductReductions("acme", 1, requestEntity, options);

    }

    @Test
    public void testAllReductions() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<ProductVariantCampaignReduction> responseEntity = this.api.campaigns().allReductions("acme", 1, options);

        String expectedResponseJson = this.loadFixture("/fixtures/CampaignAllReductionsResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ProductVariantCampaignReduction entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testDeleteReductions() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.campaigns().deleteReductions("acme", 1, options);

    }

    @Test
    public void testCreateOrUpdateCustomData() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CampaignCreateOrUpdateCustomDataRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.campaigns().createOrUpdateCustomData(Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/CampaignCreateOrUpdateCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomData() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.campaigns().deleteCustomData(Identifier.fromId(1), options);

    }

    @Test
    public void testGetCustomData() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.campaigns().getCustomData(Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/CampaignGetCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateOrUpdateCustomDataForKey() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CampaignCreateOrUpdateCustomDataForKeyRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.campaigns().createOrUpdateCustomDataForKey(Identifier.fromId(1), "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/CampaignCreateOrUpdateCustomDataForKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomDataForKey() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.campaigns().deleteCustomDataForKey(Identifier.fromId(1), "acme", options);

    }

    @Test
    public void testGetCustomDataForKey() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Map<String, Object> responseEntity = this.api.campaigns().getCustomDataForKey(Identifier.fromId(1), "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/CampaignGetCustomDataForKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}
