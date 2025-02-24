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
public class PromotionItemSetTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/PromotionItemSetCreateRequest.json");
        PromotionItemSet requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, PromotionItemSet.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        PromotionItemSet responseEntity = this.api.promotionItemSets().create(requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/PromotionItemSetCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGet() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        PromotionItemSet responseEntity = this.api.promotionItemSets().get("64cbc70225ae598c0d0d0334", options);

        String expectedResponseJson = this.loadFixture("/fixtures/PromotionItemSetGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.promotionItemSets().delete("645e0c241a93369ff53f26e0", options);

    }

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<PromotionItemSet> responseEntity = this.api.promotionItemSets().all(options);

        String expectedResponseJson = this.loadFixture("/fixtures/PromotionItemSetAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (PromotionItemSet entity : responseEntity.getEntities()) {
        }
    }

}
