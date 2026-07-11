package modulo4_4_4_5_actividad10;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.*;
import org.junit.jupiter.api.Test;

class Actividad10Test {
  @Test
  void compruebaCódigo() throws Exception {
    String s =
        Files.readString(Path.of("src/main/java/modulo4_4_4_5_actividad10/Actividad10.java"));
    assertTrue(s.replace(" ", "").contains("newRandom(2026)"), "Debe usarse new Random(2026)");
    assertTrue(s.replace(" ", "").contains("nextInt(100)"), "Debe usarse nextInt(100)");
  }
}
