import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primer numero: ");
        double Nm = scanner.nextDouble();

        System.out.println("Segundo numero: ");
        double Nm2 = scanner.nextDouble();

        System.out.println("Tercer numero: ");
        double Nm3 = scanner.nextDouble();

        double media = (Nm + Nm2 + Nm3) / 3;

        System.out.println("La media: " + media);

    }
}
