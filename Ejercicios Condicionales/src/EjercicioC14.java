 import java.util.Scanner;

public class EjercicioC14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el día de la semana (1 al 7): ");
        int diaSemana = scanner.nextInt();

   
        if (diaSemana >= 1 && diaSemana <= 7) {
      
            String nombreDia = obtenerNombreDia(diaSemana);

            System.out.println("El día correspondiente es: " + nombreDia);
        } else {
           
            System.out.println("ERROR: Número incorrecto. Debe ser un número entre 1 y 7.");
        }
    }

    public static String obtenerNombreDia(int diaSemana) {
        switch (diaSemana) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "ERROR";
        }
    }
}