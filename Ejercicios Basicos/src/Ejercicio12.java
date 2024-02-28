import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese las coordenadas del primer punto (x1, y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.println("Ingrese las coordenadas del segundo punto (x2, y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        double distancia = calcularDistancia(x1, y1, x2, y2);
        
        System.out.println("La distancia entre los puntos (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ") es: " + distancia);
        
    }
    
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double diferenciaX = x2 - x1;
        double diferenciaY = y2 - y1;
        return Math.sqrt(diferenciaX * diferenciaX + diferenciaY * diferenciaY);
    }
    
}
    
