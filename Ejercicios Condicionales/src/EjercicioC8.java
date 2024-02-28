import java.util.Scanner;

public class EjercicioC8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tamaño lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.println("Tamaño lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.println("Tamaño lado 3: ");
        double lado3 = scanner.nextDouble();

        if (Triangulo(lado1, lado2, lado3)) {
            System.out.println("El triangulo es: " + CTriangulo(lado1, lado2, lado3));
        } else {
            System.out.println("No es un triangulo válido.");
        }
    }

    public static boolean Triangulo(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado3 + lado1 > lado2);

    }

    public static String CTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilatero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            return "Isosceles";
        } else if ((lado1 * lado1 + lado2 * lado2 == lado3 * lado3) ||
                   (lado2 * lado2 + lado3 * lado3 == lado1 * lado1) ||
                   (lado3 * lado3 + lado1 * lado1 == lado2 * lado2)) {
            return "Rectangulo";
        } else {
            return "Escaleno";
        }
    }
}