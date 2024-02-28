import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la distancia entre los vehículos (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Ingrese la velocidad del vehículo A (km/h): ");
        double velocidadVehiculoA = scanner.nextDouble();

        System.out.print("Ingrese la velocidad del vehículo B (km/h): ");
        double velocidadVehiculoB = scanner.nextDouble();

        double tiempoEnMinutos = calcularTiempo(distancia, velocidadVehiculoA, velocidadVehiculoB);

        System.out.println("El vehículo más rápido alcanzará al otro en aproximadamente " + tiempoEnMinutos + " minutos.");
    }

    public static double calcularTiempo(double distancia, double velocidadVehiculoA, double velocidadVehiculoB) {
        double tiempoEnHoras = distancia / (velocidadVehiculoA - velocidadVehiculoB);
        return tiempoEnHoras * 60; 
    }
}