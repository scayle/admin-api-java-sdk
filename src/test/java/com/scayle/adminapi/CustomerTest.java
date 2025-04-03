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
public class CustomerTest extends BaseApiTest {

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<Customer> responseEntity = this.api.customers().all("acme", "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Customer entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGet() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Customer responseEntity = this.api.customers().get("acme", "acme", Identifier.fromId(1), options);

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

        ApiOptions options = ApiOptions.builder().build();
        Customer responseEntity = this.api.customers().create("acme", "acme", requestEntity, options);

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

        ApiOptions options = ApiOptions.builder().build();
        Customer responseEntity = this.api.customers().update("acme", "acme", Identifier.fromId(1), requestEntity, options);

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

        ApiOptions options = ApiOptions.builder().build();
        Customer responseEntity = this.api.customers().updateReferenceKey("acme", "acme", 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerUpdateReferenceKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateOrUpdateLegacyCustomData() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CustomerCreateOrUpdateLegacyCustomDataRequest.json");
        Map<String, Object> requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Map.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Customer responseEntity = this.api.customers().createOrUpdateLegacyCustomData("acme", "acme", 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerCreateOrUpdateLegacyCustomDataResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAnonymize() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.customers().anonymize("acme", "acme", Identifier.fromId(1), options);

    }

    @Test
    public void testSetPassword() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CustomerSetPasswordRequest.json");
        CustomerPassword requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CustomerPassword.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        this.api.customers().setPassword("acme", "acme", Identifier.fromId(1), requestEntity, options);

    }

    @Test
    public void testSetPasswordHash() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CustomerSetPasswordHashRequest.json");
        CustomerPasswordHash requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CustomerPasswordHash.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        this.api.customers().setPasswordHash("acme", "acme", Identifier.fromId(1), requestEntity, options);

    }

    @Test
    public void testGetStatus() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        CustomerStatus responseEntity = this.api.customers().getStatus("acme", "acme", Identifier.fromId(1), options);

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

        ApiOptions options = ApiOptions.builder().build();
        CustomerStatus responseEntity = this.api.customers().updateStatus("acme", "acme", Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerUpdateStatusResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGetAddresses() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<CustomerAddress> responseEntity = this.api.customers().getAddresses("acme", "acme", Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerGetAddressesResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (CustomerAddress entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGetAddress() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        CustomerAddress responseEntity = this.api.customers().getAddress("acme", "acme", Identifier.fromId(1), Identifier.fromId(1), options);

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

        ApiOptions options = ApiOptions.builder().build();
        CustomerAddress responseEntity = this.api.customers().createAddress("acme", "acme", Identifier.fromId(1), requestEntity, options);

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

        ApiOptions options = ApiOptions.builder().build();
        CustomerAddress responseEntity = this.api.customers().updateAddress("acme", "acme", Identifier.fromId(1), Identifier.fromId(1), requestEntity, options);

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

        ApiOptions options = ApiOptions.builder().build();
        CustomerAddress responseEntity = this.api.customers().updateAddressReferenceKey("acme", "acme", Identifier.fromId(1), 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerUpdateAddressReferenceKeyResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAnonymizeAddress() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.customers().anonymizeAddress("acme", "acme", Identifier.fromId(1), Identifier.fromId(1), options);

    }

    @Test
    public void testAnonymizeAddressByIdentifier() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.customers().anonymizeAddressByIdentifier("acme", "acme", Identifier.fromId(1), options);

    }

    @Test
    public void testResetPassword() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.customers().resetPassword("acme", "acme", Identifier.fromId(1), options);

    }

    @Test
    public void testAddGroups() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CustomerAddGroupsRequest.json");
        CustomerGroup requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CustomerGroup.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Customer responseEntity = this.api.customers().addGroups("acme", "acme", Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerAddGroupsResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateMembership() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CustomerCreateMembershipRequest.json");
        CustomerMembership requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CustomerMembership.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        CustomerMembership responseEntity = this.api.customers().createMembership("acme", "acme", Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerCreateMembershipResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateMembership() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/CustomerUpdateMembershipRequest.json");
        CustomerMembership requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, CustomerMembership.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        CustomerMembership responseEntity = this.api.customers().updateMembership("acme", "acme", 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerUpdateMembershipResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGetMemberships() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<CustomerMembership> responseEntity = this.api.customers().getMemberships("acme", "acme", Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/CustomerGetMembershipsResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (CustomerMembership entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testDeleteMembership() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.customers().deleteMembership("acme", "acme", 1, options);

    }

    @Test
    public void testDeleteGroup() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.customers().deleteGroup("acme", "acme", Identifier.fromId(1), "acme", options);

    }

}
