package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class VoucherTest extends BaseApiTest {

    @Test
    public void testAll() throws Exception {

    ApiCollection<Voucher> responseEntity = this.api.vouchers().all("1", "1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/VoucherAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Voucher entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGet() throws Exception {

    Voucher responseEntity = this.api.vouchers().get("1", "1", 1,  null);

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

    Voucher responseEntity = this.api.vouchers().create("1", "1", requestEntity,  null);

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

    Voucher responseEntity = this.api.vouchers().update("1", "1", 1, requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/VoucherUpdateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDelete() throws Exception {

    this.api.vouchers().delete("1", "1", 1,  null);

    }

    @Test
    public void testGetCriteria() throws Exception {

    ApiCollection<VoucherCriterion> responseEntity = this.api.vouchers().getCriteria("1", "1", 1,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/VoucherGetCriteriaResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (VoucherCriterion entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testGetCriterion() throws Exception {

    VoucherCriterion responseEntity = this.api.vouchers().getCriterion("1", "1", 1, 1,  null);

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

    VoucherCriterion responseEntity = this.api.vouchers().createCriterion("1", "1", 1, requestEntity,  null);

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

    VoucherCriterion responseEntity = this.api.vouchers().updateCriterion("1", "1", 1, 1, requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/VoucherUpdateCriterionResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testDeleteCriterion() throws Exception {

    this.api.vouchers().deleteCriterion("1", "1", 1, 1,  null);

    }

}