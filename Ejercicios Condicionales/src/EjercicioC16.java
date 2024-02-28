import java.util.Scanner;

public class EjercicioC16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete en kilogramos: ");
        double pesoPaquete = scanner.nextDouble();

        System.out.print("Ingrese la zona de destino (1-5):\n" +
                         "1. América del Norte\n" +
                         "2. América Central\n" +
                         "3. América del Sur\n" +
                         "4. Europa\n" +
                         "5. Asia\n" +
                         "Zona: ");
        int zonaDestino = scanner.nextInt();

        if (pesoPaquete <= 5) {
            
            double costoPorKilogramo;
            switch (zonaDestino) {
                case 1:
                    costoPorKilogramo = 24000;
                    break;
                case 2:
                    costoPorKilogramo = 20000;
                    break;
                case 3:
                    costoPorKilogramo = 21000;
                    break;
                case 4:
                    costoPorKilogramo = 10000;
                    break;
                case 5:
                    costoPorKilogramo = 18000;
                    break;
                default:
                    // Zona inválida
                    System.out.println("ERROR: Zona de destino no válida.");
                    return;
            }

       
            double costoTotal = pesoPaquete * costoPorKilogramo;

            System.out.println("El costo total por la entrega del paquete es de " + costoTotal + " euros.");
        } else {
         
            System.out.println("El paquete no puede ser transportado debido a su peso excesivo.");
        }
    }
}