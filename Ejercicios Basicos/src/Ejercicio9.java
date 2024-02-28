import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Total de la compra: ");
        double TCompra = scanner.nextDouble();
        double Descuento = 0.15 * TCompra;
        double TPagar = TCompra - Descuento;

        System.out.println("Descuento aplicado de 15%." + "Total a pagar: " + TPagar);

    }
}