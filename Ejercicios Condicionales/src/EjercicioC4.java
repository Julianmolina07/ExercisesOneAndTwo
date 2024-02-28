import java.util.Scanner;

public class EjercicioC4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una LETRA: ");
        char letra =  scanner.next().charAt(0);

        if (Character.isUpperCase(letra)) {

            System.out.println("Letra mayuscula.");
            
        } else {
            
            System.out.println("Letra NO mayuscula.");

        }

    }
}