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
public class HostingTest extends BaseApiTest {

    @Test
    public void testPurgeCdnCacheForAllUrls() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/HostingPurgeCdnCacheForAllUrlsRequest.json");
        PurgeAllRequest requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, PurgeAllRequest.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        this.api.hostings().purgeCdnCacheForAllUrls("acme", "acme", requestEntity, options);

    }

    @Test
    public void testPurgeCdnCacheForUrlPrefixes() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/HostingPurgeCdnCacheForUrlPrefixesRequest.json");
        PurgeUrlPrefixesRequest requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, PurgeUrlPrefixesRequest.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        this.api.hostings().purgeCdnCacheForUrlPrefixes("acme", "acme", requestEntity, options);

    }

}
