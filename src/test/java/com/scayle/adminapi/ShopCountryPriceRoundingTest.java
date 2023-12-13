package com.scayle.adminapi;

import com.scayle.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class ShopCountryPriceRoundingTest extends BaseApiTest {

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<ShopCountryPriceRounding> responseEntity = this.api.shopCountryPriceRoundings().all("acme", "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryPriceRoundingAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ShopCountryPriceRounding entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCountryPriceRoundingCreateRequest.json");
        ShopCountryPriceRounding requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopCountryPriceRounding.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        ShopCountryPriceRounding responseEntity = this.api.shopCountryPriceRoundings().create("acme", "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ShopCountryPriceRoundingCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.shopCountryPriceRoundings().delete("acme", "acme", 1, options);

    }

}
