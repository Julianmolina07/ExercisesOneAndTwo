import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el primer numero: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite el primer numero: ");
        double num2 = sc.nextDouble();

        System.out.println("El resultado de la suma es: " + (num1 + num2));
        System.out.println("El resultado de la resta es: " + (num1 - num2));
        System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
        System.out.println("El resultado de la division es: " + (num1 / num2));

    }
}