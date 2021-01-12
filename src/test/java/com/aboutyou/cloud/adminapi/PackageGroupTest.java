package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class PackageGroupTest extends BaseApiTest {

    @Test
    public void testAll() throws Exception {

    ApiCollection<PackageGroup> responseEntity = this.api.packageGroups().all("1",  null);

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

    this.api.packageGroups().assignPackageGroupToWarehouses("1", 1, requestEntity,  null);

    }

    @Test
    public void testReplacePackageGroupForWarehouses() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/PackageGroupReplacePackageGroupForWarehousesRequest.json");
        List<PackageGroupWarehouse> requestEntity = this.jsonSerializer.unserializeList(expectedRequestJson, PackageGroupWarehouse.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    this.api.packageGroups().replacePackageGroupForWarehouses("1", 1, requestEntity,  null);

    }

    @Test
    public void testDelete() throws Exception {

    this.api.packageGroups().delete("1", 1,  null);

    }

}