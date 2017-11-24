package RomanNumberConverter;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class RomanNumberConverter {

    RomanNumberConverter convert;

  @Before
      public void setup() {
      convert = new RomanNumberConverter();
  }

  @Test
      public void check() {
      assertThat(convert.convert("I"))
	  .isNotEmpty()
      .isEqualTo(1);
      }
}
