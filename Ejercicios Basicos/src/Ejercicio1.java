import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Como es tu nombre?");
        String nombre = sc.next();

        System.out.println("Hola " + nombre + ", espero que tengas buen dia" );
    }
}
