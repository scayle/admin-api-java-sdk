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
public class OrderBillingStatusTest extends BaseApiTest {

    @Test
    public void testUpdateOrderBillingStatus() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/OrderBillingStatusUpdateOrderBillingStatusRequest.json");
        OrderBillingStatus requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, OrderBillingStatus.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Order responseEntity = this.api.orderBillingStatuses().updateOrderBillingStatus("acme", "acme", Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/OrderBillingStatusUpdateOrderBillingStatusResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}
