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
public class ChannelTest extends BaseApiTest {

    @Test
    public void testCreateChannel() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ChannelCreateChannelRequest.json");
        ChannelCreateRequest requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ChannelCreateRequest.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Channel responseEntity = this.api.channels().createChannel(1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ChannelCreateChannelResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testGetChannel() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        Channel responseEntity = this.api.channels().getChannel(1, 1, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ChannelGetChannelResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

    @Test
    public void testAll() throws Exception {

        ApiOptions options = ApiOptions.builder().build();
        ApiCollection<Channel> responseEntity = this.api.channels().all(1, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ChannelAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Channel entity : responseEntity.getEntities()) {
        }
    }

    @Test
    public void testUpdateChannel() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ChannelUpdateChannelRequest.json");
        ChannelUpdateRequest requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ChannelUpdateRequest.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        Channel responseEntity = this.api.channels().updateChannel(1, 1, requestEntity, options);

        String expectedResponseJson = this.loadFixture("/fixtures/ChannelUpdateChannelResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


    }

}
