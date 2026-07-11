package modulo4_4_4_5_actividad20;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.*;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
class Actividad20Test {
 @Test void salidaEsperada() throws Exception { ByteArrayOutputStream b=new ByteArrayOutputStream(); PrintStream old=System.out; System.setOut(new PrintStream(b,true,StandardCharsets.UTF_8)); try {Actividad20.main(new String[0]);} finally {System.setOut(old);} assertEquals("IMC redondeado: 22",b.toString(StandardCharsets.UTF_8).replace("\r\n","\n").trim()); }
}
