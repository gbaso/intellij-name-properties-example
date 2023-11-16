package io.github.gbaso.intellijnamepropertiesexample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
    "example.public=some-value"
})
class ExamplePropertiesTest {

  @Autowired
  ExampleProperties exampleProperties;

  @Test
  void publicPropertyShouldBeBound() {
    assertThat(exampleProperties.publicProperty()).isEqualTo("some-value");
  }

}
