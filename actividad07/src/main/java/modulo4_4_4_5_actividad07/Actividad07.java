package modulo4_4_4_5_actividad07;

import java.util.Random;

public class Actividad07 {
  public static void main(String[] args) {
    // TODO
	  System.out.println("Generador de dado");
	  Random rand = new Random();
	  int num = rand.nextInt(6)+1;
	  System.out.println("Dado: " + num);
	  
	  
  }
}
