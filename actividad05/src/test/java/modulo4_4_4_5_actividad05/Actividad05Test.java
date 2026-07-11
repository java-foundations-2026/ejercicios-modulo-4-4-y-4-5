package modulo4_4_4_5_actividad05;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.nio.file.*;
import org.junit.jupiter.api.Test;
class Actividad05Test { @Test void compruebaCódigo() throws Exception { String s=Files.readString(Path.of("src/main/java/modulo4_4_4_5_actividad05/Actividad05.java")); assertTrue(s.replace(" ", "").contains("newRandom"), "Debe usarse new Random");
assertTrue(s.replace(" ", "").contains("nextInt()"), "Debe usarse nextInt()"); } }
