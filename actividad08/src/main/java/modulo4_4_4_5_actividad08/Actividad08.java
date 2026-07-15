package modulo4_4_4_5_actividad08;
import java.util.Random;

public class Actividad08 {
  public static void main(String[] args) {
    // TODO
	  System.out.println("Genera una edad aleatoria válida");
	  Random rand = new Random();
	  int age = rand.nextInt(48)+18;
	  System.out.println("Edad: " + age);
	  
	  
  }
}
