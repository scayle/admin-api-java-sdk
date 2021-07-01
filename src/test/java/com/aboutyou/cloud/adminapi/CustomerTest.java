package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class CustomerTest extends BaseApiTest {

    @Test
    public void testGet() throws Exception {

    Customer responseEntity = this.api.customers().get("1", "1", Identifier.fromId(1),  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CustomerCreateRequest.json");
        Customer requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Customer.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Customer responseEntity = this.api.customers().create("1", "1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CustomerUpdateRequest.json");
        Customer requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Customer.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Customer responseEntity = this.api.customers().update("1", "1", Identifier.fromId(1), requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateReferenceKey() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CustomerUpdateReferenceKeyRequest.json");
        CustomerReferenceKey requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CustomerReferenceKey.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Customer responseEntity = this.api.customers().updateReferenceKey("1", "1", 1, requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerUpdateReferenceKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAnonymize() throws Exception {

    this.api.customers().anonymize("1", "1", Identifier.fromId(1),  null);

    }

    @Test
    public void testGetStatus() throws Exception {

    CustomerStatus responseEntity = this.api.customers().getStatus("1", "1", Identifier.fromId(1),  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerGetStatusResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateStatus() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CustomerUpdateStatusRequest.json");
        CustomerStatus requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CustomerStatus.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    CustomerStatus responseEntity = this.api.customers().updateStatus("1", "1", Identifier.fromId(1), requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerUpdateStatusResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGetAddresses() throws Exception {

    ApiCollection<CustomerAddress> responseEntity = this.api.customers().getAddresses("1", "1", Identifier.fromId(1),  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerGetAddressesResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (CustomerAddress entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGetAddress() throws Exception {

    CustomerAddress responseEntity = this.api.customers().getAddress("1", "1", Identifier.fromId(1), Identifier.fromId(1),  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerGetAddressResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateAddress() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CustomerCreateAddressRequest.json");
        CustomerAddress requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CustomerAddress.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    CustomerAddress responseEntity = this.api.customers().createAddress("1", "1", Identifier.fromId(1), requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerCreateAddressResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateAddress() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CustomerUpdateAddressRequest.json");
        CustomerAddress requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CustomerAddress.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    CustomerAddress responseEntity = this.api.customers().updateAddress("1", "1", Identifier.fromId(1), Identifier.fromId(1), requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerUpdateAddressResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateAddressReferenceKey() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CustomerUpdateAddressReferenceKeyRequest.json");
        CustomerAddressReferenceKey requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CustomerAddressReferenceKey.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    CustomerAddress responseEntity = this.api.customers().updateAddressReferenceKey("1", "1", Identifier.fromId(1), 1, requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerUpdateAddressReferenceKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAnonymizeAddress() throws Exception {

    this.api.customers().anonymizeAddress("1", "1", Identifier.fromId(1), Identifier.fromId(1),  null);

    }

    @Test
    public void testResetPassword() throws Exception {

    this.api.customers().resetPassword("1", "1", Identifier.fromId(1),  null);

    }

}