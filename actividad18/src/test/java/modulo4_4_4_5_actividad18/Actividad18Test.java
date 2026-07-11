package modulo4_4_4_5_actividad18;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.*;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
class Actividad18Test {
 @Test void salidaEsperada() throws Exception { ByteArrayOutputStream b=new ByteArrayOutputStream(); PrintStream old=System.out; System.setOut(new PrintStream(b,true,StandardCharsets.UTF_8)); try {Actividad18.main(new String[0]);} finally {System.setOut(old);} assertEquals("Media: 7.5\nRound: 8\nCeil: 8.0\nFloor: 7.0",b.toString(StandardCharsets.UTF_8).replace("\r\n","\n").trim()); }
}
