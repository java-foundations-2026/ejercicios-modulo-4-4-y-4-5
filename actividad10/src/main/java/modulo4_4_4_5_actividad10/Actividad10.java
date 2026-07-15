package modulo4_4_4_5_actividad10;

import java.util.Random;

public class Actividad10 {
  public static void main(String[] args) {
    // TODO
	  Random rand1 = new Random(1);
	  int a1 = rand1.nextInt();
	  int a2 = rand1.nextInt();
	  int a3 = rand1.nextInt();
	  
	  Random rand2 = new Random(1);
	  int b1 = rand2.nextInt();
	  int b2 = rand2.nextInt();
	  int b3 = rand2.nextInt();
	  
	  boolean sonIguales = (a1 == b1 && a2 == b2 && a3 ==b3);
	  
	  System.out.println("Secuencias iguales: " + sonIguales);
  }
}
