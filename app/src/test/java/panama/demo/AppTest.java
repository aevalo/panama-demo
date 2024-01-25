package panama.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.nativelib.NativeLib;

class AppTest {
  @Test void nativeLibFactorial() {
    assertEquals(120, NativeLib.factorial(5), "app should have a greeting");
  }
}
