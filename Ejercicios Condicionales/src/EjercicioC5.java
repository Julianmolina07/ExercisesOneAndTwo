import java.util.Scanner;

public class EjercicioC5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el número base:");
        double base = scanner.nextDouble();
        
        System.out.println("Ingrese el exponente:");
        int exponente = scanner.nextInt();
        
        double resultado = calcularPotencia(base, exponente);
        
        System.out.println("El resultado es: " + resultado);
        
    }
    
    public static double calcularPotencia(double base, int exponente) {
        if (exponente > 0) {
            return potenciaPositiva(base, exponente);
        } else if (exponente == 0) {
            return 1;
        } else {
            return potenciaNegativa(base, -exponente);
        }
    }
    
    public static double potenciaPositiva(double base, int exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
    
    public static double potenciaNegativa(double base, int exponente) {
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return 1 / resultado;
    }
}
