import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la hora de salida (HH MM SS): ");
        int horaSalidaHH = scanner.nextInt();
        int horaSalidaMM = scanner.nextInt();
        int horaSalidaSS = scanner.nextInt();

   
        System.out.print("Ingrese el tiempo de viaje hasta la ciudad B (en segundos): ");
        int tiempoViaje = scanner.nextInt();

        int horaLlegadaHH = calcularHoraLlegada(horaSalidaHH, horaSalidaMM, horaSalidaSS, tiempoViaje);

        System.out.println("La hora de llegada a la ciudad B será aproximadamente a las " + horaLlegadaHH + " horas.");
    }

 
    public static int calcularHoraLlegada(int horaSalidaHH, int horaSalidaMM, int horaSalidaSS, int tiempoViaje) {
      
        int horaSalidaEnSegundos = horaSalidaHH * 3600 + horaSalidaMM * 60 + horaSalidaSS;

        
        int horaLlegadaEnSegundos = horaSalidaEnSegundos + tiempoViaje;

        
        int horaLlegadaHH = horaLlegadaEnSegundos / 3600;
        int horaLlegadaMM = (horaLlegadaEnSegundos % 3600) / 60;
        int horaLlegadaSS = horaLlegadaEnSegundos % 60;

        return horaLlegadaHH;
    }
}