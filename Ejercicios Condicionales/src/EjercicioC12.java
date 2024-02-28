import java.util.Scanner;

public class EjercicioC12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la duracion de la llamada en minutos:");
        int duracionLlamada = scanner.nextInt();
        
        System.out.println("Ingrese el día de la semana (1: Lunes, ..., 7: Domingo):");
        int dia = scanner.nextInt();
        
        System.out.println("Ingrese el turno de la llamada (M: Mañana, T: Tarde):");
        char turno = scanner.next().charAt(0);
        
        double costoLlamada = calcularCostoLlamada(duracionLlamada, dia, turno);
        
        System.out.println("El costo total de la llamada es: " + costoLlamada + " euros.");
        
    }
    
    public static double calcularCostoLlamada(int duracionLlamada, int dia, char turno) {
        double costoTotal = 0;
        
        if (duracionLlamada <= 5) {
            costoTotal += 1;
        } else if (duracionLlamada <= 8) {
            costoTotal += 1 + (duracionLlamada - 5) * 0.8;
        } else if (duracionLlamada <= 10) {
            costoTotal += 1 + 3 * 0.8 + (duracionLlamada - 8) * 0.7;
        } else {
            costoTotal += 1 + 3 * 0.8 + 2 * 0.7 + (duracionLlamada - 10) * 0.5;
        }
        
        if (dia == 7) {
            costoTotal *= 1.03; 
        } else {
            if (turno == 'M') {
                costoTotal *= 1.15; 
            } else {
                costoTotal *= 1.10; 
            }
        }
        
        return costoTotal;
    }
}
