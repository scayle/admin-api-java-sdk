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
        MerchantCreateOrUpdate requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, MerchantCreateOrUpdate.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        MerchantCreateOrUpdate responseEntity = this.api.merchants().create(requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/MerchantCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/MerchantUpdateRequest.json");
        MerchantCreateOrUpdate requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, MerchantCreateOrUpdate.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        MerchantCreateOrUpdate responseEntity = this.api.merchants().update(Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/MerchantUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAllContacts() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<MerchantContact> responseEntity = this.api.merchants().allContacts(Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/MerchantAllContactsResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (MerchantContact entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGetContact() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        MerchantContact responseEntity = this.api.merchants().getContact(Identifier.fromId(1), 1, options);

        String expectedResponseJson = this.loadFixture("/fixtures/MerchantGetContactResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateContact() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/MerchantCreateContactRequest.json");
        MerchantContact requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, MerchantContact.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        MerchantContact responseEntity = this.api.merchants().createContact(Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/MerchantCreateContactResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateContact() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/MerchantUpdateContactRequest.json");
        MerchantContact requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, MerchantContact.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        MerchantContact responseEntity = this.api.merchants().updateContact(Identifier.fromId(1), 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/MerchantUpdateContactResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteContact() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.merchants().deleteContact(Identifier.fromId(1), 1, options);

    }

    @Test
    public void testAllReturnAddresses() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<MerchantReturnAddress> responseEntity = this.api.merchants().allReturnAddresses(Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/MerchantAllReturnAddressesResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (MerchantReturnAddress entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGetReturnAddress() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        MerchantReturnAddress responseEntity = this.api.merchants().getReturnAddress(Identifier.fromId(1), 1, options);

        String expectedResponseJson = this.loadFixture("/fixtures/MerchantGetReturnAddressResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateReturnAddress() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/MerchantCreateReturnAddressRequest.json");
        MerchantReturnAddress requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, MerchantReturnAddress.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        MerchantReturnAddress responseEntity = this.api.merchants().createReturnAddress(Identifier.fromId(1), requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/MerchantCreateReturnAddressResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateReturnAddress() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/MerchantUpdateReturnAddressRequest.json");
        MerchantReturnAddress requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, MerchantReturnAddress.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        MerchantReturnAddress responseEntity = this.api.merchants().updateReturnAddress(Identifier.fromId(1), 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/MerchantUpdateReturnAddressResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteReturnAddress() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.merchants().deleteReturnAddress(Identifier.fromId(1), 1, options);

    }

    @Test
    public void testAttachCarrier() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.merchants().attachCarrier(Identifier.fromId(1), Identifier.fromId(1), "acme", options);

    }

    @Test
    public void testDetachCarrier() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.merchants().detachCarrier(Identifier.fromId(1), Identifier.fromId(1), "acme", options);

    }

    @Test
    public void testAllWarehouses() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<Warehouse> responseEntity = this.api.merchants().allWarehouses(Identifier.fromId(1), options);

        String expectedResponseJson = this.loadFixture("/fixtures/MerchantAllWarehousesResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Warehouse entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testAttachWarehouse() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.merchants().attachWarehouse(Identifier.fromId(1), Identifier.fromId(1), options);

    }

    @Test
    public void testDetachWarehouse() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.merchants().detachWarehouse(Identifier.fromId(1), Identifier.fromId(1), options);

    }

}
