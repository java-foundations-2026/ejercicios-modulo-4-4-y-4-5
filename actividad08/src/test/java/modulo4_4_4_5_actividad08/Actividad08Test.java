package modulo4_4_4_5_actividad08;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.*;
import org.junit.jupiter.api.Test;

class Actividad08Test {
  @Test
  void compruebaCódigo() throws Exception {
    String s =
        Files.readString(Path.of("src/main/java/modulo4_4_4_5_actividad08/Actividad08.java"));
    assertTrue(s.replace(" ", "").contains("nextInt(48)"), "Debe usarse nextInt(48)");
    assertTrue(s.replace(" ", "").contains("+18"), "Debe usarse +18");
  }
}
