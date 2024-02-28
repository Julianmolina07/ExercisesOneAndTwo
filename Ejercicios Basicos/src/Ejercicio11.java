import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el primer número:");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Ingresa el segundo número:");
        double numero2 = scanner.nextDouble();
        
        double distancia = calcularDistancia(numero1, numero2);
        
        System.out.println("La distancia entre " + numero1 + " y " + numero2 + " es: " + distancia);
        
    }
    
    public static double calcularDistancia(double num1, double num2) {
        
        return Math.abs(num1 - num2);
    }
}
