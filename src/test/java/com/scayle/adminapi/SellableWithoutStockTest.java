package com.scayle.adminapi;

import com.scayle.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class SellableWithoutStockTest extends BaseApiTest {

    @Test
    public void testSetSellableWithoutStock() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/SellableWithoutStockSetSellableWithoutStockRequest.json");
        SellableWithoutStock requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, SellableWithoutStock.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        SellableWithoutStock responseEntity = this.api.sellableWithoutStocks().setSellableWithoutStock(Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/SellableWithoutStockSetSellableWithoutStockResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}
