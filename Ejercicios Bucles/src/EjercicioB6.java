import java.util.Scanner;

public class EjercicioB6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la base:");
        double base = sc.nextDouble();
        System.out.println("Ingrese el exponente:");
        int exponente = sc.nextInt();

        if (exponente < 0) {
            System.out.println("El exponente debe ser positivo.");
            return;
        }

        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        System.out.println("El resultado es: " + resultado);
    }

}
