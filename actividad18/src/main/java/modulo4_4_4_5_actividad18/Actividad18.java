package modulo4_4_4_5_actividad18;

public class Actividad18 {
  public static void main(String[] args) {
    double a = 7, b = 8, c = 7.5;
    // TODO
    double notaMedia = (a+b+c)/3;
    System.out.println("Nota media sin redondear: " + notaMedia);
    System.out.println("Nota media redondeada: " + (notaMedia = Math.round(notaMedia)));
  }
}
