import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número:");
        double numero = scanner.nextDouble();
        
        double raizCuadrada = calcularRaizCuadrada(numero);
        double raizCubica = calcularRaizCubica(numero);
        
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
        System.out.println("La raíz cúbica de " + numero + " es: " + raizCubica);
        
    }
    
    public static double calcularRaizCuadrada(double num) {
        return Math.sqrt(num);
    }
    
    public static double calcularRaizCubica(double num) {
        return Math.cbrt(num);
    }
}
