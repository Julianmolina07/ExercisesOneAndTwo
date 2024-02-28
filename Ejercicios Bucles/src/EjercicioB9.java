

    import java.util.Scanner;

    public class EjercicioB9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros primos que desea mostrar:");
        int cantidadPrimos = scanner.nextInt();
        
        mostrarPrimos(cantidadPrimos);
        
    }
    
    public static void mostrarPrimos(int cantidadPrimos) {
        int contador = 0;
        int numero = 2; 
        
        while (contador < cantidadPrimos) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        }
    }
    
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}

