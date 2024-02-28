import java.util.Scanner;

public class EjercicioC15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número del mes (1 al 12): ");
        int numeroMes = scanner.nextInt();

        if (numeroMes >= 1 && numeroMes <= 12) {
         
            int diasDelMes = obtenerDiasDelMes(numeroMes);

            System.out.println("El mes " + numeroMes + " tiene " + diasDelMes + " días.");
        } else {
 
            System.out.println("ERROR: Número incorrecto. Debe ser un número entre 1 y 12.");
        }
    }

    public static int obtenerDiasDelMes(int numeroMes) {
        switch (numeroMes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28; 
            default:
                return -1; 
        }
    }
}