import java.util.Scanner;

public class EjercicioC10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de uva (A o B):");
        String tipo = scanner.next();
        
        System.out.println("Ingrese el tamaño de la uva (1 o 2):");
        int tamaño = scanner.nextInt();
        
        System.out.println("Ingrese el precio inicial por kilo de uva:");
        double precioInicial = scanner.nextDouble();
        
        double precioFinal = calcularPrecioFinal(tipo, tamaño, precioInicial);
        
        System.out.println("El precio final por kilo de uva entregada es: " + precioFinal + " euros.");
        
    }
    
    public static double calcularPrecioFinal(String tipo, int tamaño, double precioInicial) {
        if (tipo.equalsIgnoreCase("A")) {
            if (tamaño == 1) {
                precioInicial += 0.20; 
            } else if (tamaño == 2) {
                precioInicial += 0.30; 
            }
        } else if (tipo.equalsIgnoreCase("B")) {
            if (tamaño == 1) {
                precioInicial -= 0.30; 
            } else if (tamaño == 2) {
                precioInicial -= 0.50; 
            }
        }
        
        return precioInicial;
    }
}