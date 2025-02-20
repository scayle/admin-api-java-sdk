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
public class VoucherTest extends BaseApiTest {

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<Voucher> responseEntity = this.api.vouchers().all("acme", "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/VoucherAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Voucher entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGet() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Voucher responseEntity = this.api.vouchers().get("acme", "acme", 1, options);

        String expectedResponseJson = this.loadFixture("/fixtures/VoucherGetResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/VoucherCreateRequest.json");
        Voucher requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Voucher.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Voucher responseEntity = this.api.vouchers().create("acme", "acme", requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/VoucherCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/VoucherUpdateRequest.json");
        Voucher requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Voucher.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Voucher responseEntity = this.api.vouchers().update("acme", "acme", 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/VoucherUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.vouchers().delete("acme", "acme", 1, options);

    }

    @Test
    public void testGetCriteria() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<VoucherCriterion> responseEntity = this.api.vouchers().getCriteria("acme", "acme", 1, options);

        String expectedResponseJson = this.loadFixture("/fixtures/VoucherGetCriteriaResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (VoucherCriterion entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGetCriterion() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        VoucherCriterion responseEntity = this.api.vouchers().getCriterion("acme", "acme", 1, 1, options);

        String expectedResponseJson = this.loadFixture("/fixtures/VoucherGetCriterionResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testCreateCriterion() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/VoucherCreateCriterionRequest.json");
        VoucherCriterion requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, VoucherCriterion.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        VoucherCriterion responseEntity = this.api.vouchers().createCriterion("acme", "acme", 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/VoucherCreateCriterionResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testUpdateCriterion() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/VoucherUpdateCriterionRequest.json");
        VoucherCriterion requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, VoucherCriterion.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        VoucherCriterion responseEntity = this.api.vouchers().updateCriterion("acme", "acme", 1, 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/VoucherUpdateCriterionResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCriterion() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.vouchers().deleteCriterion("acme", "acme", 1, 1, options);

    }

}
