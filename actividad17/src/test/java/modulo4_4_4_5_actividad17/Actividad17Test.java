package modulo4_4_4_5_actividad17;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.*;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
class Actividad17Test {
 @Test void salidaEsperada() throws Exception { ByteArrayOutputStream b=new ByteArrayOutputStream(); PrintStream old=System.out; System.setOut(new PrintStream(b,true,StandardCharsets.UTF_8)); try {Actividad17.main(new String[0]);} finally {System.setOut(old);} assertEquals("Raíz: 4.0\nCuadrado: 256.0",b.toString(StandardCharsets.UTF_8).replace("\r\n","\n").trim()); }
}
