package modulo4_4_4_5_actividad06;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.*;
import org.junit.jupiter.api.Test;

class Actividad06Test {
  @Test
  void compruebaCódigo() throws Exception {
    String s =
        Files.readString(Path.of("src/main/java/modulo4_4_4_5_actividad06/Actividad06.java"));
    assertTrue(s.replace(" ", "").contains("nextDouble()"), "Debe usarse nextDouble()");
    assertTrue(s.replace(" ", "").contains("heads"), "Debe usarse heads");
    assertTrue(s.replace(" ", "").contains("tails"), "Debe usarse tails");
  }
}
