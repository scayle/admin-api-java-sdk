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
public class CustomerSegmentTest extends BaseApiTest {

    @Test
    public void testGetCustomerSegments() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<CustomerSegment> responseEntity = this.api.customerSegments().getCustomerSegments("acme", "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerSegmentGetCustomerSegmentsResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (CustomerSegment entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testCreateCustomerSegment() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CustomerSegmentCreateCustomerSegmentRequest.json");
        CustomerSegment requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CustomerSegment.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        CustomerSegment responseEntity = this.api.customerSegments().createCustomerSegment("acme", "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerSegmentCreateCustomerSegmentResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGetCustomerSegment() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        CustomerSegment responseEntity = this.api.customerSegments().getCustomerSegment("acme", "acme", "3fa85f64-5717-4562-b3fc-2c963f66afa6", options);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerSegmentGetCustomerSegmentResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateCustomerSegment() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CustomerSegmentUpdateCustomerSegmentRequest.json");
        CustomerSegment requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CustomerSegment.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        CustomerSegment responseEntity = this.api.customerSegments().updateCustomerSegment("acme", "acme", "3fa85f64-5717-4562-b3fc-2c963f66afa6", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerSegmentUpdateCustomerSegmentResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCustomerSegment() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.customerSegments().deleteCustomerSegment("acme", "acme", "3fa85f64-5717-4562-b3fc-2c963f66afa6", options);

    }

}
