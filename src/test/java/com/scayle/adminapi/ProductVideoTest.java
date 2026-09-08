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
public class ProductVideoTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductVideoCreateRequest.json");
        ProductVideo requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ProductVideo.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ProductVideo responseEntity = this.api.productVideos().create(Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVideoCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<ProductVideo> responseEntity = this.api.productVideos().all(Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVideoAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ProductVideo entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.productVideos().delete(Identifier.fromId(1), Identifier.fromId(1), options);

    }

    @Test
    public void testUpdateOrCreateAttribute() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductVideoUpdateOrCreateAttributeRequest.json");
        Attribute requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Attribute.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Attribute responseEntity = this.api.productVideos().updateOrCreateAttribute(Identifier.fromId(1), Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVideoUpdateOrCreateAttributeResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteAttribute() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.productVideos().deleteAttribute(Identifier.fromId(1), Identifier.fromId(1), "acme", options);

    }

    @Test
    public void testGetAttribute() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Attribute responseEntity = this.api.productVideos().getAttribute(Identifier.fromId(1), Identifier.fromId(1), "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVideoGetAttributeResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAllAttributes() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<Attribute> responseEntity = this.api.productVideos().allAttributes(Identifier.fromId(1), Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVideoAllAttributesResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Attribute entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testUnlockAttributeGroup() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.productVideos().unlockAttributeGroup(Identifier.fromId(1), Identifier.fromId(1), "acme", options);

    }

}
