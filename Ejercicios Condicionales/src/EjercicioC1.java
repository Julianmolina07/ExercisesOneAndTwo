import java.util.Scanner;

public class EjercicioC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();

        if (num1>num2) {
            System.out.println("El numero " + num1 + " es mayor que el numero " + num2);
        }else if (num2>num1) {
            System.out.println("El numero " + num2 + " es mayor que el numero " + num1);
        }else{
            System.out.println("Los dos numeros son iguales");
        }

    }
}
