import java.util.Scanner;

public class EjercicioA1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Numeros en orden inverso:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}