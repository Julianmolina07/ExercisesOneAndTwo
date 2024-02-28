import java.util.Scanner;

public class EjercicioB2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cantidad de numeros: ");
        int cantidadNumeros = scanner.nextInt();
        int mayoresCero = 0;
        int menoresCero = 0;
        int igualesCero = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingrese un numero:");
            int numero = scanner.nextInt();

            if (numero > 0) {
                mayoresCero++;
            } else if (numero < 0) {
                menoresCero++;
            } else {
                igualesCero++;
            }
        }

        System.out.println("Numeros mayores a 0: " + mayoresCero);
        System.out.println("Numeros menores a 0: " + menoresCero);
        System.out.println("Numeros iguales a 0: " + igualesCero);
    }
}