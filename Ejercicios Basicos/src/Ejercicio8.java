import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sueldo base de VENDEDOR: ");
        double SBase = scanner.nextDouble();
        System.out.println("Ventas del mes: ");
        double VMes = scanner.nextDouble();

        double comision = 0.10 * VMes;
        double Sueldo = SBase + comision;

        System.out.println("Comision a recibir el VENDEDOR: " + comision);
        System.out.println("Sueldo del mes: " + Sueldo);

    }
}
