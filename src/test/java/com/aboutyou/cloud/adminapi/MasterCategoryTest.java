package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class MasterCategoryTest extends BaseApiTest {

    @Test
    public void testAll() throws Exception {

    ApiCollection<MasterCategory> responseEntity = this.api.masterCategories().all( null);

        String expectedResponseJson = this.loadFixture("/fixtures/MasterCategoryAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (MasterCategory entity : responseEntity.getEntities()) {
        }
    }

}