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
public class PackageGroupTest extends BaseApiTest {

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<PackageGroup> responseEntity = this.api.packageGroups().all("acme", "acme", options);

        String expectedResponseJson = this.loadFixture("/fixtures/PackageGroupAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (PackageGroup entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testAssignPackageGroupToWarehouses() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/PackageGroupAssignPackageGroupToWarehousesRequest.json");
        List<PackageGroupWarehouse> requestEntity = this.jsonSerializer.unserializeList(expectedRequestJson, PackageGroupWarehouse.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        this.api.packageGroups().assignPackageGroupToWarehouses("acme", "acme", 1, requestEntity, options);

    }

    @Test
    public void testReplacePackageGroupForWarehouses() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/PackageGroupReplacePackageGroupForWarehousesRequest.json");
        List<PackageGroupWarehouse> requestEntity = this.jsonSerializer.unserializeList(expectedRequestJson, PackageGroupWarehouse.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        this.api.packageGroups().replacePackageGroupForWarehouses("acme", "acme", 1, requestEntity, options);

    }

    @Test
    public void testDelete() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        this.api.packageGroups().delete("acme", "acme", 1, options);

    }

}
