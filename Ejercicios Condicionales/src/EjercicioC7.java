import java.util.Scanner;

public class EjercicioC7 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
  
    System.out.println("Introduce los datos de la primera circunferencia:");

    System.out.print("Coordenada x del centro: ");
    double x1 = sc.nextDouble();

    System.out.print("Coordenada y del centro: ");
    double y1 = sc.nextDouble();

    System.out.print("Radio: ");
    double r1 = sc.nextDouble();
    
    
    System.out.println("Introduce los datos de la segunda circunferencia:");

    System.out.print("Coordenada x del centro: ");
    double x2 = sc.nextDouble();

    System.out.print("Coordenada y del centro: ");
    double y2 = sc.nextDouble();

    System.out.print("Radio: ");
    double r2 = sc.nextDouble();
    
    
    double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    
    
    if (distancia == 0) { 

      System.out.println("Las circunferencias son concéntricas.");

    } else if (distancia > r1 + r2) { 

      System.out.println("Las circunferencias son exteriores.");

    } else if (distancia == r1 + r2) {

      System.out.println("Las circunferencias son tangentes exteriores.");

    } else if (distancia < Math.abs(r1 - r2)) { 

      System.out.println("Las circunferencias son interiores.");

    } else if (distancia == Math.abs(r1 - r2)) {

      System.out.println("Las circunferencias son tangentes interiores.");

    } else {

      System.out.println("Las circunferencias son secantes.");

    }
    
  }
}


