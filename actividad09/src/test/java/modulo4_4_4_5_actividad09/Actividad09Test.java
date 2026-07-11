package modulo4_4_4_5_actividad09;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.*;
import org.junit.jupiter.api.Test;

class Actividad09Test {
  @Test
  void compruebaCódigo() throws Exception {
    String s =
        Files.readString(Path.of("src/main/java/modulo4_4_4_5_actividad09/Actividad09.java"));
    assertTrue(s.replace(" ", "").contains("nextInt(3)"), "Debe usarse nextInt(3)");
    assertTrue(s.replace(" ", "").contains("piedra"), "Debe usarse piedra");
    assertTrue(s.replace(" ", "").contains("papel"), "Debe usarse papel");
    assertTrue(s.replace(" ", "").contains("tijera"), "Debe usarse tijera");
  }
}
