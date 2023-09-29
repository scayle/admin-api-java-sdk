package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class MerchantTest extends BaseApiTest {

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<Merchant> responseEntity = this.api.merchants().all(options);

        String expectedResponseJson = this.loadFixture("/fixtures/MerchantAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Merchant entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGet() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Merchant responseEntity = this.api.merchants().get(Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/MerchantGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/MerchantCreateRequest.json");
        Merchant requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Merchant.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Merchant responseEntity = this.api.merchants().create(requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/MerchantCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/MerchantUpdateRequest.json");
        Merchant requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Merchant.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Merchant responseEntity = this.api.merchants().update(Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/MerchantUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}
