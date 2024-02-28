import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese el nombre y los dos apellidos
        System.out.println("Ingrese el nombre y los dos apellidos:");
        String nombre = sc.nextLine();

        // Separar el nombre y los apellidos por espacios
        String[] partes = nombre.split(" ");

        // Validar que el usuario haya ingresado tres partes
        if (partes.length != 3) {
            System.out.println("Debe ingresar el nombre y los dos apellidos.");
            return;
        }

        // Obtener la primera letra de cada parte
        char inicialNombre = partes[0].charAt(0);
        char inicialApellido1 = partes[1].charAt(0);
        char inicialApellido2 = partes[2].charAt(0);

        // Mostrar las iniciales por pantalla
        System.out.println("Las iniciales son: " + inicialNombre + "." + inicialApellido1 + "." + inicialApellido2 + ".");
    }

}
