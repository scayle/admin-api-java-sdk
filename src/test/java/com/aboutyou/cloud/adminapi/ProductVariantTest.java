package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("unchecked")
public class ProductVariantTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductVariantCreateRequest.json");
        ProductVariant requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ProductVariant.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    ProductVariant responseEntity = this.api.productVariants().create("1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantCreateResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));

        HashMap<String, Class<?>> attributesMapping = new HashMap<>();
            attributesMapping.put("simple", SimpleAttribute.class);
            attributesMapping.put("simpleList", SimpleAttributeList.class);
            attributesMapping.put("localizedString", LocalizedAttribute.class);
            attributesMapping.put("localizedStringList", LocalizedAttributeList.class);
            attributesMapping.put("advanced", AdvancedAttribute.class);
            attributesMapping.put("advancedList", AdvancedAttributeList.class);
        this.assertPropertyHasCorrectPolymorphicType(responseEntity, "attributes", "type", attributesMapping);

    }

    @Test
    public void testFind() throws Exception {

    ProductVariant responseEntity = this.api.productVariants().find("1", "1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantFindResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));

        HashMap<String, Class<?>> attributesMapping = new HashMap<>();
            attributesMapping.put("simple", SimpleAttribute.class);
            attributesMapping.put("simpleList", SimpleAttributeList.class);
            attributesMapping.put("localizedString", LocalizedAttribute.class);
            attributesMapping.put("localizedStringList", LocalizedAttributeList.class);
            attributesMapping.put("advanced", AdvancedAttribute.class);
            attributesMapping.put("advancedList", AdvancedAttributeList.class);
        this.assertPropertyHasCorrectPolymorphicType(responseEntity, "attributes", "type", attributesMapping);

    }

    @Test
    public void testAll() throws Exception {

    ApiCollection<ProductVariant> responseEntity = this.api.productVariants().all("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (ProductVariant entity : responseEntity.getEntities()) {
            HashMap<String, Class<?>> attributesMapping = new HashMap<>();
                attributesMapping.put("simple", SimpleAttribute.class);
                attributesMapping.put("simpleList", SimpleAttributeList.class);
                attributesMapping.put("localizedString", LocalizedAttribute.class);
                attributesMapping.put("localizedStringList", LocalizedAttributeList.class);
                attributesMapping.put("advanced", AdvancedAttribute.class);
                attributesMapping.put("advancedList", AdvancedAttributeList.class);
            this.assertPropertyHasCorrectPolymorphicType(entity, "attributes", "type", attributesMapping);
        }
    }

    @Test
    public void testReplace() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductVariantReplaceRequest.json");
        ProductVariant requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, ProductVariant.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    ProductVariant responseEntity = this.api.productVariants().replace("1", "1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductVariantReplaceResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));

        HashMap<String, Class<?>> attributesMapping = new HashMap<>();
            attributesMapping.put("simple", SimpleAttribute.class);
            attributesMapping.put("simpleList", SimpleAttributeList.class);
            attributesMapping.put("localizedString", LocalizedAttribute.class);
            attributesMapping.put("localizedStringList", LocalizedAttributeList.class);
            attributesMapping.put("advanced", AdvancedAttribute.class);
            attributesMapping.put("advancedList", AdvancedAttributeList.class);
        this.assertPropertyHasCorrectPolymorphicType(responseEntity, "attributes", "type", attributesMapping);

    }

    @Test
    public void testDelete() throws Exception {

    this.api.productVariants().delete("1", "1",  null);

    }

}