import java.util.Scanner;

public class EjercicioC13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el resultado del lanzamiento del dado (1-6): ");
        int resultadoDado = scanner.nextInt();

      
        if (resultadoDado >= 1 && resultadoDado <= 6) {
        
            String caraOpuesta = obtenerCaraOpuesta(resultadoDado);

        
            System.out.println("El numero en la cara opuesta es: " + caraOpuesta);
        } else {
            
            System.out.println("ERROR: número incorrecto. Debe ser un resultado entre 1 y 6.");
        }
    }

    public static String obtenerCaraOpuesta(int resultadoDado) {
        switch (resultadoDado) {
            case 1:
                return "6";
            case 2:
                return "5";
            case 3:
                return "4";
            case 4:
                return "3";
            case 5:
                return "2";
            case 6:
                return "1";
            default:
                return "ERROR";
        }
    }
}