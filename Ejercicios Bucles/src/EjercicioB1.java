import java.util.Random;
import java.util.Scanner;

public class EjercicioB1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1;
        int intentos = 10;
        int intento;
        System.out.println("¡Juego de adivinar el NUMERO!");
        System.out.println("Tienes 10 intentos para adivinar el numero del 1 al 100.");

        do {
            System.out.println("Ingresa tu intento:");
            intento = scanner.nextInt();
            intentos--;

            if (intento == numeroAdivinar) {
                System.out.println("¡Felicidades! Has adivinado el numero.");
                break;
            } else if (intento < numeroAdivinar) {
                System.out.println("El numero es mayor. Intentos restantes: " + intentos);
            } else {
                System.out.println("El numero es menor. Intentos restantes: " + intentos);
            }

            if (intentos == 0) {
                System.out.println("Te has quedado sin intentos. El numero era: " + numeroAdivinar);
            }

        } while (intentos > 0);
    }
}