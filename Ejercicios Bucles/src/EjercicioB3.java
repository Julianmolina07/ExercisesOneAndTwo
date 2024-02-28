import java.util.Scanner;

public class EjercicioB3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese caracteres (termina con un espacio):");
        char caracter;

        while ((caracter = scanner.next().charAt(0)) != ' ') {
            if (esVocal(caracter)) {
                System.out.println("VOCAL");
            } else {
                System.out.println("NO VOCAL");
            }
        }
    }

    public static boolean esVocal(char c) {
        c = Character.toUpperCase(c);

        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}