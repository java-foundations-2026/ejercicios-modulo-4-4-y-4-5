package modulo4_4_4_5_actividad06;
import java.util.Random;

public class Actividad06 {
  public static void main(String[] args) {
    // TODO
	  Random rand = new Random();
	  double num = rand.nextDouble();
	  
	  if (num < 0.5) {
		  System.out.println("heads");
	  }else {
		  System.out.println("tails");
	  }
  }
}
