package hello;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class HelloTest {

  Hello hello;

  @Before
  public void setup() {
    hello = new Hello();
  }

  @Test
  public void check() {
    assertThat(hello.hello("Quentin"))
      .isNotEmpty()
      .contains("Hello")
      .endsWith("!")
      .isEqualTo("Hello Quentin!");
  }

  @Test
  public void check_null() {
    assertThatThrownBy(() -> hello.hello(null))
      .isInstanceOf(IllegalArgumentException.class)
      .hasMessageContaining("cannot be null");
  }
}
