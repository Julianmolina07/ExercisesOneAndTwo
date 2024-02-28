import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
     
        
        System.out.println("Calificacion Primer Parcial: ");
        double P1 = scanner.nextDouble();
        System.out.println("Calificacion Segundo Parcial: ");
        double P2 = scanner.nextDouble();
        System.out.println("Calificacion Tercer Parcial: ");
        double P3 = scanner.nextDouble();
        System.out.println("Calificacion Examen Final: ");
        double EXFinal = scanner.nextDouble();
        System.out.println("Calificacion Trabajo Final: ");
        double TFinal = scanner.nextDouble();
        double PromedioP = (P1 + P2 + P3) / 3;
        double CalificacionF = 0.55 * PromedioP + 0.30 * EXFinal + 0.15 * TFinal;

        System.out.println("Calificacion Final: " + CalificacionF);

    }
}