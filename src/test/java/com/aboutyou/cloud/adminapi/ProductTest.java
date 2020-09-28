package com.aboutyou.cloud.adminapi;

import com.aboutyou.cloud.adminapi.model.*;

import org.junit.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;
import static net.javacrumbs.jsonunit.core.Option.TREATING_NULL_AS_ABSENT;

import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("unchecked")
public class ProductTest extends BaseApiTest {

    @Test
    public void testCreate() throws Exception {
        String expectedRequestJson = this.loadFixture("/fixtures/ProductCreateRequest.json");
        Product requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Product.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Product responseEntity = this.api.products().create(requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductCreateResponse.json");
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

    Product responseEntity = this.api.products().find("1",  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductFindResponse.json");
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

    ApiCollection<Product> responseEntity = this.api.products().all( null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductAllResponse.json");
        assertThatJson(expectedResponseJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(responseEntity));


        for (Product entity : responseEntity.getEntities()) {
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
        String expectedRequestJson = this.loadFixture("/fixtures/ProductReplaceRequest.json");
        Product requestEntity = this.jsonSerializer.unserializeApiObject(expectedRequestJson, Product.class);

        assertThatJson(expectedRequestJson)
            .when(TREATING_NULL_AS_ABSENT)
            .isEqualTo(this.jsonSerializer.serializeApiObject(requestEntity));

    Product responseEntity = this.api.products().replace("1", requestEntity,  null);

        String expectedResponseJson = this.loadFixture("/fixtures/ProductReplaceResponse.json");
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

    this.api.products().delete("1",  null);

    }

}