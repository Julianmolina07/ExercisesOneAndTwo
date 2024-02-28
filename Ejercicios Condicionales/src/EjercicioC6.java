import java.util.Scanner;

public class EjercicioC6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nota: ");
        int nota = scanner.nextInt();
        System.out.println("Edad: ");
        int edad = scanner.nextInt();
        System.out.println("Sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("POSIBLE");
            } else if (sexo == 'F') {
                System.out.println("ACEPTADA");
            } else {
                System.out.println("NO ACEPTADA");
            }
        } else {
            System.out.println("NO ACEPTADA");
        }
    }
}