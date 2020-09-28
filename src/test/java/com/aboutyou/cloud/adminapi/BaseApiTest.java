package com.aboutyou.cloud.adminapi;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Map;

import com.aboutyou.cloud.adminapi.model.ApiConfiguration;
import com.aboutyou.cloud.adminapi.model.ApiObjectInterface;
import com.aboutyou.cloud.adminapi.serializer.JsonSerializer;

public class BaseApiTest {
    protected AdminAPI api;
    protected JsonSerializer jsonSerializer;

    public BaseApiTest() {
        System.setProperty("json-unit.libraries", "moshi");

        ApiConfiguration apiConfiguration = ApiConfiguration.builder()
                                            .url("http://127.0.0.1:4010")
                                            .accessToken("abc123")
                                            .build();

        this.api = new AdminAPI(apiConfiguration);
        this.jsonSerializer = new JsonSerializer();
    }

    protected String loadFixture(String path) throws IOException {
      return this.getResourceAsString(path);
    }

    protected void assertPropertyHasCorrectPolymorphicType(
      ApiObjectInterface apiObject,
      String propertyName,
      String discriminator,
      Map<String, Class<?>> mapping
    ) throws Exception {
      Object propertyValue = this.getProperty(apiObject, propertyName);

        if (propertyValue == null) {
            return;
        }

      if (propertyValue instanceof Iterable) {
        for (Object propertyItem : (Iterable<Object>) propertyValue) {
          this.assertPropertyHasCorrectPolymorphicTypeInternal(propertyItem, propertyName, discriminator, mapping);
        }
      } else {
          this.assertPropertyHasCorrectPolymorphicTypeInternal(propertyValue, propertyName, discriminator, mapping);
      }
    }

    private void assertPropertyHasCorrectPolymorphicTypeInternal(
      Object obj,
      String propertyName,
      String discriminator,
      Map<String, Class<?>> mapping
    ) throws Exception {
          Class<?> actualClass = obj.getClass();
          String discriminatorValue = "";
          Class<?> expectedClass = null;

          try {
             discriminatorValue = (String) this.getProperty(obj, discriminator);
          } catch (Exception ex) {
            throw new AssertionError(String.format("Mising discriminator '%s' on %s", discriminator, actualClass.toString()));
          }

          if (mapping.containsKey(discriminatorValue)) {
            expectedClass = mapping.get(discriminatorValue);
          } else {
            throw new AssertionError(String.format("Mising polymorphic mapping for '%s'", discriminatorValue));
          }

          assertEquals(expectedClass, actualClass);
    }

    private Object getProperty(Object obj, String propertyName) throws Exception {
      Class<?> actualClass = obj.getClass();
      Field field = actualClass.getDeclaredField(propertyName);
      field.setAccessible(true);
      return field.get(obj);
    }

    private String getResourceAsString(String path) throws IOException {
      InputStream resource = getClass().getResourceAsStream(path);

      ByteArrayOutputStream os = new ByteArrayOutputStream(1024);
      byte[] buf = new byte[1024];

      for (int i = resource.read(buf); i > 0; i = resource.read(buf)) {
        os.write(buf, 0, i);
      }

      return os.toString("utf8");
    }
}