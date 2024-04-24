package com.scayle.adminapi;

import com.scayle.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("unchecked")
public class AudienceTest extends BaseApiTest {

    @Test
    public void testGetAudiences() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<Audience> responseEntity = this.api.audiences().getAudiences(options);

        String expectedResponseJson = this.loadFixture("/fixtures/AudienceGetAudiencesResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Audience entity : responseEntity.getEntities()) {
        }
    }

}
