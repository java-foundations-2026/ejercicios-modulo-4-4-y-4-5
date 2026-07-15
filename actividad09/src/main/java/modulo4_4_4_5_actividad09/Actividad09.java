package modulo4_4_4_5_actividad09;

import java.util.Random;

public class Actividad09 {
  public static void main(String[] args) {
    // TODO
	  Random rand = new Random();
	  int num = rand.nextInt(3);
	  
	  if (num == 0) {
		  System.out.println("Piedra");
	  }else if(num == 1) {
		  System.out.println("Papel");
	  }else {
		  System.out.println("Tijeras");
	  }
  }
}
