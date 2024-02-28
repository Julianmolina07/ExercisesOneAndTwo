import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de monedas de 2 euros: ");
        int monedas2Euros = scanner.nextInt();

        System.out.print("Ingrese la cantidad de monedas de 1 euro: ");
        int monedas1Euro = scanner.nextInt();

        System.out.print("Ingrese la cantidad de monedas de 50 céntimos: ");
        int monedas50Centimos = scanner.nextInt();

        System.out.print("Ingrese la cantidad de monedas de 20 céntimos: ");
        int monedas20Centimos = scanner.nextInt();

        System.out.print("Ingrese la cantidad de monedas de 10 céntimos: ");
        int monedas10Centimos = scanner.nextInt();

 
        double dineroTotal = calcularDineroTotal(monedas2Euros, monedas1Euro, monedas50Centimos, monedas20Centimos, monedas10Centimos);

    
        System.out.println("Tienes un total de " + dineroTotal + " euros.");
    }


    public static double calcularDineroTotal(int monedas2Euros, int monedas1Euro, int monedas50Centimos, int monedas20Centimos, int monedas10Centimos) {

        double valor2Euros = monedas2Euros * 2.0;
        double valor1Euro = monedas1Euro * 1.0;
        double valor50Centimos = monedas50Centimos * 0.5;
        double valor20Centimos = monedas20Centimos * 0.2;
        double valor10Centimos = monedas10Centimos * 0.1;

        double dineroTotal = valor2Euros + valor1Euro + valor50Centimos + valor20Centimos + valor10Centimos;

        return dineroTotal;
    }
}