import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ingresa su temperatura en Fahrenheit: ");
        Double temp = sc.nextDouble();

        System.out.println("Su temperatura ahora en Celsius es: " + ((temp-32) * 5/9));
    }
}
