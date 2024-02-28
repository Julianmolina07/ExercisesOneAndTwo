import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la variable A:");
        int A = scanner.nextInt();
        
        System.out.println("Ingrese el valor de la variable B:");
        int B = scanner.nextInt();
        
        System.out.println("Valores originales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        
        int temp = A;
        A = B;
        B = temp;
        
        System.out.println("Valores después del intercambio:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    
    }
}
