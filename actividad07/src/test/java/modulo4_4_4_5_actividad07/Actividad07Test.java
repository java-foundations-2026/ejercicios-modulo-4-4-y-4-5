package modulo4_4_4_5_actividad07;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.nio.file.*;
import org.junit.jupiter.api.Test;
class Actividad07Test { @Test void compruebaCódigo() throws Exception { String s=Files.readString(Path.of("src/main/java/modulo4_4_4_5_actividad07/Actividad07.java")); assertTrue(s.replace(" ", "").contains("nextInt(6)"), "Debe usarse nextInt(6)");
assertTrue(s.replace(" ", "").contains("+1"), "Debe usarse +1"); } }
