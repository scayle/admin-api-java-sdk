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
public class ShopCategoryProductSetUnlinkInstructionTest extends BaseApiTest {

    @Test
    public void testUnlink() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ShopCategoryProductSetUnlinkInstructionUnlinkRequest.json");
        ShopCategoryProductSetUnlinkInstruction requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ShopCategoryProductSetUnlinkInstruction.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

        ApiOptions options = ApiOptions.builder().build();
        this.api.shopCategoryProductSetUnlinkInstructions().unlink("acme", 1, requestEntity, options);

    }

}
