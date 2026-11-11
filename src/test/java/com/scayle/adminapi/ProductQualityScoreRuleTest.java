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
public class ProductQualityScoreRuleTest extends BaseApiTest {

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<ProductQualityScoreRule> responseEntity = this.api.productQualityScoreRules().all(options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductQualityScoreRuleAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ProductQualityScoreRule entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductQualityScoreRuleCreateRequest.json");
        ProductQualityScoreRuleUpdateOrCreateRequest requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ProductQualityScoreRuleUpdateOrCreateRequest.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ProductQualityScoreRule responseEntity = this.api.productQualityScoreRules().create(requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductQualityScoreRuleCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGet() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ProductQualityScoreRule responseEntity = this.api.productQualityScoreRules().get(2, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductQualityScoreRuleGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductQualityScoreRuleUpdateRequest.json");
        ProductQualityScoreRuleUpdateOrCreateRequest requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ProductQualityScoreRuleUpdateOrCreateRequest.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ProductQualityScoreRule responseEntity = this.api.productQualityScoreRules().update(2, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductQualityScoreRuleUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.productQualityScoreRules().delete(2, options);

    }

    @Test
    public void testAttach() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ProductQualityScoreRule responseEntity = this.api.productQualityScoreRules().attach(2, 4, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductQualityScoreRuleAttachResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDetach() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.productQualityScoreRules().detach(2, 4, options);

    }

    @Test
    public void testGetCategory() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ProductQualityScoreCategory responseEntity = this.api.productQualityScoreRules().getCategory(4, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductQualityScoreRuleGetCategoryResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}
